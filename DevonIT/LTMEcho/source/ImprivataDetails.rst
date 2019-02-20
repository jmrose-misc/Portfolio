Imprivata Details
-----------------

Imprivata Configuration
~~~~~~~~~~~~~~~~~~~~~~~

Name
    The name of the Imprivata OneSign configuration settings. 
Enabled
    When this option is enabled, Imprivata OneSign will be used to authenticate
    the user. A disabled status will bypass authentication for debugging 
    purposes. 
Bootstrap Type
    The bootstrap type that will be used to access the OneSign server. This is
    the initial contact for the list of servers used to log in.    

    SRV
        The SRV record, based on the name set in the DNS. This record will 
        provide information to the bootstrap server that makes access easier,
        especially for larger installations.
    Server Address
        The fully-qualified domain name of the bootstrap server. If 
        `Require Valid SSL Certificate` is disabled, the Alias CNAME may also
        be used.
Bootstrap Server Address
    Enter the server address based on the Bootstrap type selected. 
Disable Desktop
    Disables the desktop, locking it down for direct access to Citrix or VMware
    connections.
Default Domain
    The default domain presented to users upon login. The domain may be 
    included in the server address, as well.
Require Valid SSL Certificate
    When enabled, a valid SSL certificate must be locally installed. This 
    option can be disabled, but will ignore self-signed errors and hostname
    mismatch errors.