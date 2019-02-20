============
Introduction
============

What is Windows Embedded 8 Standard?
------------------------------------

Windows Embedded 8 Standard (WE8S) is an embedded operating system 
and successor to Windows Embedded Standard 7, updated to match the 
components of the Windows 8 operating system.  It also provides the 
Windows 8 interface.

WE8S Features
-------------

-  **Multimedia Web Browsing-** WE8S comes equipped with Internet 
   Explorer 10 with improved navigation and supports CSS styling and 
   RSS feeds.  Windows Media Player 12 is included to manage digital 
   music, photos, and video libraries.  WE8S also comes with Microsoft 
   Silverlight for running interactive applications right from the thin 
   client, DirectX 11 for 3D and full-color video, and supports both 
   digital and analog television for streaming shows or recording videos.
-  **Modern Networking-** WE8S can connect to the hosted desktops using
   the industry's best protocols, including PCoIP, Citrix, RDP
   compatibility with RemoteFX, and VMware Horizon View. WE8S also uses
   802.11, 802.1X, and WPA2 for wireless connections and protection,
   Plug and Play support for intelligent devices, USB 2.0 and 3.0
   support, and Internet Connection Sharing.
-  **Third Party Clients-** Lenovo thin clients include commonly used
   client server applications such as the Citrix Online Plug-in and
   VMware Horizon View.
-  **File-Based Write Filter (FBWF)-** This feature allows the
   administrator to select individual files or folders to be protected
   from change while other files/folders on the same partition can be
   updated.
-  **USB Flash Boot-** Thin clients are capable of being re-imaged from
   a bootable USB Flash Device with the .EXE re-imagining executable
   file on it and the compressed image file in the .gz format.
-  **Centralized Management-** Lenovo thin clients with WE8S can be
   easily managed with the Lenovo Thin Client Management Console.

Auto-Activation
---------------

Windows Embedded 8 Standard requires activation on first-time use. By 
default, WE8S will automatically run the activation process. 
Auto-activation requires a standard, wired DHCP internet connection in 
order to run correctly on first boot.

1. Power on the thin client that will be running WE8S for the first time. 
   Allow the first run process and preparations to complete. 
2. If the thin client is already connected to the internet, then the auto-
   activation will occur. Do not press any buttons or power off the thin 
   client, unless a prompt requires response.
3. The device is now activated and ready for use. 

If another network setup needs to be used, or if the activation process 
cannot be completed until a later time, log in to WE8S as an Administrator 
and follow these steps:

1. Locate the **LTM Control Panel** on the desktop and open it.
2. Once the **LTM Control Panel** is open, access the **FBWF/EWF
   Manager** page. Set the FBWF options to **Disable FBWF**. Click on 
   the **Apply** button to save the changes.
3. Restart the thin client and log back into WE8S as an Administrator.
4. If necessary, make any adjustments to the network settings so that 
   a proper internet connection can be established for device activation.
   For further assistance, please refer to the :ref:`networking-reference` chapter.
5. While remaining logged in as an Administrator, open the Windows 8 side 
   menu and access the **Settings** option. Open the **PC Info** option to 
   display the **System** window. If WE8S has not yet been activated, then 
   there will be an option to run the Windows activation process.
6. Click on the option to run the Windows activation process. Follow any on-
   screen instructions that may appear. If necessary, a reboot may be 
   required to finish the activation process.
6. The device is now activated and ready for use.

.. raw:: LaTeX

     \newpage

Windows Embedded 8 Standard will need to run the activation process, even if the 
image was a clone that has been applied to a device using the Lenovo Thin Client 
Management software. 

1. Push the cloned WE8S disk image from the LTM Management Appliance to the thin 
   client that will be receiving the clone image. For more information about this 
   disk image cloning and applying process, refer to the LTM Administration Guide.
2. Once the clone has been applied to the thin client, the thin client will restart. 
   After the reboot, WE8S will start on a locked screen. 
3. Verify that a wired, DHCP internet connection is being used before attempting to log in.
   Once the internet connectivity has been verified, log in to the Administrator account. 
   Be aware that the activation will not occur for User accounts and must be done on 
   Administrator accounts.
4. The Auto-activation process will begin. When the process is finished, a prompt will 
   appear stating that WE8S has completed activation. Accepting this prompt will allow 
   WE8S to reboot. During this reboot, the FBWF will re-enable itself.

.. NOTE::
   At some point during first boot, Windows Embedded 8 Standard may need to prepare configurations. If the "Preparing to configure Windows Do not turn off your computer." message appears, please allow the configuration process to complete before continuing.
 
First Boot Wizard
-----------------

The first time the terminal boots up, the first boot wizard will need to
be used for the initial setup process. This wizard can help to configure
a variety of settings in order to better use the thin client. Users are
advised to become familiar with the materials in this guide, as well as
the LTM Administration Guide, to properly operate the first boot
wizard.
