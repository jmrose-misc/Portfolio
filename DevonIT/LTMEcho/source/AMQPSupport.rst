Enable AMQP Support
-------------------

It is possible to switch to the AMQP protocol on supported devices. This
is an option for users who wish to use NAT transversal. To enable AMQP
support:

#. If there is a firewall on the network, ensure that the following
   ports are open:

   +  **Port 80:** HTTP - This is a standard web port for the Management
      Appliance WebUI.
   +  **Port 443:** HTTPS - This is a secure (SSL) communication over an
      HTTP protocol.
   +  **Port 50000:** This is used by SOAP. This port needs to be open
      on the Management Server environment (Bidirectional Connection
      Required) and all devices need to be able to reach it.
   +  **Port 5671:** This is used by AMQP. This port also needs to be
      open on the Management Server environment.

#. Create an ``ftp://`` or ``http://`` server that can be accessed by the
   relevant thin clients. This server will be used to host the script
   that will enable AMQP support on devices. The script can be accessed
   from `here <http://downloads.devonit.com/SalesEng/amqp/enable-amqp>`__
   for devices running LeTOS, and `here <http://downloads.devonit.com/SalesEng/amqp/enable-amqp.cmd>`__ 
   for devices running Windows Embedded operating systems. If it is not possible 
   to create a host server, then the links provided may also be used as a host.
#. Open the Management Appliance WebUI by browsing to the IP address or
   hostname of the appliance within any web browser. Log in using
   Administrator credentials, then open the **Devices** inventory.
#. Select one or more of the devices that will use the AMQP protocol. 
   Click on the **Device Actions** button (the **Gear** icon) and select 
   the **Execute a File** option. Insert the ``ftp://`` or ``http://`` location 
   that is hosting the AMQP script and click on the **check** button to 
   apply the script to the device(s).

To verify that a device is set to use the AMQP protocol, click on the 
device's information icon (the **i** button located next to the device in 
the device inventory). The **Protocol** of the device will be listed.

.. NOTE::
   Once AMQP support is enabled, port 50000 is no longer required to be open.

.. raw:: LaTeX

     \newpage