Software Packages
-----------------

How to Add a Software Package
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

Software packages are used in order to apply specific updates or changes
to devices without having to update the entire image. Some examples for
software packages would be custom wallpaper images, updating software
clients like VMware Horizon View, Citrix, or RDP, potentially providing
bug fixes, and more.

At this time, customer-created packages are not supported. In order to
add a software package to the Software inventory:

#. Click on the **Software** button to view the software inventory
   table.

#. Click the **Add** button at the top of the inventory table.

#. An **Add Software** dialogue box will open with several fields:

   -  **Name** - Enter a name for this software package.

   -  **Description** - A short description for this software package can
      be entered here.

   -  **Filename** - The full filename for the software package being
      added. The file extension will need to be included.

   -  **Checksum** - Enter the hash of the software package. This will be
      auto-generated if the software is being pulled from an ``http://``,
      ``https://``, or ``ftp://`` server, but may take a few minutes, depending on
      network connectivity.

   -  **Product** - Select the product from the dropdown menu which this
      software package can be applied to.

   -  **Storage Location** - Select the storage location where the disk
      image has been saved.

#. Click the checkmark at the top right hand corner of the **Add
   Software** dialogue box to add the desired software package to the
   software inventory.

.. raw:: LaTeX

     \newpage
   
Applying a Software Packages to a Device
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

.. NOTE::
   Software Packages are only supported on LeTOS-based machines. WES-based machines 
   will not accept software packages.

1. From the **Devices** inventory table, select a device or multiple
   devices and then click the **Options** button.

2. Select **Apply** and then click on **Software.** This will open the
   **Apply Software** dialogue box.

   .. NOTE::
      Packages that are incompatible with the selected devices will not display 
      in the dropdown menu.

3. From the **Software** dropdown list, select the package that will be
   applied.

4. Click the checkmark at the top right hand corner of the **Apply
   Software** dialogue box to add the desired software package to the
   selected devices.

Removing a Software Packages from a Device
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

#. From the **Devices** inventory table, select a device and then click
   the **Options** button.

#. Select **Remove** and then click on **Software**. This will open the
   **Remove Software** dialogue box.

#. In the **Software** field, select the desired software packages to be
   removed from the device. Multiple packages may be selected, if
   needed.

#. Click the checkmark at the top right hand corner of the **Remove
   Software** dialogue box to remove the selected software packages from
   the devices selected. The software package will be completely removed
   on the device’s next reboot.

.. raw:: LaTeX

     \newpage