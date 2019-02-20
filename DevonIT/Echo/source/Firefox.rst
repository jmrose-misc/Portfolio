Firefox
-------

.. index::
   single: Firefox

Firefox is a local web browser. This connection can not be applied to Windows-based operating systems.

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

Start URL
    The URL that Firefox will automatically open upon starting. 
Autostart
    Allows the administrator to cause a connection to start as soon as the 
    device is powered on. 
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

Proxy Settings
~~~~~~~~~~~~~~

Select a Proxy Setting
    Allows users to select from the various proxy setting options. 

Kiosk Mode
~~~~~~~~~~

Show Menubar
    Determines whether or not the menubar is displayed to the user. 
Use Appmenu Button
    If the menubar is enabled, an appmenu button may be available for users who 
    wish to access non-standard features. This is a legacy option to support 
    older versions of the application. 
Enable Kiosk Mode
    Toggles Kiosk Mode on or off. When in Kiosk mode, the user is only able to 
    access a limited number of the options Firefox contains. 
Show Toolbar
    Toggles the Firefox toolbar on or off.
Autohide Navbar in Kiosk
    Toggles whether or not the user can access the Firefox navigation bar. 
Allow Quit
    Determines whether or not the user can quit Firefox.

Advanced Options
~~~~~~~~~~~~~~~~

Enable Javascript
    Toggles javascript capabilities for Firefox.
Enable Popup Blocker
    Toggles the popup blocker abilities of Firefox.