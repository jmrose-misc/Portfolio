Connection Variable Substitution
--------------------------------

Connection variable substitution is an advanced feature. This allows users to
use a variable as a place holder for information. The information will be
filled in with device-specific data when pushed to the client. This feature
makes it more convenient for users who need to create multiple connections with
minor variances but otherwise identical information. These variables are
identical to the parameters exposed by the device endpoint on the ReST
interface:

-  ``agent_version`` - The agent version. This can be found in the "View
   Device" information window within the **Devices** inventory table.
-  ``description`` - The device's description. This is a legacy option
   for older versions.
-  ``disk_image_md5sum`` - The md5 sum of the disk image. This is a
   legacy option for older versions.
-  ``disk_image_version`` - The disk image version. This can be found
   in the "View Device" information window within the **Devices**
   inventory table.
-  ``hostname`` - The device's hostname. This can be found in the "View
   Device" information window within the **Devices** inventory table.
-  ``id`` - The device's ID.
-  ``ip_address`` - IP address of the device. This can be found within
   the **Devices** inventory table.
-  ``jid`` - The server communication protocol (i.e. "SOAP" or "AMQP").
-  ``last_contact`` - Time stamp of the last heartbeat sent from the
   device to LTM.
-  ``location`` - The device's location. This is a legacy option for
   older versions.
-  ``mac_address`` - The device's MAC address. This can be found in the
   "View Device" information window within the **Devices** inventory
   table.
-  ``name`` - The device's name/ This can be found within the **Devices**
   inventory table.
-  ``serial`` - The device's serial number. This can be found in the
   "View Device" information window within the **Devices** inventory
   table.
-  ``uuid`` - The device's UUID. This can be found in the "View Device"
   information window within the **Devices** inventory table.

Advanced users may access data hierarchically by using `.` to access child
properties. This allows the use of the following data:

-  ``product.id`` - The ID of the device's product.
-  ``product.manufacturer`` - The manufacturer of the device.
-  ``product.model`` - The model of the device.
-  ``product.os`` - The operating system of the device.

.. NOTE::
   Groups are not available for variable substitution.

.. raw:: LaTeX

     \newpage

As an example, a Firefox connection may be created that will connect to a URL
based on its hostname. In the "Start URL" field, ``{{hostname}}.example.com``
may be entered. If this connection is later pushed to a device who's hostname
is ``host01``, it would try to connect to ``host01.example.com``. If pushed to
a device with the hostname ``host02`` it would connect to
``host02.example.com``.

Variable substitution supports "regular expression replacement" through use of
perl-compatible regular expression (PCRE) syntax. This allows for the
replacement of substrings after a variable is substituted. This can be invoked
with the following syntax::

    {{replace variable s/search-string/replacement-string/g}}

If, for example, there was a Firefox connection that connects to a specific
URL, it would be possible to replace a portion of the URL based on the numeric
portion of the device's name in inventory. In the "Start URL" field, enter::

     {{replace name s/\\w\*(\\d+)/there-are-\\1-lights/g}}.example.com

This connection, when pushed to a device named ``device04``, will try to
connect to ``there-are-04-lights.example.com``.

.. NOTE::
   Forward slashes are the only supported separators. Any forward slashes that
   are part of either the search or replacement string will need to be escaped.

.. raw:: LaTeX

     \newpage