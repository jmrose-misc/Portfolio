Groups Settings
---------------

.. index::
   single: Groups

Administrators have the option of creating **Groups** within the
management console in order to help them organize their devices.
Individual devices can belong to multiple groups. To create new groups:

#. From the **Groups** inventory table, click the **Add** button at the
   top of the page.

    .. figure:: media/image29.png
       :alt:

#. The **Add Group** menu will open with two fields:

   **Group Information**
   
   -  **Name** - Enter a name for the group being created.

   -  **Color** - Click on the **Color** field to open a color wheel and
      select the desired color.

   **Automatic Membership**

   -  **IP Address/Subnet** - This will allow the group to be
      automatically applied to any devices that use this IP Address or
      falls under the subnet. Use a comma-separated list to add multiple IP
      Addresses.

   -  **Model** - This lets all of the specified models within the
      Management Server become a member of the group. Only one model may
      be selected.

   -  **OS** - The Operating System of the devices that will be a member
      of this group. Only one OS may be selected.
      
   - **MAC Address** - The MAC address of the devices that will be a member of
      this group. Use a comma-separated list to add multiple MAC addresses.
      
   - **Hostname** - The hostname of the devices that will be a member of this
     group. Use a comma-separated list to add multiple hostnames.
      
   - **Serial Number** - The serial number of the devices that will be a member
      of this group. Use a comma-separated list to add multiple serial numbers.
      
   - **Location** - The location of the devices that will be a member of
      this group. Use a comma-separated list to add multiple locations.
      
   - **UUID** - The UUID of the devices that will be a member of
      this group. Use a comma-separated list to add multiple UUIDs.
      
   - **Disk Image Version** - The disk image version of the devices that will
      be a member of this group. Use a comma-separated list to add multiple
      disk images.
      
   - **Agent Version** - The agent version running on the devices that will be
      a member of this group. Use a comma-separated list to add multiple
      agents.
      
   - **Protocol** - The protocol of the devices that will be a member of
      this group. Select **Any**, **SOAP**, or **AMQP** from the list. Only
      one protocol may be selected.
      
#. Once all relevant information has been entered, click on the checkmark at 
   the upper right hand corner of the **Add Group** menu. The new group will 
   appear in the **Groups** inventory.

.. NOTE::
   A device that no longer qualifies as a member of a group will automatically
   leave the group.   
