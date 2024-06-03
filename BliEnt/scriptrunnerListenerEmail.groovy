import com.comalatech.confluence.states.event.PageStateTransitionEvent
import com.atlassian.applinks.api.ApplicationLinkService
import com.atlassian.applinks.api.application.jira.JiraApplicationType
import com.atlassian.dragonfly.spi.JiraIntegrationSetupHelper
import com.atlassian.diagnostics.Issue
import com.atlassian.sal.api.component.ComponentLocator
import com.atlassian.sal.api.net.Response
import com.atlassian.sal.api.net.ResponseException
import com.atlassian.sal.api.net.ResponseHandler
import com.onresolve.scriptrunner.runner.customisers.WithPlugin
import com.onresolve.scriptrunner.runner.customisers.PluginModule
import groovy.json.JsonBuilder
import groovy.json.JsonSlurper
import groovy.json.JsonOutput
import com.atlassian.confluence.pages.Page
import com.atlassian.confluence.pages.PageManager
import com.atlassian.sal.api.component.ComponentLocator
import com.atlassian.confluence.macro.xhtml.XhtmlMacroManager
import org.jdom.Attribute
import com.rometools.rome.io.impl.PluginManager
import com.atlassian.confluence.core.Addressable
import com.atlassian.confluence.xhtml.api.Link
import java.lang.String
import com.atlassian.applinks.api.ApplicationLink
import static com.atlassian.sal.api.net.Request.MethodType.POST
import static com.atlassian.sal.api.net.Request.MethodType.GET
import com.atlassian.confluence.setup.settings.SettingsManager
import com.onresolve.scriptrunner.runner.rest.common.CustomEndpointDelegate
import com.riadalabs.confluence.plugins.insight.*
import com.onresolve.scriptrunner.remote.RemoteControl
import com.atlassian.confluence.xhtml.api.XhtmlContent
import com.atlassian.mail.Email
import com.atlassian.mail.MailException
import com.atlassian.mail.server.SMTPMailServer
import com.atlassian.plugin.util.ContextClassLoaderSwitchingUtil
import com.atlassian.confluence.mail.ConfluenceMailServerManager
import com.atlassian.confluence.user.UserAccessor
import com.atlassian.confluence.user.ConfluenceUser
import com.atlassian.confluence.user.AuthenticatedUserThreadLocal

@WithPlugin('com.comalatech.workflow')
@WithPlugin("com.riadalabs.confluence.plugins.insight-confluence")
@WithPlugin("com.riadalabs.jira.plugins.insight")

// grabs the page the event occurs on
PageStateTransitionEvent workflowEvent = event as PageStateTransitionEvent
def page = workflowEvent.getPage() as Page
def label = page.getLabels()
def parent = page.getParent()

// logs for awareness
log.warn(workflowEvent.getState().state)
log.warn(event)
log.warn(label)



UserAccessor userAccessor = ComponentLocator.getComponent(UserAccessor)

// get OpsDocs user
ConfluenceUser OpsDocs = userAccessor.getUserByName('<Blizzard account>') // the account to spoof, needed to assess API information

// remember original user
ConfluenceUser originalUser = AuthenticatedUserThreadLocal.get()

try{
   // switch to admin-user
   AuthenticatedUserThreadLocal.set(OpsDocs)

   log.warn page.getContentId()

    // gets the service runbook's landing page so we can grab the service name
    def pageManager = ComponentLocator.getComponent(PageManager)
    def appLinkService = ComponentLocator.getComponent(ApplicationLinkService)
    def appLink = appLinkService.getPrimaryApplicationLink(JiraApplicationType)
    def applicationLinkRequestFactory = appLink.createAuthenticatedRequestFactory()
    def adult = pageManager.getPage(parent.parent.id)
    def xhtmlContent = ComponentLocator.getComponent(XhtmlContent)
    def pageString = page.bodyAsString
    def adultString = adult.bodyAsString

    // grabs the service name from the Confluence Insight macro because service name and CMDB name aren't always the same
    def completeServiceName
        if(adultString.contains("Name =")){
        def serviceName = adultString.split("Name =")[1]
        if(adultString.contains("22,")){
            serviceName = serviceName.split("22,")[0]
            serviceName = serviceName.split('&quot;')[1]
            completeServiceName = serviceName
            //return completeServiceName  // this variable is what you should be able to use to call the Insight API
            }
        } else {
        completeServiceName = "Indeterminate" // for cases where there is not an applicable CMDB item (i.e Process Runbooks)
        //return completeServiceName // commented out as this was only present for testing purposes
        }
    // plugs the CMDB service name into the API link
    SettingsManager settingsManager = ComponentLocator.getComponent(SettingsManager)
    String baseUrl = settingsManager.getGlobalSettings().getBaseUrl()
    def applicationLinkRequestFactory2 = appLink.createAuthenticatedRequestFactory()
    def getCMDB = applicationLinkRequestFactory2.createRequest(GET, "<API link to Insight service data>")
    
    def handler = new ApplicationLinkResponseHandler<Map>() {
        @Override
        Map credentialsRequired(Response response) throws ResponseException {
            return null
        }
    
        @Override
        Map handle(Response response) throws ResponseException {
            assert response.statusCode == 200
            new JsonSlurper().parseText(response.getResponseBodyAsString()) as Map
        }
    }
    
    // parses Insight JSON for the service's Points of Contact list
    def sessionDetails = getCMDB.execute(handler)
    log.debug("Making the request as: " + sessionDetails["name"])
    def json_str = JsonOutput.toJson(sessionDetails)
    def jsonSlurperCMDB = new JsonSlurper()
    def cfg = jsonSlurperCMDB.parseText(json_str)
    assert cfg instanceof Map
    def contacts = cfg.objectEntries.attributes.objectAttributeValues.displayValue[0][5][0]



    def emailBody = 
    """
     <head>
        <style>
        .center {
          display: block;
          margin-left: auto;
          margin-right: auto;
          width: 50%;
        }
        .styled-table {
            border-collapse: collapse;
            margin: 25px 0;
            font-size: 0.9em;
            font-family: sans-serif;
            min-width: 400px;
            box-shadow: 0 0 20px rgba(0, 0, 0, 0.15);
        }

        .styled-table thead tr {
            background-color: #4777C8;
            color: #ffffff;
            text-align: left;
        }

        .styled-table th,
        .styled-table td {
            padding: 12px 15px;
        }

        .styled-table tbody tr {
            border-bottom: 1px solid #4777C8;
        }

        .styled-table tbody tr:nth-of-type(even) {
            background-color: #f3f3f3;
        }

        .styled-table tbody tr:last-of-type {
            border-bottom: 2px solid #4777C8;
        }

        </style>
     </head>
     <body> 
        <img src="<Logo Image>" class="center">
        <br>
        Greetings, team.
        <br>
        <br>
        The Confluence page <a href="$baseUrl$page.urlPath">${page.title}</a> has become outdated and requires review to remain current. You are recieving this email because you are a primary point of contact for the service this documentation relates to.
        <br>
        Please discuss among your team possible actions to take for this document.
        <br>
        <table class="styled-table">
        <thead>
        <td></td>
        <td></td>
        </thead>
        <tbody>                 
        <tr>                     
        <td>If this document is still current and requires no updates, open the Workflow Status Menu. From the Status Dropdown Menu, select "Published" and click "Submit". The document is then deemed current.</td>                                   
        <td><img src="<Transitioning image>"></td>
        </tr>                   
        <tr>        
        <td colspan=2>If the document needs updates to stay relevant, edit the document and make the neccessary changes. The updated document then automatically transitions to "Published".</td>
        </tr>
        <tr>
        <td>If the document is determined to be deprecated, then remove the {{stale}} label and apply the {{archive}} label. The page will move to the archives upon the next document health cycle, run every Monday.</td>                                     
        <td><img src="<Archiving image>" border></td>            
        </tr>                    
        <tr>       
        <td colspan=2>If no actions are taken within 30 days, the document will transition to a "Warning" state. A Jira ticket will be created for the Primary Support Group.</td>
        </tr>
        </td>
        </tbody>
        </table>  
     </body>
        <br>
        <br>
        Please reach out to the OpsCenter on Slack at <a href="<OpsCenter Slack link">#ask-service-operations</a> if you have any questions or require further assistance.
        <br>
        <br>
        Regards,
        <br>
        The OpsCenter Service Operations Team
    """


    def confluenceMailServerManager = ComponentLocator.getComponent(ConfluenceMailServerManager)

    SMTPMailServer mailServer = confluenceMailServerManager.getDefaultSMTPMailServer();

    if (workflowEvent.getState().state == "Stale"){ 
        if (mailServer) {

            Email email = new Email(contacts); // our Points of Contact as defined from the Insight JSON above
            email.setSubject("Notice: ${page.title} is expiring and needs review");

            email.setBody(emailBody);
            email.setMimeType('text/html');
            mailServer.send(email);

            log.warn contacts
            log.warn emailBody

        } else {

        throw new RuntimeException("Failed to Send Mail.");
        }
    } else {
        return
    }
}catch (Exception e){
   // 
}finally{
   // switch back to original user
   AuthenticatedUserThreadLocal.set(originalUser)
}
