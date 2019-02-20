=====================
Using the Thin Client
=====================

Customizing the Thin Client
---------------------------

This section details how to change some of the options on the thin
client to fit any home or business requirements.

Disabling the Automatic Log-In
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

1. Holding down the **Windows** button, press <**R**> to access the
   Run: dialogue box. Enter "*control userpasswords2*" (without
   quotations).
2. Check the box that says **Users must enter a user name and password
   to use this computer**. Select **Administrator account**. Press
   **Apply** to save all changes.
3. After the initial boot-up, or when booting up after using the
   re-imaging utility, the thin client will display the Windows Embedded
   desktop, taskbar, and system tray.
   
Sleep Mode
~~~~~~~~~~

By default, WES7 will enter sleep mode after 25 minutes of inactivity. While in 
sleep mode, no management actions via LTM can be taken, unless the thin client is 
woken up by LTM's Wake-on-LAN option or if the thin client is woken up with a 
manual action (keyboard button press, mouse click, etc.).

Thin Client Options
-------------------

Connections
~~~~~~~~~~~

The thin client has the ability to connect to remote servers using
several types of protocols. The Remote Desktop client uses the RDP
protocol and allows connectivity to Microsoft Windows Terminal Servers.
The Citrix ICA client is used to establish connections to the Citrix Xen
servers via Citrix Online Plug-in. The VMware Horizon View client allows
connectivity to a VMware Horizon View server, which provides end-users
with an individualized virtual desktop session. Lastly, Internet
Explorer may be used to surf the web. This can be used for several
purposes:

-  Connect to web applications; e.g., a webmail server.
-  Connect to a connection broker interface; e.g., Citrix Online
   Plug-in.

System Settings
~~~~~~~~~~~~~~~

These are the thin client's display, sound, keyboard, mouse, printer,
and date/time configurations. The **Thin Client Control Panel** also offers the
ability to set a password for the thin client, as well as change the
local disk settings (See **Using the FBWF**).

USB Permissions
~~~~~~~~~~~~~~~

It is possible to enable or disable external USB devices from being used 
on the thin client. This can be done for a variety of reasons, such as user 
preference or for security purposes. To set the USB Permissions:

1. Log in to the desktop as an administrator. Open the **LTM Control 
   Panel**.
2. Access the **USB Permission** page. By default, every USB Permission 
   is enabled for use.
3. Select a check mark to allow or restrict the level of access that a 
   USB device may have within the operating system. Click on the **Apply**
   button to save any changes made.
4. The thin client will need to be rebooted in order for any changes to take 
   effect. Changes made to USB Permissions will apply to all accounts.

.. CAUTION:: 
   Disabling Human Interface Devices will disable USB keyboard and mouse input. Confirm that the thin client has alternate device ports before disabling this setting.

LTM Agent System Information
----------------------------

LTM Management
~~~~~~~~~~~~~~

This displays the current status and information of the LTM Management
server that the thin client is currently associated with.

-  **Management Status** displays when the thin client is being managed
   by an LTM server.
-  **Management Server** displays the current address of the LTM server.
-  **Change Management Server** allows the LTM server to be changed.
-  **UUID** displays the current UUID assigned to the thin client.

Network Information
~~~~~~~~~~~~~~~~~~~

This displays information about the current network connection.

-  **IP Address** displays the current IP address assigned to the thin
   client.
-  **MAC Address** displays the current MAC address assigned to the thin
   client.
-  **Hostname** displays the named assigned to the thin client.
-  **Network Tools** allows a diagnostics test with the network
   connection to run and check on the current status of the network
   connection itself.

System Information
~~~~~~~~~~~~~~~~~~

This displays information regarding the thin client, as well as
information about the operating system.

-  **Operating System** displays the name of the image or operating
   system that is in use.
-  **Processor** displays the processor that the thin client is using.
-  **Memory** displays the total storage memory of the thin client.
-  **DOM size** displays the total storage capacity of the thin client.
-  **Hardware Model** displays the name of the thin client in use.

.. figure:: C:/Documentation/WES7/source/media/Screenshot12.png
   :alt: System Information
