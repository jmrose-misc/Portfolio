Install Virtual Machine Setup on VMware
---------------------------------------

VMware ESX v5.0+
~~~~~~~~~~~~~~~~

To start a virtual machine of the Management Appliance on VMware® ESX®
versions 5.0 and up:

#. Launch **VMware® vCenter™ Converter™**. Have the Management Appliance
   files extracted so they are ready for installation. Click on
   **Convert Machine** to begin the installation process.
#. In **Source System**, select **VMware Workstation Player** or 
   **other VMware virtual machine**.
#. Click **Browse** and locate the extracted Management Appliance files
   and select the appropriate **.vmx** file and click **Next**.
#. In **Destination System**, select the **VMware Infrastructure virtual
   machine** option and enter the VMware Infrastructure server
   credentials for an account that has administrator access to the ESX
   or vSphere server on which the Management Appliance is to be
   installed and click **Next**.
#. In **Destination Virtual Machine**, enter a name for the new Virtual
   Machine and select a destination for the Management Appliance on the
   ESX or vSphere server, then click **Next**.
#. In **Destination Location**, select an appropriate datastore where
   the Management Appliance will be stored. The appliance will consume
   approximately 11GB of hard disk space.
#. In **Options**, configurations may either be adjusted or left at
   default settings. When finished, click **Next**.
#. In **Summary**, verify that all the settings are correct and click
   **Finish**.

   .. NOTE::
      Make sure that this is a newly downloaded appliance and not one that has 
      been opened and run within VMware Workstation Player.

   
Installing without VMware vCenter Converter
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

To start a virtual machine without the use of vCenter Converter:

#.  Extract the Management Appliance files. Open the VMware
    Infrastructure Client and connect to the ESX or vSphere server.
#.  Browse the datastore where the Management Appliance will be hosted
    in. Once in the Datastore Browser, select the option to **Upload
    Folder**.
#.  Browse to the location of the extracted Management Appliance folder
    and select it for upload. When the Management Appliance has finished
    uploading, return to the VMware Infrastructure landing page.
#.  Create a new Virtual Machine and select the hosting server that will
    run the Management Appliance.
#.  At the **Configuration** screen, select the Custom option to allow
    for a customized setup process and click **Next**. In **Name and
    Location**, enter a name for the new Virtual Machine and select a
    destination for the Management Appliance on the ESX or vSphere
    server, then click **Next**.
#.  In **Storage**, select the datastore where the Management Appliance
    will be stored. This should be the same datastore that was chosen in
    Step 2. For the **Virtual Machine Version**, select the version best
    suited for the server.
#.  In the **Guest Operating System** screen, select the OS type that
    will be used. In most cases, the Guest OS for the Management
    Appliance will be Linux, with the Ubuntu Linux (64-bit) version.
#.  For the **CPU**, **Memory**, and **Network** screens, the default
    options will be acceptable in most cases. However, these can all be
    adjusted based on what is desired or specified. In **SCSI
    Controller**, select the LSI Logic Parallel option.
#.  In the **Select a Disk** screen, use the “Use an existing virtual
    disk” option. Choosing this option will create a new **Select
    Existing Disk** screen. From there, locate the folder that as
    uploaded from the Datastore Browser in Step 2.
#.  In **Advanced Options**, select a virtual device node and make any 
    necessary adjustments. In most cases, these options can be left to their 
    default settings.
#.  Review all settings in the **Ready to Complete** screen before
    finalizing the virtual machine. If everything looks acceptable,
    click **Finish**. The appliance can now be booted up to complete the
    installation process.

.. raw:: LaTeX

     \newpage    
    
VMware Workstation Player
~~~~~~~~~~~~~~~~~~~~~~~~~

To start a virtual machine on VMware Workstation Player:

#. Launch **VMware Workstation Player** and click **Open**.
#. Open the correct **.vmx** file located in the Echo folder.
#. The virtual appliance will immediately begin booting.