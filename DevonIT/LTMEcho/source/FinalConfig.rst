Final Configuration Steps
-------------------------

DNS Configuration
~~~~~~~~~~~~~~~~~

By default, devices running LeTOS™ will attempt to resolve two types of
DNS records:

-  A top-level, Host(A) Record named :code:`ws-broker`.

-  An SRV record named :code:`_mgr._tcp`.

It is recommended for simple deployments that the administrator use the
first approach, and create a single DNS entry for **ws-broker**,
assigned to the static IP configured for the Management Appliance. For
example:

+ :code:`ws-broker.myXyzConsulting.com`

+ :code:`ws-broker.HiTechSolutions.net`

+ :code:`ws-broker.development.org`

In more complicated deployments where high availability is required it
is recommended that an SRV record be used instead. Assigning a number of
IP addresses for multiple instances of the Management Appliance allows
for management reliability in failover scenarios.
