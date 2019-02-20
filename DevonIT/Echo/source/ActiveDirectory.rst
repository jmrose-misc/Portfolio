.. _activedirectory-reference:

Active Directory
----------------

.. index::
   single: Active Directory

Echo supports Active Directory Integration, which will allow Active
Directory accounts to be used instead of the default ``bwadmin``
credentials. 

.. NOTE::
   Before continuing, verify that both Active Directory is currently 
   running, and that there is a currently working installation of the 
   Echo Appliance.

.. figure:: media/image26DIT.png
   :alt:

1. Access the Echo Administrator Console and select "*Configure Active
   Directory*". After that, the following fields will need to be completed:

   -  **KERBEROS Realm** - Enter the domain name. (ex: ``DOMAIN.COM``).

   -  **DNS Domain** - Enter the DNS domain name. (ex: ``DOMAIN.COM``)

   -  **AD Domain** - Enter the Active Directory domain name. (ex: ``DOMAIN``)

   -  **AD Server Name** - Enter the hostname of the domain controller.
      (ex: ``dc.domain.com``)

   -  **AD Server IP** - Enter the IP Address of the domain
      controller. (ex: ``192.168.1.100``)
      
2. Select *Join Domain* and authenticate with an Active Directory Administrator 
   account. Once this is complete, Echo will state that it has successfully
   joined the domain and then restart the Appliance. To begin using Active
   Directory accounts to login to the Web Application, refer to the
   :ref:`permissions-reference` section.
   
3. If necessary, create a new Security Group in Active Directory. Otherwise,
   existing Active Directory groups will be suitable. If this group will 
   require specific permissions when accessing Echo, these will be set in the
   **Permissions** section of the Web Application.   

.. raw:: LaTeX

     \newpage   