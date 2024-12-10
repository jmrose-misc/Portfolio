# 2023 Project Retrospective #

| Author        | Jessica Rose                                           |
| ------------- |:------------------------------------------------------:|
| Team          | Service Operations                                     |
| ------------- |:------------------------------------------------------:|
| Tools Used    | Scriptrunner for Confluence, Apache Groovy, Javascript |

## Overview ##

This particular sample within this repo is a key project of mine from 2023. At 
the time, we were seeking ways to maintain currency in our Operations Center 
documentation. By communicating with my team within Service Operations, we 
determined that any automation we wrote would need to target documents that 
fell under specific health states and take action from there. This particular 
script focuses on "Stale" docs, but we also had scripts for other health states.

As a bonus, this would give the team more data to collect regarding document 
health and usage, as part of a larger reporting effort for the department.


## What Does This Script Do? ##

This is a Scriptrunner Event Listener, deployed within Confluence, that handles 
communication whenever a workflow state change event occurs. The code checks to 
verify that a document has become "Stale". "Stale" documents are pages that have 
received no edits or attention within a year. The script then reads the document 
container page to determine the primary points of contact for the related service, 
using data parsed from the Jira Insight API. These contacts then receive an email, 
informing their team on the state of the document and advising on next steps to 
take.


## Key Successes ##

- The overall project established a workflow that was easy to follow and allowed 
information to become accessible.
- The implementation of new archival processes reduced the bloat that came from 
maintaining outdated and unused pages.
- We reduced toil on the Service Operations team by automating the documentation 
maintenance outreach process.
- One key goal we achieved was to encourage input from SMEs by providing guidance 
to update or archive documentation.
- We created new metrics to help expand on documentation health and usage reports.


## What Went Well ##

- Tribal knowledge had been a larger issue for a while now. By reaching out to 
teams and providing actions to take for unhealthy documents, we encouraged SMEs 
to provide the input needed to keep key documents current and reliable.
- This script, along with the workflow it supported, helped to maintain a single 
source of truth with our documentation, by enforcing review processes and 
establishing archiving standards. 


## What Went Wrong and How We Resolved It ##

- During the development process, the team ran into an issue where events were 
failing to trigger properly. I worked closely with the Adaptivist support team, 
the Appfire support team, and our own Atlassian administrators to pinpoint the 
root cause and find a solution. In the end, I discovered that one of our servers 
was not correctly time-synced, leading to incorrect timing issues and trigger 
failures. Once the Atlassian team corrected these issues, we had smooth sailing!
- During the initial launch period, an issue occurred that caused the script to 
misread a trigger, resulting in a team getting mass-emails on pages that did not 
need updates. By including myself in the copies of emails sent, I was able to 
catch that points of contact were receiving extraneous emails. I caught the 
issue early and temporarily disabled the script to correct the bug and prevent more 
spam. I also immediately reached out to the team to apologize for the mistake, 
while explaining the issue and its root cause. They were appreciative of the 
transparency, and more appreciative about not getting spammed!


## Next Steps and Considerations ##

This project paved the way to collect more data on the health and usage of our 
operational documentation. The data here would feed into reports that I was 
generating within Tableau. Unfortunately, due to layoffs, these next steps 
may be on stand-still.


## Additional Notes ##

The series of scripts that I wrote for this project were my first foray into 
script writing in general. It was a unique experience to learn something that 
benefited the organization and it was a delight to develop this project. As I'm 
currently looking to transition my career towards production and project 
management, I hope that this retrospective gives a better insight on where my 
head is at and just what I'm capable of.
