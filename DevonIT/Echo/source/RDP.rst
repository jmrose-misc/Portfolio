RDP
---

.. index::
   single: RDP

The RDP protocol is used to connect to Microsoft Windows Device Servers.

Basic Information
~~~~~~~~~~~~~~~~~

Name
    The name of the connection. The name is a required field when a new 
    connection is created. 
Local Display Name
    The local display name is what the connection will be labeled with on the
    device. This field is required in order to create a new connection. 
Description
    A description such as "Kiosk Connection" or "Presentation Connection." The
    description field is optional, but it is recommended to use descriptions to
    help organize connections.  
Protocol
    The protocol used in the connection is displayed here. 

General
~~~~~~~

Server Name
    The name or IP address of the RDP server.
Port
    The port used to access the RDP server.
Username
    The default username for the RDP server. Leaving this field blank will 
    allow those who use this connection to log in with their desired username 
    when they connect. 
Password
    Setting a password in this field, combined with entering a username above, 
    will enable automatic login as the specified user. This is a legacy option 
    to ensure compatibility with older devices. 
Domain
    The domain name of the user being logged in.

Display
~~~~~~~

Display
    The three options listed allow the administrator to set a default display 
    setting for users using this connection. If no option is specified in Echo, 
    the session opens in full screen mode. 
Color depth for this connection
    Allows the administrator to specify a desired color depth for those using 
    this connection. 
Use All Monitors
    This option, when selected, will allow multi-monitor usage for the RDP 
    connection. 

Local Resources
~~~~~~~~~~~~~~~

Sound Settings
    Creates a default state for sounds to play through this connection. 
Other Settings
    The administrator can enable a variety of different functions to be 
    available to those using this connection by checking the boxes next to the 
    desired settings. 

Start a Program
~~~~~~~~~~~~~~~

Program path and filename
    Entering the path and filename of a program in this field makes it so that 
    when this connection is used, only that specific program can be used in the 
    RDP session. 
Working Directory
    Can be used in conjunction with Program path and filename to specify the 
    specific directory where the file can be found. 
Maximize Program
    Runs the program at maximum size.

RD Gateway
~~~~~~~~~~

RD Gateway Host
    The host that will be used for RD Gateway.
RD Gateway Credential Source
    The method of login access for RD Gateway. You can select password entry, 
    smartcard access, or have the credential source selected on login. 
RD Gateway Profile Method
    The profile method that will be used for RD Gateway. You can select a 
    default mode or use specific settings. 
RD Gateway Usage
    The usage for RD Gateway. You can select always, only if direct connection 
    is unavailable, or just use default settings. 
Reuse RD Gateway Credentials
    When enabled, this will allow the RD Gateway credentials to be reused. 

RemoteApp
~~~~~~~~~

Application Name
    Sets the name of the Application.
Application
    The filename of the Application to be used.
Command Line
    Enables command line use.
Expand Command Line
    Expands the Command Line.
Expand Working Directory
    Expands the working directory.
Application File
    The filepath for the application.
RemoteApp Mode
    Set the session for RemoteApp. Users can select between a normal session 
    and a RemoteApp session. 
Disable RemoteApp Support Checking
    When selected, this will disable RemoteApp Support Checking. 

Performance
~~~~~~~~~~~

Experience Options
    This allows adjustments to various settings to suit the user experience 
    desired. These options will determine the connection speed of the network. 
Enable bitmap caching
    This option will allow common .bmp-based images from the session desktop to be 
    stored on the local hard drive. Selecting this option may improve connection 
    performance.
Disable cursor from blinking
    Indicates that cursor blinking should be disabled during the session.
Scale desktop when resizing session window
    If the connection session window can be resized, this will allow the session 
    desktop to scale with the window resizing.
Enable window manager's key bindings
    By default RDP® attempts to grab all keyboard input when it is in focus.
Display the connection bar
    A connection bar will display at the top when a session is active. This connection 
    bar displays the connection's address and offers other options.
Attach to the console of the server
    The session will connect to the console of the server (requires Windows® Server 
    2003 or newer).
Enable RemoteFX
    Toggles whether or not the connection will use the RemoteFX® feature.
Enable font smoothing
    This will enable ClearType for the RDP session, making font appear smooth and 
    more clear.

Options
~~~~~~~

Enable compression of the RDP datastream
    Depending on network latency, utilizing datastream compression can improve 
    overall communication performance. 
Autostart
    Causes the connection a connection to start as soon as the device is powered 
    on. 
Auto Restart
    Causes the connection to be restarted if it is closed. This is useful for 
    administrators that wish to limit the ability of a user to access the 
    device. 
Restart
    When enabled, the session will restart if the server is disconnected. 
Enable CredSSP
    This will enabled the Security Support Provider for the server. This option 
    is enabled by default. 
Disable Desktop
    This will disable desktop access, ensuring that users only access this 
    specific workstation with the specific credentials applied to the 
    connection. Logging off from the server will power off the thin client, and 
    powering on the thin client will bypass the operating system's desktop and 
    immediately log in to the server. This feature is not supported for 
    Windows-based operating systems. 
