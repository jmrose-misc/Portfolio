Appliance Upgrades
------------------

The following is the recommended procedure for upgrading the Management
Appliance to a newer version:

1. **Backup** - Back up the server’s current configuration and data
   prior to performing an upgrade using the Hotcopy procedure. Refer to the
   **Database Hotcopy** section for details on this step.

2. **Upgrade** -

   -  Shut down the appliance server (Select option 9, **Halt Machine**,
      from the **Main Menu**).

   -  Download the latest management console appliance.

   -  Extract the contents and point the VMware Server to the new file.

   -  Restart the virtual appliance.

3. **Restore**- Once the upgrade is finished and the new appliance is
   online, the management server will be ready for restoration. Refer to
   the **Restore Server** section for details on the restore process.