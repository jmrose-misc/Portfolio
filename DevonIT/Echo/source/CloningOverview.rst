Cloning Overview
----------------

The Management Appliance is able to clone the following types:

-  **Connections** - Devices have the ability to connect to remote
   servers utilizing various types of protocols. The RDP® protocol is
   used to connect to Microsoft® Terminal Servers. The ICA® and
   XenAppView® protocols are used to establish connections to Citrix®
   servers. The VMware® Horizon View™ protocol allows a user to connect
   to a VMware Horizon View Server. Administrators may use the
   Management Appliance to clone these types of connections from one
   device, store them within their connections database, and then apply
   them to other devices.

-  **Device Settings** - Device settings are the permissions, appearance,
   display, input, persistence, sound, printer, and time configurations
   for that particular device. Administrators may use the Management
   Appliance to clone these settings from one device, store them within
   the device settings database, and then apply them to other devices.

-  **Profiles** - Profiles are a way to combine multiple choices from
   both the **Device Settings** and **Connections** configurations to
   create an arrangement of options tailored to the needs of the user.
   Administrators may use the Management Appliance to clone specific
   profiles to be applied to whichever devices require these combined
   settings.

-  **Disk Images** - The fourth cloning option is the ability to clone
   the entire disk image of a device. A disk image includes everything
   that is stored on the DOM on that device, including the operating
   system itself. This does not include BIOS settings that have been
   saved elsewhere. Disk image clones are inventoried and managed by
   name within the disk images database, but are physically stored on an
   ``nfs://``, ``cifs://``, ``http://``, ``https://``, or ``ftp://`` server 
   on the local area network.
   
When a clone is created, it will be included in its respective inventory 
table within the Management Appliance.  If more than one item of the same 
type is cloned with the same name, the Management Appliance will include 
increments to the names as the clones are created.

.. raw:: LaTeX

     \newpage