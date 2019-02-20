VMware Horizon View
-------------------

.. index::
   single: VMware Horizon View

VMware Horizon View connections are used for connecting to VMware Servers.

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
    The URL (or IP address) of the VMware Horizon View server.
Username
    The default username for the VMware Horizon View session. Leaving this 
    field blank will allow those that use this connection to log in with their 
    desired username when they connect. 
Password
    Setting a password in this field, combined with entering a username above, 
    will enable automatic login as the specified user. 
.. CAUTION::
   Passwords cannot be deleted once they have been applied to a connection. If
   the password field needs to be emptied, a new connection must be made. 
Domain
    The domain name of the user being logged in. 
Desktop Name
    The name of the desktop that the user will connect to. If no desktop is 
    specified, the desktop inventory will display upon user login and a 
    selection can be made there. 
Enable Background on Startup
    This will allow VMware Horizon View to run in the background on start up. 
    This is a legacy option available for devices that are running older 
    versions of the agent. 
Protocol
    The protocol for the server that is being accessed. VMware Horizon View 
    supports RDP and PCOIP protocols. 
Desktop Layout
    The window layout for the VMware Horizon View connection. This option 
    offers a selection of preferred window-mode sizes and a multi-monitor 
    option for extended desktops. 
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

Options
~~~~~~~

Disable Menubar
    The VMware Horizon View menu bar will be hidden from the desktop. 
Run Once
    This will close the VMware Horizon View client completely upon logging out 
    or disconnecting from the server, rather than returning users to the 
    desktop selection options of the client. 
Enable kiosk login mode
    A kiosk-based login mode will be enabled. This option will need to be 
    enabled server-side in order to function. 
Lock the server URL field
    This option prevents users from changing the server or selecting a 
    different server from the client's server selection menu. 
	
Start a Program
~~~~~~~~~~~~~~~

Application Name
    The name of the application that will be run upon server login. 
Application Size
    The window layout for the application that will be run. This option offers 
    a selection of preferred window-mode sizes and a multi-monitor option for 
    extended desktops. 