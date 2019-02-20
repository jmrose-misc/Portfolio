.. _tasks-reference:

Tasks
-----

Device activities can be deferred for later execution, and can be set to
repeat at a schedule, if desired.

How to Create a New Task
~~~~~~~~~~~~~~~~~~~~~~~~

#. From the **Devices** inventory table, select one or more devices that
   will be receiving a new task.

#. Many device activities are eligible to be assigned as a scheduled
   task. This includes applying to devices and powering off, powering
   on, and rebooting devices.

#. When the activity has been selected, there will be the option to
   execute the action immediately, or to schedule it as a task for
   later. When creating a task, the following options are available:

   -  **Task Name** - Enter a name for the task.

   -  **Date/Time** - Select the date and time for the task to begin its
      initial run.

   -  **Retries** - The number of attempts the Management Appliance will
      make to execute the task should networking or other issues occur
      while the task is being executed.

   -  **Frequency** - The rate at which the task will be performed. A
      custom frequency can also be entered.

#. Click the checkmark at the top right corner of the panel to assign
   the task. The task will remain in the **Tasks** inventory table, even
   after it has completed its run.

#. If a task is still running, it can be edited within the **Tasks**
   inventory table by clicking on the **Edit** icon next to the task’s
   name. This will allow changes to a task’s schedule or even halt the
   actions of a task, if necessary.

   -  **Grey Dot** - The task is **Ready**, but has not yet run.

   -  **Spinning Circle** - The task is currently **Running**.

   -  **Green Checkmark** - This indicates the task is **Finished** if it
      was meant to be executed once, is **Passing** is the task is to
      repeat, or is **OK** if the task has completed all reoccurring
      instances.

   -  **Yellow Exclamation Point** - This task is currently **Failing**.

   -  **Red X-mark** - The task has **Failed**.

Tasks that are scheduled to continue running will display the date and time 
of its next scheduled run. If a task is set to only run once, then no date 
or time will appear once the run has been completed.

.. raw:: LaTeX

     \newpage