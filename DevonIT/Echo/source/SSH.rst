SSH
---

.. index::
   single: SSH

The SSH protocol is used to connect to a device through SSH.

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

Server Address
    The hostname or IP address of the device to SSH into.
Username
    The default username to login through SSH. Leaving this field blank will 
    allow those who use this connection to log in with their desired username
    when they connect. 
Port
    The port used to access the device via SSH. Port 22 is the default port.
Host Key
    The encryption type and host key for the connection.