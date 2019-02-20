Server Settings
---------------

Users can adjust the Web Application settings. The table of settings notes
whether the setting is an Integer or a String, the current value of the
setting, and the default value. Settings will apply after a server restart.

`HostAgent/Heartbeat/Max`
    Sets the maximum amount of time, in seconds, on the interval of a device's
    heartbeat. This reduces flooding the network with information from multiple
    devices at once.
`HostAgent/Heartbeat/Min` 
    Sets the minimum amount of time, in seconds, on the interval of a device's
    heartbeat. This reduces flooding the network with information from multiple
    devices at once.
`HostAgent/Heartbeat/Timeout`
    Sets the amount of time, in seconds, before the server will consider a device
    that is not sending a heartbeat to be offline. Offline devices will display
    with a red dot in the Devices inventory table.
`Inventory/SyncDeviceNameToHostname`
    Sets a device name to match the device hostname, when the device hostname
    changes. Set this value to 0 to disable, or 1 to enable. This settings
    requires a server restart to apply the change.
`Server/Audit/MaxEntries`
    Sets the maximum number of entries saved in the Audit Trail logs. This
    value may be set at `-1` for no entry limit, or `0` to disable audit trail
    logging.
`Server/EthInterface`
    Sets the ethernet interface that the server runs on. Leave this at the 
    default value.
`Server/IdleTimeout`
    Sets the time, in seconds, of inactivity before the Web Application
    automatically logs out. There is a 30 second warning before the logout
    occurs. Setting this value to `-1` disables the idling timer. Refreshing
    the page applies this setting instead of rebooting the server.
`Server/LibPath`
    Sets the path for the server's dependencies. Leave this at the default 
    value.
`Server/Logs/MaxEntriesPerDevice`
    Sets the maximum number of log entries saved per device. Setting this value
    to `-1` will remove the entry limit.
`Server/MaxActiveDiscoveries`
    Sets the maximum number of devices that Rangewalk may discover
    simultaneously. These requests are processed in chunks, so large ranges
    are acceptable.
`Server/MaxDeviceActionThreads`
    Sets the maximum number of simultaneous device actions that the server can
    perform at once. These requests are processed in chunks, so large ranges
    are acceptable.
`Server/RunPath`
    Sets the path of the server's executable. Leave this at the default value.
`Server/Scep/CertificateRequestAddress`
    Sets the address where the client device will request the certificate from.
    This will usually be `http://<WindowsServerDN>/CertSrv/mscep/mscep.dll`.
`Server/Scep/ChallengeAddress`
    Sets the address where the management server will retrieve the enrollment
    challenge information to forward to the client device. This will usually be
    `http://<WindowsServerDN>/CertSrv/mscep_admin/`.
`Server/Scep/Identity`
    Sets the anonymous identity used during the first phase of EAP-TLS
    authentication. This is usually the same account that is running the NDES
    service on Windows Server.
`Server/Scep/Password`
    Sets the password of the user account that will retrieve the SCEP challenge
    information.
`Server/Scep/Username`
    Sets the username of the user account that will retrieve the SCEP challenge
    information. This authenticates against the MSCEP IIS website.
`Server/SocketPath`
    Sets the path of the server's communication socket. Leave this at the 
    default value.
`Server/Username`
    Sets the system user that executes the server. Leave this at default value.
`Server/ShadowTimeout`
    Sets the time, in seconds, before an idle Shadow connection times out.
    This timer is specific to inactivity from the administrator's window, not
    from the client desktop.
`Server/WWWGroup`
    Sets the Unix group that the web server runs under. Leave this at the
    default value.


.. CAUTION::
   Adjusting the `Server/EthInterface`, `Server/LibPath`, `Server/RunPath`, 
   `Server/SocketPath`, `Server/Username`, or `Server/WWWGroup` settings will
   result in the server failing to run.