# Understanding the Thin Client

## Users and Groups

### What is a User Account?

The term user account should not be confused with the actual User account that is the default account upon log-in.  For each person using the terminal, the owner can create an individual account.  Each user account created may have certain rights or permissions as chosen by the Administrator account.  The Administrator account is able to create, delete, and edit each of the user's settings whenever needed.

### User Account

The User Account is the account that will automatically log-in at every boot.  It is also the account that should be used for guests or any user that should be prohibited from modifying the thin client or its local drive in any way.  There is no password on this account by default.  The User Account holder may change the account picture and create, delete, or change their account password.  The User Account cannot edit its own account name or account type, nor can it install or uninstall any software.  It may, however, use software installed by the Administrator account.

### Administrator Account

By default, the User Account is automatically logged in.  To bypass this automatic log-in process, press and hold the **Shift** key during the boot process, before the automatic sign-in. This will enable account selection.  If an account is currently logged in on a desktop, then it is possible to switch to a different account by accessing the Account menu on the upper right-hand side of the **Start** screen and selecting the account that will be used instead.

**NOTE:** The default password for the Administrator is 000000.

Logging into the Administrator account should be very similar to the User account, with some additional icons on the desktop.  Unlike the User account(s), the Administrator account can:

* Install and uninstall hardware and software.
* Create and delete user accounts on the terminal.
* Add or edit account passwords for user accounts on the terminal.
* Edit names, pictures, and passwords.
* Upgrade a user's account type to have administrator access.

**NOTE:** The Administrator account cannot downgrade its own account type to a limited User account type unless there is at least one other account with administrator privileges on the thin client. This ensures that there is always at least one administrator-level account on the thin client.

## Creating New User Accounts

This section details how to create new users.  First, log into the desktop using the Administrator account or an account with administrator privileges.

1. Open the **Start** menu and access the **Control Panel** from the **Settings** option.
2. Open the **User Accounts** option, select the "User Accounts" option presented, and select **Manage another account**.
3. Select the option to **Add a new user in PC Settings**.  Enter a name for the new user account. 
   
![New User Account Creation](C:/Documentation/WES8/we8s-administration-guide/UnderstandingTheThinClient/assets/Screenshot2.png)

4. Choose between either the **Administrator** or **Standard user** account types.  Once finished, select **Create Account** to complete the process.

### Introduction to EWF and FBWF

By default, the EWF (Enhanced Write Filter) is enabled when a thin client with WE8S is first powered on.  This write filter makes it so the terminal is in a non-persistent state.  When enabled, the EWF allows no changes to remain, without exception.  Any changes made to the software, any new software installed, and any settings that are changed will revert to their original state upon reboot.  However, there are times when an administrator may want to install new software, such as language MUI packs, and must disable the EWF.

If desired, the EWF can be disabled and the FBWF can be enabled.  The difference between the two is that it is possible to make exceptions to the FBWF, such as allowing Administrators to make changes, but not users.

The FBWF (File-Based Write Filter) is an intelligent filtering system that grants protection to specific volumes of the local drive from write access, while simultaneously keeping less important files anti-virus databases or a user's Documents and Settings folder persistent.  The FBWF allows users to decide which directories are persistent and which are transient.  Persistent files are files that are not protected by the FBWF filter, and all changes, good or bad, will survive after rebooting.  Transient files are files that are protected by the FBWF filter and all changes that are made to these files are neglected and forgotten upon rebooting he thin client.

### How Does FBWF Work?

When the FBWF is enabled, it makes files secure from that instance.  Rebooting the thin client will revert the system immediately back to the state it was in when FBWF was selected t be enabled, like a restore point.  As long as FBWF is enabled, it is in a safe state.  It stays safe because it writes all changes made on the system on an *overlay* in the RAM memory cache.  An overlay can be thought of as a protective layer over the disk.  All changes made to the disk are written on a transparent layer instead of the actual disk.  When the thin client looks for information on the disk, all upgrades and new installs can be found and accessed because it is written on the overlay which is covering the disk.

However, once the thin client is rebooted, the memory cache is erased, and the overlay is wiped clean, with no changes made.  The system automatically resumes from the same point it was when the filter was enabled.

To install new hardware and software, or to upgrade any existing programs or applications on the system, FBWF will have to be disabled.  It is important to re-enable FBWF as soon as the installation is complete so that the thin client is protected from unnecessary disk writes.  As long as there are no installations or upgrades in progress, it is recommended that the FBWF is left in an enabled state for optimal performance.  As long as the FBWF is enabled, the thin client is safe from malicious network attacks or accidental uninstalls.

### Using the FBWF

The FBWF operates by providing a *shadow write* to the system RAM.  When enabled, any writes that are normally written to the storage media are instead redirected to the RAM overlay.  During a reboot, this overlay is discarded so the operating system remains in its original state.  As its name implies, FBWF is based on files.  This means certain files and directories can be excluded from the protection of the write filter.  Any files that are in this list are ignored by the FBWF and subject to modification (or deletion) just as they normally would on any standard Windows-based environment.  DevonIT thin clients include a management utility for configuring the FBWF.  The FBWF Manager utility can only be accessed by Administrators.

To open the **FBWF/EWF Manager**, log-in as the administrator.

1. Right-click on the **LTM Control Panel** and select the **Run as Administrator** option. If this option is not selected, the LTM Control Panel will not open.
2. Once the **LTM Control Panel** is open, access the **FBWF/EWF Manager** page.

By default, FBWF is enabled with the basic exclusions set for the **Persistent Registry** and **Documents and Settings** for all users.  This means that any changes mane under the "C:\\Documents and Settings" folder, such as desktop icons, start menu items, and browser favourites, will be written directly to the flash device immediately and without overlay protection.

### What is Persistence?

Persistence in its simplest definition is the term used to describe data on a local drive or disk that exists and survives from session to session.  Persistent data will be secure after every reboot and every change made will be applied until another user reconfigures the changes.  If the FBWF is not installed on the terminal for protection, then the local drive will remain in a Persistent state.  All changes made to the desktop, program files, user settings files, or important system files are permanently stored on the drive or disk.  In the unfortunate event of a malicious network attack or virus, files risk being harmed in the process if Persistence is disabled.  When the FBWF filter is enabled and files can be protected, all changes made, including accidental virus entries, are wiped upon reboot.

## Installing Additional Software

Third-party licensed software may be installed, as long as there is adequate space on the flash media.

To install additional software applications:

![FBWF Disabled](C:/Documentation/WES8/we8s-administration-guide/UnderstandingTheThinClient/assets/Screenshot4.png)

1. Log in to the desktop as an administrator. Right-click on the **LTM Control Panel** and select the **Run as Administrator** option.
2. Access the **FBWF/EWF Manager** page.  Temporarily disable the write filter by selecting the **Disable Restrictions** option.  Press the **Apply** button to save this change and disable FBWF.
3. Reboot the thin client. Log back into an administrator account and install the new software.
4. After installation, verify that the application is working as expected.
5. To re-enable the FBWF, open the **LTM Control Panel** and access the **FBWF/EWF Manager** page.  Select the **Enable FBWF** option.  If they are currently not selected, re-enable the **Documents and Settings for Everyone** and **Persistent Registry** options.  There will be no exclusions for EWF if that is enabled.  Press the **Apply** button to save the changes.

![FBWF Enabled](C:/Documentation/WES8/we8s-administration-guide/UnderstandingTheThinClient/assets/Screenshot3.png)
