.. index::
   single: Sound

.. index::
   single: Video


Citrix HDX
----------
In order for USB audio and video communication devices, such as headsets and 
webcams, to properly work within Citrix environments, the HDX RealTime 
Connector will need to be installed to the Citrix virtual machines. Otherwise, 
the device(s) will be rejected. The Citrix files and installation instructions 
will be found `here <http://docs.citrix.com/en-us/hdx-optimization/1-8/hdx-realtime-install.html>`_.

.. NOTE::
   LeTOS comes with the HDX components pre-installed. No installation to devices is required.

.. CAUTION::
   Make sure that the client's HDX component version matches with the server's HDX Connector version. For example, RTME 1.8 on the client is not compatible with Connector 1.7 on the server.
   