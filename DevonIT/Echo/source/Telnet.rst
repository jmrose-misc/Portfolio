Telnet
------

.. index::
   single: Telnet

The Telnet protocol is used to connect to a device through Telnet.

Basic Information
~~~~~~~~~~~~~~~~~

Name
    The name of the connection. The name is a required field when a new 
    connection is created. 
Local Display Name
    The local display name is what the connection will be labeled with on the
    device. This field is required in order to create a new connection. 
Description
    A description such as "Kiosk Connection" or "Presentation Connection." The
    description field is optional, but it is recommended to use descriptions to
    help organize connections. 
Protocol
    The protocol used in the connection is displayed here. 

General
~~~~~~~

Type
    The type of Telnet connection being run. Certain types have different login
    options available.
Server Address
    The hostname or IP address of the device to Telnet into.
Username
    The default username to login through Telnet. Leaving this field blank will
    allow those who use this connection to log in with their desired username
    when they connect. This is only available for `Type: TELNET`.
Port
    The port used to access the device via Telnet. The default port will change
    if SSL is enabled or disabled.
Use SSL
    Enables or disables the use of SSL.

