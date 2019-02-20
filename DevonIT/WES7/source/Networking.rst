==========
Networking
==========

Setting Static/Dynamic IP
-------------------------

By default, the thin client has its IP assigned automatically by DHCP,
making it dynamic. To set the IP to a static address on the network,
follow these steps:

1. While logged in as an Administrator, open the Windows **Control
   Panel** from the **Settings** option of the **Start** menu. Under
   **Network and Sharing Center**, select the **View network status and
   tasks** option.
2. Locate and select the network connection that is in use. This will be
   called **Local Area Connection** if an Ethernet cable is being used.
   The **Local Area Connection Status** window will appear. Press the
   **Properties** button. A new window will appear, displaying the
   **Local Area Connection Properties**.
3. The **Internet Protocol Version 4(TCP/IPv4)** option will be located
   at the bottom of the dialogue box within the window. Highlight this
   **TCP/IPv4** and press the **Properties** button to bring up a new IP
   properties window.
4. Select the **Use the following IP address** option, then complete the
   information boxes for the desired static IP address, subnet mask,
   default gateway, and DNS server(s). Consult a network administrator
   if assistance is required to fill out any of this information. Once
   all of the information has been entered, press the **OK** button to
   apply the reconfigured IP address.

.. raw:: LaTeX

     \newpage   
   
Naming the Thin Client, Joining a Domain or Workgroup
-----------------------------------------------------

Naming the Thin Client
~~~~~~~~~~~~~~~~~~~~~~

The thin client can be renamed to make it easier to identify when
attempting to access an Active Directory Domain. To rename the thin
client, follow these steps:

1. While logged in as an Administrator, open the Windows **Control
   Panel** from the **Settings** option of the **Start** menu. Under
   **System...**, select the **Advanced system settings** option,
   located on the sidebar.
2. Open the **Computer Name** tab and press the **Change** button to
   bring up the **Computer Name/Domain Change** window. Enter a new name
   that will be assigned to the thin client for the network
   neighborhood. If the thin client is renamed while it is not connected
   to a network, there is a risk of a duplicate name being assigned.
   Remember to check with a network Administrator before renaming a thin
   client.
3. Once the thin client has been renamed, press the **OK** button to
   confirm the changes. In most cases, a reboot will be required in
   order to correctly apply a rename.

Joining a Domain or Workgroup
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

+-------------+-------------------------------------------------------------------------------------------------------------------------------+
| **Note:**   | Performing the following steps may require Domain administrative rights. Consult a network administrator before proceeding.   |
+-------------+-------------------------------------------------------------------------------------------------------------------------------+

1. While logged in as an Administrator, open the Windows **Control
   Panel** from the **Settings** option of the **Start** menu. Under
   **System...**, select the **Advanced system settings** option,
   located on the sidebar.
2. Open the **Computer Name** tab and press the **Change** button to
   bring up the **Computer Name/Domain Change** window. Enter the domain
   or workgroup name that the thin client will join and press the *OK*
   button to confirm. A notification may appear if joining the domain or
   workgroup has succeeded or failed.
3. The thin client will need to be rebooted to proceed with its new
   domain or workgroup.

Using the Join a Domain or Workgroup Wizard
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

+-------------+-------------------------------------------------------------------------------------------------------------------------------+
| **Note:**   | Performing the following steps may require Domain administrative rights. Consult a network administrator before proceeding.   |
+-------------+-------------------------------------------------------------------------------------------------------------------------------+

The **Join a Domain or Workgroup Wizard** may also be used to join a
domain or workgroup. It presents a series of questions and information
fields about the network and configures the system accordingly.

1. While logged in as an Administrator, open the Windows **Control
   Panel** from the **Settings** option of the **Start** menu. Under
   **Computer name, domain, and workgroup settings**, select the
   **Change settings** option.
2. Open the **Computer Name** tab and press the **Network ID...**
   button. The **Join a Domain or Workgroup Wizard** will appear.
3. Follow the on-screen instructions and answer the questions to
   configure the Domain or Workgroup. Once complete, press the
   **Finish** button and reboot the thin client to apply the changes.

.. raw:: LaTeX

     \newpage
   
Enabling AMQP Support in Windows Embedded
-----------------------------------------

WES7 supports the AMQP protocol for users who wish to use NAT transversal. 
To enable AMQP support:

1. If there is a firewall on the network, ensure that the following
   ports are open:

   -  **Port 80:** HTTP - This is a standard web port for the Management
      Appliance WebUI.
   -  **Port 443:** HTTPS - This is a secure (SSL) communication over an
      HTTP protocol.
   -  **Port 50000:** This is used by SOAP. This port needs to be open
      on the Management Server environment (Bidirectional Connection
      Required) and all devices need to be able to reach it.
   -  **Port 5671:** This is used by AMQP. This port also needs to be
      open on the Management Server environment.

2. Create an ftp:// or http:// server that can be accessed by the
   relevant thin clients. This server will be used to host the script
   that will enable AMQP support on devices. The script can be accessed
   from `here <http://downloads.devonit.com/SalesEng/amqp/enable-amqp.cmd>`__. 
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

+-------------+------------------------------------------------------------------------------+
| **Note:**   | Once AMQP support is enabled, port 50000 is no longer required to be open.   |
+-------------+------------------------------------------------------------------------------+
