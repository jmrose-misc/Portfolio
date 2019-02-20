.. _certificates-reference:

Certificates
------------

.. index::
   single: Certificates

Some connection sessions may require a security certificate to allow access. 
Some 802.1x network connections may also need a certificate. The Management 
Appliance can push these certificates to multiple devices.

.. NOTE::
   Certificates are only supported on LeTOS-based machines. WES-based machines 
   will not accept certificates.

Adding a New Certificate
~~~~~~~~~~~~~~~~~~~~~~~~

#. Open the **Certificates** tab to be taken to the Certificates inventory page.

#. Click on the **Add Certificate** button above the inventory table.

#. The following information will need to be entered for the new certificate:
    Name
       This is the name of the certificate, as assigned by an Administrator.
    Description
       Entering a description will give more information about the certificate 
       and the purpose it will serve. This is an optional field, but inclusion 
       is recommended for clarity purposes.
    Certificate
       Clicking on the **Browse** button will have Administrators locate the
       certificate file locally to upload to the Management Server. The 
       following certificate types are accepted: `.cer`, `.crt`, `.csr`,
       `.key`, `p7b`, and `.pem`.

#. Once all of the information is correct, click on the checkmark on the top 
   right hand corner of the **Add Certificate** dialogue box.

#. The new certificate entry is now listed in the **Certificates** inventory
   table. 
    
Applying a Certificate
~~~~~~~~~~~~~~~~~~~~~~

To apply a certificate to devices:

#. From the table of inventoried **Devices**, select all of the devices that 
   will receive the certificate, then click on the **Options** button. From 
   the dropdown menu, go to **Apply** and click on **Certificates**.

#. From the **Certificates** dropdown options, select which certificates will 
   be applied. Multiple certificates may be applied at one time.
   
#. Click the checkmark at the top right corner of the **Apply Certificates**
   dialogue box to confirm this change. All devices that have received a 
   certificate do not need to be rebooted.

.. raw:: LaTeX

     \newpage
