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
and date/time configurations. The **LTM Control Panel** also offers the
ability to set a password for the thin client, as well as change the
local disk settings (See :ref:`useFBWF-reference`).

USB Permissions
~~~~~~~~~~~~~~~

It is possible to enable or disable external USB devices from being used 
on the thin client. This can be done for a variety of reasons, such as user 
preference or for security purposes. To set the USB Permissions:

1. Log in to the desktop as an administrator. Open the **LTM Control Panel**.
2. Access the **USB Permission** page. By default, every USB Permission 
   is enabled for use.
3. Select a check mark to allow or restrict the level of access that a 
   USB device may have within the operating system. Click on the **Apply**
   button to save any changes made.
4. The thin client will need to be rebooted in order for any changes to take 
   effect. Changes made to USB Permissions will apply to all accounts.

.. CAUTION:: 
   Disabling Human Interface Devices will disable USB keyboard and mouse input. Confirm that the thin client has alternate device ports before disabling this setting.

.. raw:: LaTeX

     \newpage