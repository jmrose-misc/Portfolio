.. _profiles-reference:

Profiles
--------

.. index::
   single: Profiles

The profile feature allows administrators to assign connections and
settings to one or more device. Profiles are useful for administrators
that wish to affect updates on many devices at once. For instance,
sometimes it becomes necessary to change the details of a connection
that is used for multiple devices. If a profile has already been applied
to those devices that contains the connection details, simply updating
the connection details will automatically adjust the devices to use
these new settings. The next two sections describe the necessary steps
for creating and applying profiles.

How to Create a Profile
~~~~~~~~~~~~~~~~~~~~~~~

1. Open the **Profiles** tab to be taken to the profile inventory table.

2. Left-click on the **Add Profile** button above the inventory table.

3. The **Add Profile** dialogue box will open with seven fields to enter
   information in:

    Name
        Enter a name for this profile.

    Description
        Enter a description about the profile.

    Mode
        Select between the following profile application options:

          -  **Default Profile** – Apply to all devices on the server. If an 
             operating system normally runs a wizard on its first boot, the first 
             boot wizard will be overridden by the profile. This will occur even 
             if the profile contains no applicable items.

          -  **Select Devices** – Manually select devices by name. This mode
             will override Default profiles. Once **Select Devices** is
             chosen, a **Devices** field will open where the administrator
             can choose individual devices to apply this profile to by name.

          -  **Apply by terminal details** – This will apply to all devices
             that meet the specifications that are entered. When selected,
             the profile can specifically be applied by **Device Name**,
             **IP Address, Range or Subnet**, Device **Model**, or by
             **OS**.

          -  **Apply by group membership** – Applies the profile to all
             devices that have been assigned to one or more selected groups.
             When this option is chosen, a drop-down menu of all available
             groups is made available.

    Disk Image
        In the drop-down menu, if the administrator adds an image to the 
        profile, the Management Appliance will re-image the device every time 
        it boots if it doesn’t already have the specific image listed here.

    Connections
        Assign connections to this profile by clicking in the field and 
        choosing which connections to include. It is also possible to select 
        none at all.

    Device Settings
        Assign cloned settings to this profile by clicking in the field and 
        choosing which settings to include. It is also possible to select none 
        at all.

    Certificates
        A certificate can be included to allow entry to servers with security 
        restrictions, or for 802.1x network connections.
        
    Software Packages
        Software Packages can be deployed to multiple devices when applied to 
        Profiles. Be aware that devices will still need to be rebooted before 
        a deployed software package will properly load onto the device.

    Imprivata Configuration
        Imprivata OneSign configurations can be applied on devices that are 
        running compatible software. Depending on the configuration's setup, a
        certificate may be required to deploy alongside OneSign.
        
4. Once all of the information is correct, click on the checkmark on the
   top right hand corner of the **Add Profile** dialogue box.

5. The new profile entry is now listed in the **Profiles** inventory
   table.

Applying a Profile
~~~~~~~~~~~~~~~~~~

Once a profile has been created as described in the section above, it
will automatically apply the associated connections and settings the
next time the devices included in the **Mode** field are rebooted.
However, if to make the changes take effect immediately, the profile may
be manually applied by following the steps below:

#. From the table of inventoried **Devices**, select a device and then
   click on the **Options** button. From the dropdown menu, go to
   **Apply** and click on **Profile**.

#. From the dropdown under **Profile**, select which profile will be
   applied.

#. Click the checkmark at the top right corner of the **Apply Profile**
   dialogue box to confirm this change.

#. Connection shortcuts are automatically created on the device's
   desktop. The end-user can simply double-click these icons to initiate
   the connection.

Profiles are able to be applied to devices that have not yet run the First 
Boot Wizard. In the case of newly-reflashed devices, the Profile will overwrite 
the need to run a First Boot Wizard.

.. NOTE::
   Even if a profile is devoid of options, it will still override the First 
   Boot Wizard. The desktop will be presented with default settings.

.. raw:: LaTeX

     \newpage