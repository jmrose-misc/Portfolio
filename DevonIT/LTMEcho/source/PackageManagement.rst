Package Management
------------------

Packages are available for the Management Appliance, allowing an Administrator 
to remotely upgrade the version of the server without performing a virtual 
appliance replacement. 

.. NOTE::
   In order to perform a successful upgrade, the previous version of the 
   Management Appliance must be in use. The Management Appliance will only 
   accept upgrades from its subsequent version. The upgrade will not go through 
   if the appliance is at least two versions behind the package's version.

#. Download all available package files, then access the **Settings** page of
   the Management Server.

#. Click on **Add Package** button at the top of the **Package Management** 
   page. Click on the **Browse** button and locate the first package file. 
   Once the file has been selected, click on the checkmark icon on top right
   hand corner of the **Add Package** dialogue box to begin the package 
   application.

#. The first package will begin to apply itself. This may take a few moments to
   complete. As each package is being applied, the **Logs** will update 
   automatically, displaying the current progress and errors, if any. When the
   first package finishes applying, repeat the process to apply the next 
   package. The final package will initiate the update process. Once finished,
   the Management Appliance will automatically restart to apply the packages. 
   The restart process may take a few moments to complete. During this time, 
   the web user interface will be inaccessible until the restart is finished. 
   Once this process is completed, the Management Appliance will clean up the 
   package and the server will be ready for use.

.. WARNING:: 
   It is important to make sure that the packages are applied in order. Failure
   to do so may result in errors during the update process.
   
.. WARNING:: 
   Be aware that once an update has been applied, it is not possible to roll 
   back the server. For best results, take a snapshot of the virtual machine 
   that is running the Management Appliance before applying the packages. The 
   availability and location of the snapshot option will vary, depending on 
   the platform used. It is also recommended to create a Database Hotcopy of 
   the server before packages are applied. This is not meant to be a 
   substitution for an appliance snapshot. For more information on creating a
   hotcopy, refer to :ref:`hotcopy-reference`.