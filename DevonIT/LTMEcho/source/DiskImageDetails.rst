Disk Image Details
------------------

Basic Information
~~~~~~~~~~~~~~~~~

Name
    The name given to a disk image when it is created. This is a mandatory 
    field when creating a new disk image, but can be changed later if needed. 
Description
    Entering a description for a disk image is optional, but doing so is highly 
    recommended. 
Filename
    The filename to be given to the disk image file. The name of the file and 
    the file extension need to be entered here. 
Checksum
    The hash for the disk image. This field will auto-generate if the disk 
    image is coming from an HTTP, HTTPS, or FTP server. 
Product
    Select the product of the disk image from drop-down menu. 
Storage Location
    The storage location that will hold the disk image. The location must have 
    been previously entered in the server's Storage Location tab. 

Legacy Options
~~~~~~~~~~~~~~

These options are for when a legacy disk image is being added to the server.

MD5 Sum
    This is the MD5 sum of the disk image. When applied via a profile, if the 
    two images are the same, nothing will happen. If they differ, the device 
    will apply the image in the profile. 
	
.. NOTE::
   If a thin client that is using LeTOS 1.1 or 1.2 is receiving a disk image upgrade 
   through a Windows Share (``cifs://``) storage location, the SHA1 of the disk image 
   will need to be entered in place of the MD5 Sum. This is always required regardless 
   of legacy status.
   