VMware Horizon View
-------------------

The VMware Horizon View client allows you to connect to a VMware server,
which in turn, provides the end-user with their own virtual desktop
session. The following section describes the basic steps for configuring
the View Client.

.. figure:: C:/Documentation/WES8/source/media/Screenshot11.png
   :alt: VMware Horizon View

   VMware Horizon View

Server Address
    Enter the Hostname or IP address of the VMware Horizon View Broker.
Credentials
    Specify the User Name and Password of the default user account.
Domain-
    Specifies the domain to log on to.
Desktop Name
    The name of the desktop can be entered if a connection should always 
    be made to the same desktop. If the field remains empty, then the user 
    may be prompted to select an available desktop upon connecting to the 
    server.
Protocol
    Choose whether to connect to the server using the RDP or PCOIP protocol.
Enable background on startup
    Selecting this option will cause the client to expand to fullscreen and 
    lock the desktop layout to a single monitor, fullscreen display.
Desktop Layout
    Choose the desktop option that best suits the display setup. If Enable 
    background on startup is selected, this will lock to a single monitor, 
    fullscreen display.
Autostart
    Enable this checkbox to automatically launch this session after the thin 
    client completes its boot procedure.
    
    To auto-start a program, the FBWF filters will need to following exclusions 
    added to the exclusion list: :code:`\ProgramData\Microsoft\Windows\Start Menu\Programs\Startup`, :code:`\DevonIT`.
    For more information on using the FBWF, refer to the :ref:`useFBWF-reference` 
    section. Once these exclusions are included and applied, reboot the thin client. 
    The autostart feature will take effect immediately.	

Troubleshooting Tips for VMware Horizon View Connection
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

-  If the session is set to full screen but the display covers only a
   fraction of the entire screen, then the allocated RAM for the virtual
   desktop may need to be set a little higher.
-  If certain features like foreign key maps, CD-ROM, USB stick, or
   printer redirection are not passing through to the virtual desktop
   session, check if the VM is at the correct version. The latest agent
   software executables can be downloaded at `the VMware
   website. <http://www.vmware.com/downloads>`__
-  If USB flash drives are to be used within the session, it is best to
   use sticks formatted in FAT or NTFS. Long delays sometimes occur when
   using flash drives formatted in FAT32. Other USB troubleshooting tips
   can be found at `the VMware
   site. <http://kb.vmware.com/kb/1026991>`__