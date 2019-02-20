Introduction to EWF and FBWF
----------------------------

By default, the EWF (Enhanced Write Filter) is enabled when a thin
client with WE8S is first powered on. This write filter makes it so the
terminal is in a non-persistent state. When enabled, the EWF allows no
changes to remain, without exception. Any changes made to the software,
any new software installed, and any settings that are changed will
revert to their original state upon reboot. However, there are times
when an administrator may want to install new software, such as language
MUI packs, and must disable the EWF.

If desired, the EWF can be disabled and the FBWF can be enabled. The
difference between the two is that it is possible to make exceptions to
the FBWF, such as allowing Administrators to make changes, but not
users.

The FBWF (File-Based Write Filter) is an intelligent filtering system
that grants protection to specific volumes of the local drive from write
access, while simultaneously keeping less important files anti-virus
databases or a user's Documents and Settings folder persistent. The FBWF
allows users to decide which directories are persistent and which are
transient. Persistent files are files that are not protected by the FBWF
filter, and all changes, good or bad, will survive after rebooting.
Transient files are files that are protected by the FBWF filter and all
changes that are made to these files are neglected and forgotten upon
rebooting he thin client.

How Does FBWF Work?
~~~~~~~~~~~~~~~~~~~

When the FBWF is enabled, it makes files secure from that instance.
Rebooting the thin client will revert the system immediately back to the
state it was in when FBWF was selected t be enabled, like a restore
point. As long as FBWF is enabled, it is in a safe state. It stays safe
because it writes all changes made on the system on an *overlay* in the
RAM memory cache. An overlay can be thought of as a protective layer
over the disk. All changes made to the disk are written on a transparent
layer instead of the actual disk. When the thin client looks for
information on the disk, all upgrades and new installs can be found and
accessed because it is written on the overlay which is covering the
disk.

However, once the thin client is rebooted, the memory cache is erased,
and the overlay is wiped clean, with no changes made. The system
automatically resumes from the same point it was when the filter was
enabled.

To install new hardware and software, or to upgrade any existing
programs or applications on the system, FBWF will have to be disabled.
It is important to re-enable FBWF as soon as the installation is
complete so that the thin client is protected from unnecessary disk
writes. As long as there are no installations or upgrades in progress,
it is recommended that the FBWF is left in an enabled state for optimal
performance. As long as the FBWF is enabled, the thin client is safe
from malicious network attacks or accidental uninstalls.

.. raw:: LaTeX

     \newpage

.. _useFBWF-reference:
	 
Using the FBWF
~~~~~~~~~~~~~~

The FBWF operates by providing a *shadow write* to the system RAM. When
enabled, any writes that are normally written to the storage media are
instead redirected to the RAM overlay. During a reboot, this overlay is
discarded so the operating system remains in its original state. As its
name implies, FBWF is based on files. This means certain files and
directories can be excluded from the protection of the write filter. Any
files that are in this list are ignored by the FBWF and subject to
modification or deletion, just as they normally would on any standard
Windows-based environment. Lenovo thin clients include a management
utility for configuring the FBWF. The FBWF Manager utility can only be
accessed by Administrators.

To open the **FBWF/EWF Manager**, log-in as the administrator.

1. Locate the **LTM Control Panel** on the desktop and open it.
2. Once the **LTM Control Panel** is open, access the **FBWF/EWF
   Manager** page.

By default, FBWF is enabled with the basic exclusions set for the
**Persistent Registry** and **Documents and Settings** for all users.
This means that any changes mane under the "C:\\Documents and Settings"
folder, such as desktop icons, start menu items, and browser favourites,
will be written directly to the flash device immediately and without
overlay protection.

What is Persistence?
~~~~~~~~~~~~~~~~~~~~

Persistence in its simplest definition is the term used to describe data
on a local drive or disk that exists and survives from session to
session. Persistent data will be secure after every reboot and every
change made will be applied until another user reconfigures the changes.
If the FBWF is not installed on the terminal for protection, then the
local drive will remain in a Persistent state. All changes made to the
desktop, program files, user settings files, or important system files
are permanently stored on the drive or disk. In the unfortunate event of
a malicious network attack or virus, files risk being harmed in the
process if Persistence is disabled. When the FBWF filter is enabled and
files can be protected, all changes made, including accidental virus
entries, are wiped upon reboot.

.. raw:: LaTeX

     \newpage

Adjusting FBWF's Cache Threshold Limit
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

The disk space reserved for FBWF's file system can be increased based on the 
needs of the user. By default, FBWF's cache threshold limit is set to 128mb
on 32-bit WE8S images, while 64-bit WE8S images offer 256mb. The maximum 
threshold allowed is 1GB.

1. Log in to the desktop as an administrator. Open the **LTM Control Panel**.
2. Access the **FBWF/EWF Manager** page and ensure that the FBWF is enabled. 
   If the FBWF is not enabled, click on the Enable option. Be sure to include 
   the bottom two basic exclusions.  Reboot the thin client once the FBWF 
   changes have been applied and log back in to the administrator desktop.
3. Once the FBWF has been confirmed as enabled, open the Windows Command 
   Prompt. Type the following command to set the FBWF Cache Threshold to 1GB: 
   'fbwfmgr /setthreshold 1024', excluding the quotes. Run the command, and 
   then reboot the device. This will increase the WE8S operating system's 
   write limit while the device is booted. The FBWF Cache Threshold is cleared 
   whenever the thin client is rebooted.

.. NOTE::
   This FBWF configuration can be cloned with LTM and pushed to other devices.

.. raw:: LaTeX

     \newpage 