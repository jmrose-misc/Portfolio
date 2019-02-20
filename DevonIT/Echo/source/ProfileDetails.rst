Profile Details
---------------

.. index::
   single: Profiles

Name
    The name of the profile. The name is a required field when a new profile is 
    being created. 
Description
    A human readable description such as "Demonstration Profile." The 
    description field is optional, but it is generally a good idea to utilize 
    descriptions to help organize profiles. 
Mode
    The Mode dropdown menu provides four methods that can be used to apply the 
    selected profile to devices. These modes are prioritized, meaning that if 
    users attempt to apply two profiles to the same device using different 
    modes, the profile with the higher priority mode assigned to it will be 
    implemented while the other is ignored. These modes, in order of priority 
    from highest to lowest, are:

    Default Profile
        A profile created in the Default Profile mode is automatically applied 
        to any new device that connects to the Echo server.
    Select Devices
        The administrator directly chooses which devices the profile is applied 
        to. If two or more profiles with overlapping options are applied to the 
        same device using the Select Devices mode, the most recently applied 
        profile takes precedent for that option. If Select Devices is chosen, 
        the Devices dropdown menu will appear to allow the administrator to 
        select which devices to apply the profile to. 
    Terminal Details
        A profile created with the Apply by terminal details mode specifically 
        targets certain types of devices to apply itself to. Device name, IP 
        Address or range, model, and operating system are all options an 
        administrator can use to specify devices. If Apply by terminal details 
        is chosen, Details options will appear. The administrator can fill out 
        the fields as needed to target the desired devices. 
    Group Membership
        A profile created for specific groups that devices apply to. The 
        profile can apply to multiple groups, if necessary. If Apply by group 
        membership is chosen, the Groups dropdown menu will appear to allow the 
        administrator to select which group to apply the profile to. 
Disk Image
    An administrator can use the dropdown menu in the Disk Image section to select 
    which saved disk image will be included in the profile.
Connections
    An administrator can use the dropdown menu in the Connections section to select 
    which saved connections will be included in the profile.
Device Settings
    An administrator can use the dropdown menu in the Device Settings section to 
    select which saved device settings will be included in the profile.
Certificates
    An administrator can use the dropdown menu in the Certificates section to 
    select which saved certificates will be included in the profile.
Software Packages
    An administrator can use the dropdown menu in the Software Packages section to 
    select which saved software packages will be included in the profile.