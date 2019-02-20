JavaWS
------

.. index::
   single: JavaWS

JavaWS connects to Citrix desktops through the JavaWS Client.

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

Server URL
    The name or IP address of the JavaWS server.
Autostart
    Causes the connection to start as soon as the device is powered on. 
Auto Restart
    Causes the connection to be restarted if it is closed. This is useful for 
    administrators that wish to limit the ability of a user to access the 
    device. 
Disable Desktop
    This will disable desktop access, ensuring that users only access this 
    specific workstation with the specific credentials applied to the 
    connection. Logging off from the server will power off the thin client, and 
    powering on the thin client will bypass the operating system's desktop and 
    immediately log in to the server. This feature is not supported for 
    Windows-based operating systems. 
