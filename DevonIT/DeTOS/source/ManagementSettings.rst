.. index::
   single: Management

Management Settings
===================

Management Server Configuration
-------------------------------

During boot up, if the thin client cannot make contact with a Management
Server, then a splash screen will appear just prior to the LeTOS desktop
loading. This screen contains a message saying, “Attempting to connect
to Management Server.” The splash screen will be displayed until
successful contact is made with a management server, the cancel button
is pressed, or the specified timeout (30 seconds by default) is reached.
The **Management Server Configuration** screen allows configuration of
the behavior of this splash screen, along with other management server
options.

1. Open the **LeTOS Control Panel** from the **Start** menu.

2. Click the **Management** settings on the left-hand side of the
   **Control Panel** under the **System** settings.

    .. figure:: media/image017.png
       :alt: Management Settings 

    Managed/Unmanaged
        By default, the thin client is set to Managed
        mode and will attempt to make contact with a management server.
        There is the option of severing all communications with a management
        server by selecting the **Unmanaged** radio button. Press **Apply**
        for this to take effect.

    Server Address
        While in managed mode, the thin client will
        maintain contact with a management server named ws-broker. Use this
        field to specify a different hostname or IP address for the
        management server.

    Splash Screen – Timeout
        Use this field to adjust the number of
        seconds the splash screen appears on the screen before it times-out
        and loads the LeTOS Desktop. Enter a value of 0 to bypass the screen
        altogether.

    Splash Screen – Allow Cancel
        A **Cancel** button is provided on
        the splash screen that allows the user to abort the timeout delay.
        Uncheck this box to hide the cancel button and force the user to
        wait the required amount of time.

        .. NOTE::
            The purpose of the splash screen feature is to gracefully handle network latency that may occur during the thin client’s first contact with a management server during boot up. This feature becomes vital in the case where there may be a management server applying connections to the thin client that are configured to Autostart on boot up.
    

Agent Password
--------------

A System Password can be set to restrict access to the **Control
Panel**.

To set the Password:

1. Open the **LeTOS Control Panel** from the **Start** menu.

2. Click the **Management** settings on the left-hand side of the
   **Control Panel** under the **System** settings.

3. Select the plus [+] to open the **Agent Password** section of this
   screen.

4. Enter a password in the password field and re-enter it in the
   confirmation field to set the new password.

5. Press the **Apply** button to save the password.

    .. NOTE::
        Once a system password is set, the user will be prompted for the password when they attempt to open the **Control Panel**. If the **Cancel** button is pressed or a user incorrectly types the password, then the **Control Panel** will open in a read-only mode. A small padlock icon will also appear along the bottom of the **Control Panel** window, indicating that edits are not allowed. Keep this password safe!

Security Restrictions
---------------------

This will allow screenshots to be taken within LeTOS.

To allow screenshots:

1. Open the **LeTOS Control Panel** from the **Start** menu.

2. Click the **Management** settings on the left-hand side of the
   **Control Panel** under the **System** settings.

3. Select the plus [+] to open the **Security Restrictions** section of
   this screen.

4. Click on the **Allow Screenshots (Print Screen)** checkbox to enable
   this feature.

5. Press the **Apply** button to save the changes.

6. Screenshots can be taken using the Print Screen button on the
   keyboard.

.. raw:: LaTeX

     \newpage   
