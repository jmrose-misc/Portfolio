===========
Connections
===========

Citrix ICA
----------

The Citrix Receiver™ client allows a connection to Citrix XenAppView
Servers (formerly known as Presentation Server™). This Citrix client
also contains the necessary plug-in used for connecting to XenDesktop
via the thin client's local web browser.

The Connection Section
~~~~~~~~~~~~~~~~~~~~~~

.. figure:: C:/Documentation/WES7/source/media/Screenshot7.png
   :alt: Citrix ICA

   Citrix ICA

The first section displayed for a Citrix ICA session is Connection. This
form panel will already be expanded.

-  **Connection Type-** Select from either a *Local Area Network* or a
   *Wide Area Network* from the drop-down menu.
-  **Server Location-** Type in the IP address or hostname of the
   server.
-  **Protocol-** Select the appropriate protocol needed to connect to
   the server. There may be multiple methods available for connecting to
   the server:
-  **Server-** To connect to the desktop of the server, click the radio
   button called Server.
-  **Published Application-** To directly connect to a published
   application on the server, select the radio button called Published
   Application.

The Options Section
~~~~~~~~~~~~~~~~~~~

.. figure:: C:/Documentation/WES7/source/media/Screenshot8.png
   :alt: Citrix Options

   Citrix Options

-  **Window Size-** Select the type of window the session will display
   in.
-  **Full screen-** The session will take up the entire display.
-  **Fixed Size-** A fixed window size may be selected, such as 640x480,
   800x600, and 1024x768.
-  **Percentage Based-** A size may be selected that is based on the
   percentage of available desktop display, such as 25%, 50%, and 75%.
-  **Seamless-** When using the Published Application feature, selecting
   Seamless mode will launch applications directly on the desktop,
   without using the Citrix Window.
-  **Windows Colors-** Color depth options are 16 colors, 256 colors,
   16-bit, and 24-bit.
-  **Sound Quality-** Adjust the sound from Low, Medium, or High
   Quality.
-  **Citrix SLR (Speed Screen Latency Reduction) Options-** Enabling the
   following two options are usually only needed when high latency is
   occurring or poor bandwidth conditions exist.
-  **Mouse Click Feedback-** The mouse cursor will change to an
   hourglass as soon as a user performs a mouse click on an event and
   will wait for a response from the server before it changes back.
-  **Local Text Echo-** This option allows a user to see the character
   they type into their session on the screen, without this key press
   hitting the actual server at that time.
-  **Encryption-** Select the appropriate level of encryption to be used
   when connecting to this Citrix Server.
-  **Autostart-** Enable this checkbox to automatically launch this
   session each time the thin client completes its boot procedure.
-  **Use data compression-** In an environment where system and client
   resources are not a concern, data compression can be used to decrease
   the amount of data that must be sent across the network.
-  **Use disk cache for bitmaps-** Allows graphical objects to be stored
   in the local disk cache on the client device.

The Firewall Settings Section
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

-  **Use alternative address for firewall connection-** Mark this
   checkbox if the session needs to connect to the Citrix server's
   external IP address. The external address for the server is specified
   as the alternate address.
-  **Proxy Settings-** If the Citrix environment uses a proxy server, an
   appropriate type will need to be selected from the Proxy Type field.
   Enter the address of the proxy server and port number in the Proxy
   Address and Proxy Port fields, respectively.

The User Logon Section
~~~~~~~~~~~~~~~~~~~~~~

-  **User Name-** Specify the name of a user account to log on as. This
   is an optional field.
-  **Domain-** Specify the domain to log on to. This is an optional
   field.

The Application Section
~~~~~~~~~~~~~~~~~~~~~~~

-  **Application-** Specifies the path of the application on the Citrix
   server to be automatically launched when the connection is made. This
   is an optional field.
-  **Working Directory-** Specifies the working directory used for the
   application.

.. raw:: LaTeX

     \newpage
   
Internet Explorer Web Browser
-----------------------------

.. figure:: C:/Documentation/WES7/source/media/Screenshot6.png
   :alt: Internet Explorer

   Internet Explorer
The following section describes the steps for configuring the local
Internet Explorer web browser.

-  **Start URL-** Specifies the initial web page to appear when the
   browser is first launched.
-  **Enable Kiosk Mode-** Sets the web browser to kiosk mode, hiding
   navigation features and disabling the ability to exit.
-  **Autostart-** Enable this checkbox to automatically launch this
   session after the thin client completes its boot procedure.

.. raw:: LaTeX

     \newpage
   
RDP
---

The General Section
~~~~~~~~~~~~~~~~~~~

The first section displayed for an RDP® session, is named General. This
form panel will already be expanded.

.. figure:: C:/Documentation/WES7/source/media/Screenshot9.png
   :alt: RDP General

   RDP General

-  **Server Name-** Enter the hostname or IP address of the server.
-  **Port-** Enter the port number used in this connection.
-  **User Name-** Specifies the name of a user account to log in as.
   This is an optional field.
-  **Password-** The password that is associated with the specified user
   account that will be used for this session. This is an optional
   field.
-  **Domain-** Specifies the domain to log on to.

The Display Section
~~~~~~~~~~~~~~~~~~~

-  **Operate in full screen mode-** The RDP® session will take up the
   entire display and will not allow minimization.
-  **Operate in maximized window mode-** This option will display the
   session in a window. This window will allow minimizing and
   maximizing.
-  **Use specified screen size-** The session will launch in a fixed
   sized window, specified by the dimensions chosen in the dropdown list
   below. This window can only be minimized, the fixed size is the
   maximum size allowed.
-  **Color depth for this connection-** Select the desired color depth
   for this session.

The Local Resources Section
~~~~~~~~~~~~~~~~~~~~~~~~~~~

.. figure:: C:/Documentation/WES7/source/media/Screenshot10.png
   :alt: RDP Local Resources

   RDP Local Resources

-  **Sound Redirection Options-** By default, sound from the server will
   redirect to the local thin client. If no sound is to be sent to the
   local device, then select either the Do not play sound or Leave sound
   on the remote thin client radio buttons.
-  **Enable Microphone Redirection-** Enabling this option will allow a
   microphone to be used within the session, if the desktop supports
   audio input.
-  **Enable Multimedia Redirection-** This option allows multimedia
   devices to be used within the session.
-  **Enable Clipboard Redirection-** This option will allow items on the
   local desktop’s clipboard to be carried over to this desktop session.
-  **Enable Printer Redirection-** Mark this checkbox to redirect
   printing to a printer attached the local terminal. The name of the
   printer will need to be provided.
-  **Enable Client Drive Mapping-** Allows the user plug USB Flash
   Drives locally into the terminal and access the contents of the drive
   via the RDP® session.
-  **Enable Com Port Mapping-** Redirects serial devices on the thin
   client to the server.
-  **Enable Smartcard Support-** Specifies whether redirection of Smart
   Cards is permitted during server authentication.

+-------------+-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+
| **Note:**   | To correctly set up Printing, make sure the printer’s name matches what has been assigned in the Control Panel. This can be found in the Printer section, under System Settings.    |
+-------------+-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------+

The Start a Program Section
~~~~~~~~~~~~~~~~~~~~~~~~~~~

-  **Program path and filename-** Specifies the path of the application
   on the server to be automatically launched when the connection is
   made. This will launch the application in a window within the local
   desktop.
-  **Working Directory-** Specifies the working directory used for the
   application.

The RD Gateway Section
~~~~~~~~~~~~~~~~~~~~~~

-  **RD Gateway Usage-** Select whether RD Gateway will be used for this
   session, if it is available. The options available are Do not use,
   Always use, Only if direct connection cannot be made, or Use default
   settings.
-  **RD Gateway Host-** Enter the hostname for the RD Gateway server.
   Users may choose to Reuse RD Gateway Credentials if they wish to
   reuse their RD Gateway credentials to log in to the server as well.
-  **RD Gateway Credential Source-** This option selects the method in
   which the RD Gateway server will be accessed. Users may Ask for
   permissions (NTLM), Use smart card, or Select later if they can not
   or do not want to specify.
-  **RD Gateway Profile Method-** Specifies the working directory used
   for the application. Users may choose to Use default profile method
   or Use explicit settings.

The RemoteApp Section
~~~~~~~~~~~~~~~~~~~~~

Users may select from a Normal Session for a standard connection or a
RemoteApp Session to enable the RemoteApp services.

-  **Disable RemoteApp Support Checking-** This option may be used to
   bypass a check for RemoteApp support on a server. Disabling the
   support check is recommended for servers running older versions of
   Windows.
-  **Application Name-** The executable name of the application to be
   used.
-  **Application-** The location of the application. Drive redirection
   may need to be enabled in order for local files to open properly.
-  **Command Line-** Parameters to launch the application with. This is
   optional.
-  **Expand Commandline-** If parameters have been entered in the
   Command Line field, then this option may be enabled so that any
   environment variables can be expanded to include the values of the
   remote desktop. Optionally, disabling this option will only expand
   the values of the local desktop.
-  **Expand Working Directory-** Enabling this option will expand any
   environment variables in RemoteApp’s shell working directory to the
   remote desktop. Leaving this option disabled will only expand the
   values of the local desktop.

The Performance Section
~~~~~~~~~~~~~~~~~~~~~~~

-  **Connection Speed-** Specifies the RDP® Experience. As connection
   options in this dropdown box are changed, associated behaviors in the
   checkboxes below will be selected or deselected accordingly.
-  **Enable bitmap caching-** This option will allow common .bmp-based
   images from the session desktop to be stored on the local hard drive.
   Selecting this option may improve connection performance.
-  **Disable cursor from blinking-** Indicates that cursor blinking
   should be disabled during the session.
-  **Enable window manager's key bindings-** By default RDP® attempts to
   grab all keyboard input when it is in focus.
-  **Attach to the console of the server-** The session will connect to
   the console of the server (requires Windows® Server 2003 or newer).
-  **Enable RemoteFX-** Toggles whether or not the connection will use
   the RemoteFX® feature.

The Options Section
~~~~~~~~~~~~~~~~~~~

-  **Enable compression of the RDP DataStream-** In an environment where
   system and client resources are not capable, data compression can be
   used to decrease the amount of data that must be sent across the
   network.
-  **Autostart-** Enable this checkbox to automatically launch this
   session after the thin client completes its boot procedure.
-  **Restart-** Selecting this checkbox will cause any disconnected
   sessions to automatically restart.
-  **Enable CredSSP-** This option will enable CredSSP authentication
   for the session, if neccessary.

.. raw:: LaTeX

     \newpage
   
VMware Horizon View
-------------------

The VMware Horizon View client allows you to connect to a VMware server,
which in turn, provides the end-user with their own virtual desktop
session. The following section describes the basic steps for configuring
the View Client.

.. figure:: C:/Documentation/WES7/source/media/Screenshot11.png
   :alt: VMware Horizon View

   VMware Horizon View

-  **Server Address-** Enter the Hostname or IP address of the VMware
   Horizon View Broker.
-  **Credentials-** Specify the User Name and Password of the default
   user account.
-  **Domain-** Specifies the domain to log on to.
-  **Desktop Name-** The name of the desktop can be entered if a
   connection should always be made to the same desktop. If the field
   remains empty, then the user may be prompted to select an available
   desktop upon connecting to the server.
-  **Protocol-** Choose whether to connect to the server using the RDP
   or PCOIP protocol.
-  **Enable background on startup-** Selecting this option will cause
   the client to expand to fullscreen and lock the desktop layout to a
   single monitor, fullscreen display.
-  **Desktop Layout-** Choose the desktop option that best suits the
   display setup. If Enable background on startup is selected, this will
   lock to a single monitor, fullscreen display.
-  **Autostart-** Enable this checkbox to automatically launch this
   session after the thin client completes its boot procedure.

Troubleshooting Tips for VMware Horizon View Connection
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

-  If the session is set to full screen but the display covers only a
   fraction of the entire screen, then the allocated RAM for the virtual
   desktop may need to be set a little higher.
-  If certain features like foreign key maps, CD-ROM, USB stick, or
   printer redirection are not passing through to the virtual desktop
   session, check if the VM is at the correct version. The latest agent
   software executables can be downloaded at `the VMware
   website. <http://www.vmware.com/downloads>`__
-  If USB flash drives are to be used within the session, it is best to
   use sticks formatted in FAT or NTFS. Long delays sometimes occur when
   using flash drives formatted in FAT32. Other USB troubleshooting tips
   can be found at `the VMware
   site. <http://kb.vmware.com/kb/1026991>`__
