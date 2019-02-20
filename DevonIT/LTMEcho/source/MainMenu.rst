The Main Menu
-------------

Once initial setup process is complete, the **Main Menu** screen becomes
the starting point for all future appliance configurations.

.. figure:: media/image14.png
   :alt:

Main Menu Options
~~~~~~~~~~~~~~~~~

Change Password
    This options will change the password for the default administrator 
    account. The default password is set upon starting the appliance for the 
    first time and can be changed at any time. There is no character limit, so 
    it is recommended to set a password that is memorable, but secure.
    
Configure Active Directory
    Used to configure integration with Active Directory for user credentials. 
    Integrating with Active Directory will allow credentials from the Active 
    Directory to be used, in addition to the default `bwadmin` account. For more 
    on Active Directory, refer to the :ref:`activedirectory-reference` section 
    or the :ref:`permissions-reference` section.

Configure Timezone
    The time zone can be configured based on the current location of the server. 
    By default, this is set to the **America/New York** time zone.

Change Hostname
    Select this to change the hostname of the LTM server. This may be done for
    cases where it is desirable to assign a hostname that is more relevant to 
    the server. The default hostname is ws-broker.

.. raw:: LaTeX

     \newpage    
    
Link Appliances
    This option allows two Management Appliances to link together, if they 
    share a database. A database will need to be configured beforehand. This 
    option may also be ideal for administrators who wish to use the AMQP 
    protocol with their setup.

Configure SSH
    Select this to configure the built-in SSH server. Enabling **SSH** will 
    allow remote access to the command line of the management server.

Configure Networking
    The network options of the Management Appliance can be configured. The 
    following settings can be adjusted:
    
    Configure Network Interfaces
        This option modifies the static network settings.
    Configure Routes
        This option modifies the local routing table.

Configure Database
    The management server can be configured to use external PostgreSQL, MSSQL, 
    and MySQL databases. By default, it uses it's own internal MySQL Database. 
    This database can be configured at any time. This is required for linking 
    appliances together.

Configure Lockscreen
    The timeout period for the lockscreen can be adjusted, as well as disabled. 
    Disabled lockscreens can be re-enabled at any time.

Configure Shadow
    This configures the way the Management Server handles Shadow sessions. 
    By default, the Management Server will allow ten Shadow sessions running 
    at one time among all active users and sessions. Any other attempts to 
    Shadow a device will be rejected until one of the other ten sessions has 
    concluded. The number of allowed Shadow sessions can be adjusted to 
    accommodate for current network speed. There are also fields to tell the 
    Management Appliance what ports are open for Shadow to use. For more 
    information on using Shadow, see :ref:`shadow-reference`.

Restart LTM
    This will restart the LTM server. This option is necessary for cases where 
    the Management Server has had settings adjusted.

Halt Machine
    This will power off the Management Appliance. This option is necessary for 
    cases where the Management Server may be replaced.

View Server Status
    This will display the current status of the server. Here, Administrators 
    will be able to view the status of all connected servers, as well as the 
    database connectivity status. This status screen will also inform the 
    Administrator if the Management Appliance is currently joined to an Active 
    Directory, and if there has been a link created with another appliance. 
    Miscellaneous information about the current appliance version is also 
    displayed for support purposes.

.. raw:: LaTeX

     \newpage