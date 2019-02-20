Device Details
--------------

Name
    Name of the device. For newly discovered devices, the default name given to 
    the device is its hostname. Change the name of a device by left-clicking on 
    the desired device in the Devices table and entering a new name in this 
    field. Click on the check mark to apply these changes. 
Description
    A human readable description of the device, as entered by the 
    administrator. 
Last Contact
    The date and time of the last heartbeat sent. This will automatically 
    update every 60 seconds by default, so long as a connection can be 
    established. 
MAC Address
    The ethernet address of the device.
Hostname
    The hostname of the device.
IP Address
    The IP address assigned to the device.
Serial Number
    The serial number of the device.
Location
    A human readable location such as "Test Lab" or "Office 325." This field 
    was used in older versions of the server, consider using Groups instead to 
    convey this information. 
UUID
    The universally unique identifier (UUID) for the device. This is burned 
    into the device at the factory and is used to uniquely identify the device 
    as its network address changes. 
Disk Image Version
    The version of the disk image the device is currently using. 
Disk Image MD5 Hash
    The hash of the disk image being run by the device. This can be auto-
    generated if the disk image came from an ``ftp://``, ``http://``, or ``https://`` server. 
Agent Version
    The version of the LTM Agent that the device is currently using to 
    communicate with the LTM server. 
Product
    The brand, device name, and operating system that the device is running, as 
    reported by the device via the LTM Agent. 
Groups
    The group or groups that the device is assigned to.
