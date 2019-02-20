Internet Explorer Web Browser
-----------------------------

.. figure:: C:/Documentation/WES8/source/media/Screenshot6.png
   :alt: Internet Explorer

   Internet Explorer
The following section describes the steps for configuring the local
Internet Explorer web browser.

Start URL 
    Specifies the initial web page to appear when the browser is 
    first launched.
Enable Kiosk Mode 
    Sets the web browser to kiosk mode, hiding navigation features 
    and disabling the ability to exit.
Autostart 
    Enable this checkbox to automatically launch this session after 
    the thin client completes its boot procedure.
    
    To auto-start a program, the FBWF filters will need to following exclusions 
    added to the exclusion list: :code:`\ProgramData\Microsoft\Windows\Start Menu\Programs\Startup`, :code:`\DevonIT`.
    For more information on using the FBWF, refer to the :ref:`useFBWF-reference` 
    section. Once these exclusions are included and applied, reboot the thin client. 
    The autostart feature will take effect immediately.

.. raw:: LaTeX

     \newpage