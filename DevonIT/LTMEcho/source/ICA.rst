ICA
---

.. index::
   single: Citrix ICA

The ICA protocol is used to establish connections to Citrix servers.

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

Connection
~~~~~~~~~~

Connection Type
    Allows the connection setting to be changed between a local area network 
    and a wide area network. 
Server Location
    The IP address of the ICA server.
Protocol
    The type of protocol being used to connect to the ICA server. 
Session Type
    Allows the administrator to select if the connection should be a server 
    connection or a published application. 
Name
    The name of the server or published application desired for this 
    connection. 

Options
~~~~~~~

An administrator can use the dropdown menus in the Options pane to select a 
number of different display and audio features to customize the connection.

Autostart
    Allows the administrator to cause a connection to start as soon as the 
    device is powered on. 
Auto Restart
    Causes the connection to be restarted if it is closed. This is useful for 
    administrators that wish to limit the ability of a user to access the 
    device. 
Use data compression
    Depending on network latency, utilizing datastream compression can improve 
    overall communication performance. 
Use disk cache for bitmaps
    Determines whether or not the disk cache is used to when processing 
    bitmaps. 
Disable Desktop
    This will disable desktop access, ensuring that users only access this 
    specific workstation with the specific credentials applied to the 
    connection. Logging off from the server will power off the thin client, and 
    powering on the thin client will bypass the operating system's desktop and 
    immediately log in to the server. This feature is not supported for 
    Windows-based operating systems.  

Firewall Settings
~~~~~~~~~~~~~~~~~

Use alternate address for firewall connection
    If checked, allows users to use the Proxy Type options. 
Proxy Type
    Allows users to choose between SOCKS or HTTPS for the firewall proxy. 
Proxy Address
    The IP address of the proxy server.
Proxy Port
    The proxy port number to be used for this connection.

User Logon
~~~~~~~~~~

Username
    The default username for the ICA connection. Leaving this field blank will 
    allow those that use this connection to log in with their desired username 
    when they connect. 
Domain
    The domain name of the user being logged in.

Application
~~~~~~~~~~~

Application
    Entering the path and filename of a program in this field makes it so that 
    when this connection is used, only that specific program can be used in the 
    ICA session. This field does not need to be filled out if the session type 
    is a published application. 
Working Directory
    Can be used in conjunction with Application to specify the specific 
    directory where the file can be found. 