# OS Build Date and LTM Agent

## Verifying OS Build Date

To verify the Operating System Build Date, follow these steps:

1. Power on the thin client and log in to an Administrator account.
2. Click on the computer-shaped icon on the desktop, titled "System Information" to open the **LTM Agent System Information** window.  This icon is also located in the task bar.  For more information on **System Information**, please see *LTM Agent System Information*.
3. The current OS build is posted under the **Operating System** field.
	
## Verifying LTM Agent Version and Status

To verify the LTM Agent version and status, follow these steps:

1. Power on the thin client and log in to an Administrator account.
2. Open the Windows **Control Panel** from the **Settings** option of the **Start** menu.  Under **Programs**, select the **Uninstall a program** option.
3. The LTM agent will be the installed program labelled *Echo Agent-month-day-year*.
4. To verify the status of the LTM Agent, open the Windows **Control Panel**.  Under **System and Security**, select the **Administrative Tools** option. 
5. Open the **Services** option and locate the **DeTOS Agent Service**.  The DeTOS Agent status must be *Started* and the startup type must be **Automatic** for the LTM Agent to be fully functional.
