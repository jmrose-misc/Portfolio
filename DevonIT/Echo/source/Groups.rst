Groups
------

.. index::
   single: Groups

Administrators may create **Groups** in order to organize the devices
displayed in the **Devices** page. By selecting a device and clicking on
this button, administrators may assign a device to one or multiple
groups by typing in the name of the group they have previously created.
Groups can also be automatically applied to devices that meet the
criteria that the Group is set to apply for.

.. figure:: media/image21.png
   :alt:

If necessary, clicking on the group tag, located next to the name of a
device, will have the management server search through the device
inventory based on Groups. This will display all devices that fall into
that group. Devices that do not apply to a group are `Unassigned`.

Applying or Removing a Group
~~~~~~~~~~~~~~~~~~~~~~~~~~~~

Once a group has been added to the **Groups** inventory list, it can
then be applied to devices in the **Devices** inventory. To apply a
group to a device:

#. From the **Devices** inventory table, select the device or devices to
   be added to a group.
#. Click on the **Groups** button in the **Actions Bar** at the top of
   the page. This will open the **Groups** dropdown menu.
#. Begin typing the name of the group in the **Groups** field. A
   dropdown menu will populate itself with the available group names as
   it is typed. Multiple groups may be applied by using this method.
#. If needed, groups can also be removed from this field by clicking on
   the X next to the group name. This is useful for cases in which a
   group that is not meant to be applied accidentally gets added to the
   list.
#. Once a device has the desired groups listed in the **Groups** field,
   click on the checkmark at the upper right hand corner of the
   **Groups** menu to apply the changes.

If a group is being applied based on Group Auto-Membership details, then
existing devices will automatically update to include themselves as part
of the group, and newly-added devices will be included in the group upon
their first heartbeat to the server. If a group’s membership is changed,
devices will automatically update if they meet the requirements to join
the group. Devices that no longer meet the group’s membership
requirements are automatically removed from the group.

.. raw:: LaTeX

     \newpage