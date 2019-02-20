# Using the Thin Client

## Customizing the Thin Client

This section details how to change some of the options on the thin client to fit any home or business requirements.

### Disabling the Automatic Log-In

1. Holding down the **Windows** button, press <**R**> to access the Run: dialogue box.  Enter "*control userpasswords2*" (without quotations).
2. Check the box that says **Users must enter a user name and password to use this computer**.  Select **Administrator account**.  Press **Apply** to save all changes.
3. After the initial boot-up, or when booting up after using the re-imaging utility, the thin client will display the Windows Embedded desktop, taskbar, and system tray.

## Thin Client Options

### Connections

The thin client has the ability to connect to remote servers using several types of protocols.  The Remote Desktop client uses the RDP protocol and allows connectivity to Microsoft Windows Terminal Servers.  The Citrix ICA client is used to establish connections to the Citrix Xen servers via Citrix Online Plug-in.  The VMware Horizon View client allows connectivity to a VMware Horizon View server, which provides end-users with an individualized virtual desktop session.  Lastly, Internet Explorer may be used to surf the web.  This can be used for several purposes:

* Connect to web applications; e.g., a webmail server.
* Connect to a connection broker interface; e.g., Citrix Online Plug-in.

### System Settings

These are the thin client's display, sound, keyboard, mouse, printer, and date/time configurations.  The **Control Panel** also offers the ability to set a password for the thin client, as well as change the local disk settings (See **Using the FBWF**).

## LTM Agent System Information

### LTM Management

This displays the current status and information of the LTM Management server that the thin client is currently associated with.

* **Management Status** displays when the thin client is being managed by an LTM server.
* **Management Server** displays the current address of the LTM server.
* **Change Management Server** allows the LTM server to be changed.
* **UUID** displays the current UUID assigned to the thin client.

### Network Information

This displays information about the current network connection.

* **IP Address** displays the current IP address assigned to the thin client.
* **MAC Address** displays the current MAC address assigned to the thin client.
* **Hostname** displays the named assigned to the thin client.
* **Network Tools** allows a diagnostics test with the network connection to run and check on the current status of the network connection itself.

### System Information

This displays information  regarding the thin client, as well as information about the operating system.

* **Operating System** displays the name of the image or operating system that is in use.
* **Processor** displays the processor that the thin client is using.
* **Memory** displays the total storage memory of the thin client.
* **DOM size** displays the total storage capacity of the thin client.
* **Hardware Model** displays the name of the thin client in use.

![System Information](C:/Documentation/WES8/we8s-administration-guide/UsingTheThinClient/assets/Screenshot12.png)

## USB Redirection in VMware

By default, USB redirection in VMware Horizon View is not installed.  In order to enable USB redirection in VMware Horizon View:

1. Log in as an Administrator and disable the FBWF from the **LTM Control Panel.**  Remember that the **LTM COntrol Panel** can only be opened by right-clicking on the desktop icon and selecting the **Run as Administrator** option.
2. Download VMware Horizon View, which can be found [here.](https://download3.vmware.com/software/view/viewclients/VMware-viewclient-5.4.0-1219906.exe)
3. When the download is complete, open the client application through the EXE file.
4. Follow the on-screen instructions that are presented.  When the **Modify** option appears, select that option before continuing.
5. Select **USB Redirection** from the drop-down menu that appears. Select **This feature will be installed on the local hard drive** before continuing.
6. Press the 8*Finis8h* button to complete the process.  Once complete, the FBWF may be re-enabled, if desired.
