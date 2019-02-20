.. index::
   single: Networks

Enabling AMQP Support in LeTOS
------------------------------

LeTOS supports the AMQP protocol for users who wish to use NAT transversal.
To enable AMQP support:

1. If there is a firewall on the network, ensure that the following
   ports are open:

   -  **Port 80:** HTTP - This is a standard web port for the LTM Management Appliance WebUI.

   -  **Port 443:** HTTPS - This is a secure (SSL) communication over an HTTP protocol.

   -  **Port 50000:** This is used by SOAP. This port needs to be open on the Management Server environment (Bidirectional Connection Required) and all devices need to be able to reach it.

   -  **Port 5671:** This is used by AMQP. This port also needs to be open on the Management Server environment.

2. Create an ftp:// or http:// server that can be accessed by the
   relevant thin clients. This server will be used to host the script
   that will enable AMQP support on devices. The script can be accessed
   from `here <http://downloads.devonit.com/SalesEng/amqp/enable-amqp>`_.
   If it not possible to create a host server, then this link provided
   may also be used as a host.

3. Open the LTM Management Console WebUI by browsing to the IP address or
   hostname of the appliance within any web browser. Log in using
   Administrator credentials, then open the **Devices** inventory.

4. Select one or more of the devices that will gain AMQP support. Click
   on the **Device Actions** button (the **Gear** icon) and select the
   **Execute a File** option. Insert the ftp:// or http:// location that
   is hosting the AMQP script and click on the **check** button to apply
   the script to the device(s).

   .. NOTE::
      Once AMQP support is enabled, port 50000 is no longer required to be open.
