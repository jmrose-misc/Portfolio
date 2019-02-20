Citrix ICA
----------

The Citrix Receiver™ client allows a connection to Citrix XenAppView
Servers (formerly known as Presentation Server™). This Citrix client
also contains the necessary plug-in used for connecting to XenDesktop
via the thin client's local web browser.

The Connection Section
~~~~~~~~~~~~~~~~~~~~~~

.. figure:: C:/Documentation/WES8/source/media/Screenshot7.png
   :alt: Citrix ICA

   Citrix ICA

The first section displayed for a Citrix ICA session is Connection. This
form panel will already be expanded.

Connection Type
    Select from either a *Local Area Network* or a *Wide Area Network* from 
    the drop-down menu.
Server Location
    Type in the IP address or hostname of the server.
Protocol
    Select the appropriate protocol needed to connect to the server. There may 
    be multiple methods available for connecting to the server:
   -  **Server-** To connect to the desktop of the server, click the radio
      button called Server.
   -  **Published Application-** To directly connect to a published
      application on the server, select the radio button called Published
      Application.

.. raw:: LaTeX

     \newpage
	  
The Options Section
~~~~~~~~~~~~~~~~~~~

.. figure:: C:/Documentation/WES8/source/media/Screenshot8.png
   :alt: Citrix Options

   Citrix Options

Window Size
    Select the type of window the session will display in.
   -  **Full screen-** The session will take up the entire display.
   -  **Fixed Size-** A fixed window size may be selected, such as 640x480, 800x600, and 1024x768.
   -  **Percentage Based-** A size may be selected that is based on the percentage of available 
      desktop display, such as 25%, 50%, and 75%.
   -  **Seamless-** When using the Published Application feature, selecting Seamless mode will 
      launch applications directly on the desktop, without using the Citrix Window.
Windows Colors
    Color depth options are 16 colors, 256 colors, 16-bit, and 24-bit.
Sound Quality
    Adjust the sound from Low, Medium, or High Quality.
Citrix SLR (Speed Screen Latency Reduction) Options
    Enabling the following two options are usually only needed when high latency is 
    occurring or poor bandwidth conditions exist.
Mouse Click Feedback
    The mouse cursor will change to an hourglass as soon as a user performs a mouse click 
    on an event and will wait for a response from the server before it changes back.
Local Text Echo
    This option allows a user to see the character they type into their session on the screen, 
    without this key press hitting the actual server at that time.
Encryption
    Select the appropriate level of encryption to be used when connecting to this Citrix Server.

.. raw:: LaTeX

     \newpage
	
Autostart
    Enable this checkbox to automatically launch this session each time the thin client completes 
    its boot procedure.
    
    To auto-start a program, the FBWF filters will need to following exclusions 
    added to the exclusion list: :code:`\ProgramData\Microsoft\Windows\Start Menu\Programs\Startup`, :code:`\DevonIT`.
    For more information on using the FBWF, refer to the :ref:`useFBWF-reference` 
    section. Once these exclusions are included and applied, reboot the thin client. 
    The autostart feature will take effect immediately.	
Use data compression
    In an environment where system and client resources are not a concern, data compression can be 
    used to decrease the amount of data that must be sent across the network.
Use disk cache for bitmaps
    Allows graphical objects to be stored in the local disk cache on the client device.

The Firewall Settings Section
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

Use alternative address for firewall connection
    Mark this checkbox if the session needs to connect to the Citrix server's external IP address. 
    The external address for the server is specified as the alternate address.
Proxy Settings
    If the Citrix environment uses a proxy server, an appropriate type will need to be selected 
    from the Proxy Type field. Enter the address of the proxy server and port number in the Proxy 
    Address and Proxy Port fields, respectively.

The User Logon Section
~~~~~~~~~~~~~~~~~~~~~~

User Name
    Specify the name of a user account to log on as. This is an optional field.
Domain
    Specify the domain to log on to. This is an optional field.

The Application Section
~~~~~~~~~~~~~~~~~~~~~~~

Application
    Specifies the path of the application on the Citrix server to be automatically 
    launched when the connection is made. This is an optional field.
Working Directory
    Specifies the working directory used for the application.

.. raw:: LaTeX

     \newpage