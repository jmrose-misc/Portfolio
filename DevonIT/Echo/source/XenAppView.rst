XenAppView
----------

.. index::
   single: XenAppView

The XenAppView protocol is also used to establish connections to Citrix 
servers.

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

General Settings
~~~~~~~~~~~~~~~~

Server Address
    The URL or IP address of the XenAppView server.
Username
    The default username for the XenApView connection. Leaving this field blank 
    will allow those that use this connection to log in with their desired user 
    name when they connect. 
Domain Name
    The domain name of the user being logged in.
Autostart
    Allows the administrator to cause a connection to start as soon as the 
    device is powered on. 
Auto Restart
    Causes the connection to be restarted if it is closed. This is useful for 
    administrators that wish to limit the ability of a user to access their 
    desktop. 
Launch in Fullscreen
    Launches the desktop in XenAppView's fullscreen mode.
Disable Desktop
    This will disable desktop access, ensuring that users only access this 
    specific workstation with the specific credentials applied to the 
    connection. Logging off from the server will power off the thin client, and 
    powering on the thin client will bypass the operating system's desktop and 
    immediately log in to the server. This feature is not supported for 
    Windows-based operating systems.  