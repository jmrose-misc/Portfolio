.. _scep-reference:

Automatic SCEP
--------------

.. index::
   single: SCEP
   
Automatic SCEP server support is available on DeTOS for users who wish to use
an automatic method for accessing secure networks.

SCEP is currently only supported on a Windows Server (NDES).

.. NOTE::
   Echo and the NDES server will both need to be visible on the unsecured
   network for this process.


Deploying SCEP
~~~~~~~~~~~~~~

The following settings must be entered on the Server Settings page before SCEP
can function properly on devices. See :ref:`serversettings` for more
information on Server Settings.

`Server/Scep/CertificateRequestAddress`
    Sets the address where the client device will request the certificate from.
    This will usually be `http://<WindowsServerDN>/CertSrv/mscep/mscep.dll`.
`Server/Scep/ChallengeAddress`
    Sets the address where the management server will retrieve the enrollment
    challenge information to forward to the client device. This will usually be
    `http://<WindowsServerDN>/CertSrv/mscep_admin/`.
`Server/Scep/Identity`
    Sets the anonymous identity used during the first phase of EAP-TLS
    authentication. This is usually the same account that is running the NDES
    service on Windows Server.
`Server/Scep/Password`
    Sets the password of the user account that will retrieve the SCEP challenge
    information.
`Server/Scep/Username`
    Sets the username of the user account that will retrieve the SCEP challenge
    information. This authenticates against the MSCEP IIS website.

After applying these settings, restart the Echo server. Once Echo resumes
activity, SCEP can be provisioned for devices with the following steps:

1. Access the Web Application. Open the **Settings** tab at the top and click
   on the **SCEP** inventory page. 

2. Click on the **+** icon to add a new device to support SCEP. Enter the
   device's MAC address to add it to the inventory.

.. NOTE::
   Devices that are not part of the Echo Appliance's device inventory are 
   included upon completion of this process.

3. Power on the device that has been configured for SCEP and connect to the
   unsecured ethernet. Once the device connects to the Management Server, Echo
   will begin SCEP enrollment process by requesting a challenge password from
   the NDES server and sending the response along with the certificate request
   address to the device. The device will then request a certificate using the
   challenge password provided to it by Echo. upon success, the device will
   receive the SCEP server's CA certificate, its own client certificate and
   private key. From there, 802.1X will be configured, overwriting any previous
   802.1X configurations.
 
Once SCEP is deployed with all relevant information, connect the device to the
secure 802.1X port. If the device was already part of the Appliance's device
inventory, reboot it before connecting to the 802.1X network.

.. raw:: LaTeX

     \newpage
