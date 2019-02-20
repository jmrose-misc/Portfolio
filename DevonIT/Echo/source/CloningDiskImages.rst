Disk Image Cloning
------------------

The Management Appliance allows administrators to perform full disk
image cloning of devices, utilizing ``ftp://``, ``cifs://``, ``http://``, 
``https://``, or ``nfs://`` protocols. Certain disk images are unable to 
support the disk image cloning process.

.. NOTE::
   To create a disk image clone from a WES® device, FBWF must be
   disabled. See the WES Administration Guide for instructions on how to do
   so.

How to Clone the Entire Disk Image
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

#. From the table of inventoried **Devices**, select a device and then
   click on the **Options** button. From the dropdown menu, go to
   **Clone** and click on **Disk Image**.

#. A dialogue box titled **Clone Disk Image** will open with four fields
   to be filled out:

   -  **Name** - Enter a name for this disk image.

   -  **Description** - Enter a short description for this disk image.

   -  **Image Filename** - Enter the filename desired for the new disk
      image clone.

   -  **Storage Location** - Select the storage location where the image
      will be saved from the dropdown menu. See :ref:`storagelocations-reference` 
      for more information on setting up storage locations.

#. Click the checkmark at the top right corner of the **Clone Disk
   Image** dialogue box to begin the cloning process. This process may
   take a few moments, depending on the size of the device's flash disk
   and network traffic.

#. After completion, the newly cloned disk image can be seen in the
   inventory table of the **Disk Images** tab.

How to Add a Disk Image
~~~~~~~~~~~~~~~~~~~~~~~
New OS images can be added to the Management Appliance inventory.

#. Copy the image over to an ``nfs://``, ``ftp://``, ``http://``, or ``https://``
   server, or ``cifs://`` shared directory. If this directory is not 
   already included in the Storage Location inventory, it will need 
   to be added. Please see :ref:`storagelocations-reference` for 
   instructions on how to add a storage location.

#. From the **Disk Images** tab, click on the **Add** button above the
   inventory table.

#. A dialogue box titled **Add Disk Image** will open displaying various
   fields used to add the disk image. The **Basic Information** required
   is:

   -  **Name** - Enter a name for this disk image.

   -  **Description** - A short description for this disk image can be
      entered here.

   -  **Filename** - The full filename of the disk image, as it is shown
      on the server. This will need to include the file extension.

   -  **Checksum** - Enter the hash of the disk image. This will be
      auto-generated if the disk image is being pulled from an ``http://``,
      ``https://``, or ``ftp://`` server, but may take a few minutes, depending on
      network connectivity.

   -  **Product** - Select the product from the dropdown menu which this
      disk image can be applied to.

   -  **Storage Location** - Choose the storage location where the disk
      image has been saved. A storage location must have been established 
      beforehand. See :ref:`storagelocations-reference` for more information on how to 
      include storage locations to the Echo inventory.

   -  **MD5 SUM** - Enter the md5sum of the disk image. This field is not
      marked as required (\*), however older versions of disk images
      will need this correctly filled.
      
      .. NOTE::
         If a thin client that is using DeTOS 7.3 or 7.4 is receiving a disk image upgrade 
         through a Windows Share (``cifs://``) storage location, the SHA1 of the disk image 
         will need to be entered in place of the checksum. This is always required regardless 
         of legacy status.

#. Click the checkmark at the top right corner of the **Add Disk Image**
   dialogue box to add this disk image to the inventory of disk images.

#. In the **Disk Images** tab, the inventory table will now contain the
   recently added disk image. See the section titled :ref:`applydiskimage-reference` 
   for instructions on how to apply the disk image to devices.

.. raw:: LaTeX

     \newpage

.. _applydiskimage-reference:
	 
Applying a Disk Image to a Device
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

.. CAUTION::
   When applying disk images to devices, make sure to use the
   correct image for that particular model, otherwise the device may be
   rendered unbootable.

1. From the **Devices** inventory table, select a device or devices and
   then click the **Options** button. From the dropdown menu, go to
   **Apply** and then click on **Disk Image.**

2. In the **Apply Disk Image** dialogue box, select the desired disk
   image from the dropdown menu. To have the device reboot and apply the
   disk image immediately, click in the checkbox next to **Reboot on
   success**.

3. Click the checkmark at the top right corner of the **Apply Disk
   Image** dialogue box to begin applying the disk image.

 .. NOTE::
    Using the search function while performing disk image
    applications is advised. For example, by searching for “DeTOS” will
    cause only devices running DeTOS to be displayed. By utilizing the
    search function, administrators can avoid accidentally applying a disk
    image to a device of the wrong type or that is running a different OS.

4. Click the **Submit** button to begin the re-imaging process.

The disk image will either reboot to begin the updating process, or it
will update in the background so users do not have to be interrupted by
the updating process. The status of the update can be viewed at any time
by checking the **Device Logs**, either from the **Logs** inventory
table or directly from the device from the **Devices** inventory table.
The re-imaging process may take a few moments, depending on the size of
the image and network traffic. During this time, there is no agent to
heartbeat into the server, and therefore the timestamp in the **Last
Contact** field of the **View Device** dialogue box will remain
unchanged. Once the re-image is complete, the device will be free to be
rebooted at the earliest convenience, or will automatically reboot if
**Reboot on Success** was selected. The agent will heartbeat into the
server, which in turn will update the **Last Contact** field. This
update to the current time in the **Last Contact** field means that the
re-imaging process is complete.

.. raw:: LaTeX

     \newpage
