.. _permissions-reference:

Permissions
-----------

Permissions can be set for the accounts of Active Directory groups that
will be using the Management Appliance. To select permissions for group
accounts, the Management Appliance must first join Active Directory. Refer to
the :ref:`activedirectory-reference` section.

#. Click on the **Permissions** button to access the Permissions inventory
   table.

#. Create a new group by clicking on the **Add** button at the top of
   the page.

#. The **Groups** dropdown menu will display all groups that were
   included during the Active Directory configuration process. A search bar is
   also available to locate specific groups. If a group is not displaying,
   click on the **Refresh** button to reload the group inventory. The 
   **Restrict to Groups** option will restrict an Active Directory group's
   permissions to devices within the specified device groups.

#. Once a group has been selected, all of the **Read**/**Write** access
   can be chosen for that group. Click on the **Read All** or **Write
   All** buttons to allow privileges for all options. Write permissions
   are not available without Read permissions.

#. After all permissions have been set for that group, click on the
   checkmark at the top right corner to apply those permissions
   settings. Repeat this process for all groups as necessary. It is
   recommended that any Administrator groups have full Read and Write
   access.

Once Permissions have been established, Active Directory accounts may be used
as login credentials.   
   
Role-Based Inventory Filter
~~~~~~~~~~~~~~~~~~~~~~~~~~~

If necessary, an account may also have limited access to certain
settings and inventories with a Role-Based Inventory Filter in place.
Similar to standard Permissions, this inventory filter is applied based
on Active Directory group memberships and restrictions.

Extra Permissions
~~~~~~~~~~~~~~~~~

Miscellaneous permission options are available as optional inclusions for 
group and account permissions. These options can be set based on security 
preferences for devices.

Override Shadow Confirmation
   This option will determine if a prompt will appear for devices that 
   the Management Appliance requests to Shadow. This prompt, if 
   accepted, grants the Management Appliance permission to shadow. If 
   **Allow Override** is enabled, the device will simply be notified 
   that it is being shadowed.
   
Allow Shadow without Device Write Permissions
   This option will allow groups without write permissions to Shadow a
   device. This may be necessary if an Active Directory group is restricted
   to certain device groups or otherwise does not need device write
   permissions.   

.. WARNING::
   Enabling this option will give the Shadow initiator the ability to open
   and adjust Control Panel settings of the device that is being Shadowed.
   To prevent potential adjustments, the Control Panel should be password 
   protected before a shadowing session is started. For more information on
   Control Panel security, refer to device's respective operating system
   guide.
   
.. raw:: LaTeX

     \newpage