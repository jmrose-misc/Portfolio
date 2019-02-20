.. index::
   single: Time

.. index::
   single: Locale

Input and Time Settings
------------------------

This section allows configuration of the locale, keyboard, mouse, and
time settings for the thin client.

1. Open the **LeTOS Control Panel** from the **Start** menu.

2. Select the **Input/Time** settings on the left-hand side of the
   **Control Panel** under the **System** settings.

    .. figure:: media/image015.png
       :alt: Input and Time Settings 

    Locale
        English is the default locale setting. Switching to a
        new locale will immediately adjust the system locale and translate
        the user interface of the local LeTOS desktop to the selected
        language.

    Keyboard
        **US** is the default keyboard input setting. Switching to
        a new keyboard input will alter the keyboard mapping immediately
        after selecting **Apply**.

    Left-handed Mouse
        Select this checkbox to invert the right and
        left mouse buttons for a left-handed mouse.

    Timezone
        The time zone options are organized geographically by
        region first and then by city. Select the appropriate time zone
        location.

    Timeserver
        Defining a timeserver allows the terminal to query
        an NTP service in order to keep its date and time in sync. By
        default, this is enabled and set to the National Institute of
        Standards and Technology’s timeserver. Using a time server will 
        overwrite any system times and dates that were manually set in the 
        option below.

    Set System Time
        Clicking on this button will allow the system 
        time and date to be manually set. This will set the time in the BIOS 
        of the device, so a snapshot does not need to be taken to store this 
        option.
  
Press the **Apply** button for the changes to take effect.

.. raw:: LaTeX

     \newpage
