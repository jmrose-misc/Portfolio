Cloning Device Settings
-----------------------

The following device settings to be cloned:

-  **Permissions** - The Agent Password that has been assigned. If a
   password is set, Control Panel navigation will be restricted for
   non-password holders.

-  **Appearance** - The way in which icons are displayed, sorted by
   either connection type or alphabetically by the connection’s assigned
   name. This is a DeTOS-only setting.

-  **Display** - The screen resolution, color depth, and refresh rate of
   the primary display device.

-  **FBWF** - The settings for persistence that have been chosen
   for that device. This is a WES-only setting. 
    
-  **Input** - The keyboard, mouse settings, and locale of the device.

-  **Sound** - Settings for the master volume and mute control.

-  **Storage** - The storage option settings for that device. This only clones 
   the **Storage Options**, and does not clone the persistence settings. This 
   is a DeTOS-only setting.

-  **Time** - Settings for the time zone.

-  **USB** - The USB permissions granted to the device.

-  **Printers** - Settings for a device’s attached printer. This setting
   will not appear if the device does not have a printer plugged in with
   its properties established.

   .. NOTE::
      Certain settings are only available to specific operating systems, and 
      cannot have their clone applied to unsupported systems.

How to Clone Device Settings
~~~~~~~~~~~~~~~~~~~~~~~~~~~~

#. From the **Devices** inventory table, select the device from which
   settings will be cloned from.

#. Click the **Options** button at the top of the inventory panel. In
   the dropdown menu, go to **Clone** and click on **Device Settings**.

#. A **Clone Device Settings** dialogue box will open with three fields
   to fill out:

   -  **Name** - Enter a name for this clone. This name will be the name
      that Echo refers to for these settings in the future.

   -  **Description** - Enter a short description for this clone.

   -  **Device Settings** - Select the type of settings that will be
      cloned. Multiple options from the dropdown menu may be selected,
      and the selected modules will appear in a list within the **Device
      Settings** field. When cloning multiple device settings at once,
      these settings will be bundled together in the **Device Settings**
      table afterwards.

#. Click the checkmark in the top right corner of the **Clone Device
   Settings** dialogue box to create the clone.

#. The **Device Settings** tab will display the recently cloned
   connection entries in the inventory table.

Applying Settings to a Device
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

#. From the **Devices** inventory table, select the device or devices
   desired.

#. Click the **Options** button at the top of the inventory panel. In
   the dropdown menu, go to **Apply** and click on **Device Settings**.

#. From the **Apply Device Settings** dialogue box, select the cloned
   settings that will be applied from the dropdown menu.

#. Optionally, it is possible to reboot the device after the settings
   have been applied by selecting the checkbox under **Reboot on
   success**. If the new settings include network or persistence/FBWF
   changes, then enabling this checkbox is recommended. Otherwise, this
   box can be left unchecked.

#. Click the checkmark in the top right corner of the **Apply Device
   Settings** dialogue box to apply the cloned settings to the device or
   devices selected.