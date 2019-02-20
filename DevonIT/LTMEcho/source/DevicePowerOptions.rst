Device Power Options
--------------------

Administrators are able to remotely power off and power on one or more thin 
clients that are managed by the Appliance. It is even possible to set a 
schedule so that managed devices are turned on, shut down, or restarted at the 
same time every day.

Reboot Device
~~~~~~~~~~~~~

This option will have all selected devices immediately reboot, or at a set time 
and date. Devices must be powered on, connected to the network, and associated 
with the Management Server when this task is distributed.

When to Run
    Administrators may choose to have the devices reboot immediately, or a 
    schedule may be set so that the devices will always reboot at the same time 
    for multiple instances. For more information on scheduling tasks, refer to 
    the :ref:`tasks-reference` section.

Power Off Device
~~~~~~~~~~~~~~~~

This option will have all selected devices shut down immediately, or at a set 
time and date. Devices must be powered on, connected to the network, and 
associated with the Management Server when this task is distributed.

When to Run
    Administrators may choose to have the devices shut down immediately, or a 
    schedule may be set so that the devices will always shut down at the same 
    time for multiple instances. For more information on scheduling tasks, refer 
    to the :ref:`tasks-reference` section.

Wake-On-LAN
~~~~~~~~~~~

This option will have all selected devices power on immediately, or at a set 
time and date. Devices must be powered off, connected to the network, and 
associated with the Management Server when this task is distributed. A Network 
Administrator may need to be consulted to get the information required.

.. NOTE::
   Wake-On-LAN has the ability to work across subnets. This requires the router
   to be configured to forward broadcast packets.

Port to use for wakeup signal
    The port that will be used for a successful wake-up. This may need to be 
    adjusted, depending on network settings.

Subnet Mask/CIDR Length
    The subnet mask for the network. This is mandatory for a successful wake-up.
    
Subnet IP
    The subnet of the network. This is optional.
    
When to Run
    Administrators may choose to have the devices power on immediately, or a 
    schedule may be set so that the devices will always power on at the same 
    time for multiple instances. For more information on scheduling tasks, refer 
    to the :ref:`tasks-reference` section.