.. index::
   single: Management

Management Server Indicator
---------------------------

Once the LeTOS Desktop displays, the Agent running on the thin client
will continue to periodically contact a Management Server on the local
area network. By default, LeTOS will attempt to locate ws-broker, unless
a different Management server has been entered. When successful, the
Management **Server Indicator** box found along the bottom of the
**Control Panel** will read Managed. Otherwise, the icon will change to
a red circle and the status will say Unmanaged. In this case, verify
that the management server is online and accessible on the LAN. Also be
sure to check the DNS server to verify that an entry exists and points
to the IP address of the management server.

.. raw:: LaTeX

     \newpage