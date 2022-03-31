# Oberon Task Manager
> The Oberon team consists of Oscar Ramirez, Grant Smith, Jacob Jordan, Justin Jimenez, Rafael Hernandez, who are trying to create a task manager that will help anyone determined to meet their goals to better oragnize their day.

> Live demo [_here_](https://www.example.com). <!-- If you have the project hosted somewhere, include the link here. -->

## Table of Contents
* [General Info](#general-information)
* [Technologies Used](#technologies-used)
* [Features](#features)
* [Screenshots](#screenshots)
* [Setup](#setup)
* [Usage](#usage)
* [Project Status](#project-status)
* [Room for Improvement](#room-for-improvement)
* [Acknowledgements](#acknowledgements)
* [Contact](#contact)
<!-- * [License](#license) -->


## General Information
![Example screenshot](https://i.imgur.com/QGHWdFm.jpg)

Image Description: A moon with a checkmark over it. This was voted on by the team as we feel it best represents our project, the moon representing our team name Oberon and the checkmark represnting a To-Do list.


- Provide general information about your project here.
- What problem does it (intend to) solve?
- What is the purpose of your project?
- Why did you undertake it?
<!-- You don't have to answer all the questions - just the ones relevant to your project. -->
***To be added***

## Technologies Used
- Java - latest version - https://www.java.com/en/download/manual.jsp
- Bitbucket - latest version - https://bitbucket.org/product
- Jira - latest version - https://www.atlassian.com/software/jira


## Features
- Task List Addition
	- Let User Add Tasks To List
	- Let User Add A Date To Each Task
	-Corresponding User Story:
		Oscar's 1st User Story
- Task List Removal
	- Let User Remove Tasks Off List
	-Corresponding User Story:
		Oscar's 1st User Story
- Task List Dsiplay
	- Allows User To See A List Of Tasks
	-Corresponding User Story:
		Oscar's 1st User Story
	
## 1st Sprint Contributions
***Grant Smith:***

Task: Create an extendable controller class.

https://cs3398s22oberon.atlassian.net/browse/OTM-20?atlOrigin=eyJpIjoiM2IxYTNiYmNkMjA5NGI2NjllMmZmYjFlZTVlMGUyNzAiLCJwIjoiaiJ9

Grant worked on the Controller file, Controller is an extendable class made for all controllers used in the MVC. 
In this case its used in the first version of TaskController, and by the model class as a settable controller, 
so extended classes like taskcontroller can be set freely without much modification.

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/src/master/SRC/Controller.java

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/33b7bcf3bb2af33b5cae6061e39989b3240d24e8

Task: Create an Extendable model class

https://cs3398s22oberon.atlassian.net/browse/OTM-11?atlOrigin=eyJpIjoiOTExY2I3ZDAyYzNjNGFkNmIzNmUxZWZkMGQyMmRjZTMiLCJwIjoiaiJ9

Grant worked on the Model file, Model is an extendable class made to be extended by all potential model classes used in the MVC.
Its also used as a settable attribute in the controller class to ensure that models can be switched out at will if so desired.

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/src/master/SRC/Model.java

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/33b7bcf3bb2af33b5cae6061e39989b3240d24e8

Task: Create an extendable viewer class

https://cs3398s22oberon.atlassian.net/browse/OTM-18?atlOrigin=eyJpIjoiNzcxNjdiNzM0MzhlNDNkMjhlOTY2NDRhMmVmZjk0MDciLCJwIjoiaiJ9

Grant worked on the view file, view is an extendable class made to be extended by all potential view classes in the MVC.
It is also used as a settable attribute in controller as to allow for views to be swaped out at will,
E.G adding a new GUI for the view.

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/src/master/SRC/View.java

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/33b7bcf3bb2af33b5cae6061e39989b3240d24e8

Task: Create a Taskmanager Creator

https://cs3398s22oberon.atlassian.net/browse/OTM-36?atlOrigin=eyJpIjoiMDVlYmFjZmY4NzA4NDIzMWJkMTY0ODIxMDMxYjFlNzgiLCJwIjoiaiJ9

Grant created a taskmanager creator class made with the intention of it being used to synchronize and combind the desired
mode, view, and controller classes as to create a proper GUI. this is done through a host of setters within these extendable
classes.

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/src/master/SRC/TaskManagerCreator.java

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/983eb4c0e9ee027429ba9f3d945313e5ad3acc3a

Task: Create a Taskmanager Controller class

https://cs3398s22oberon.atlassian.net/browse/OTM-21?atlOrigin=eyJpIjoiMDc1ODlkZDI2NGU2NDdhZjhjMDdkMDE2OTZlZTlkZDUiLCJwIjoiaiJ9

Grant Created a TaskController class which extends controller. The purpose of this class is to contain the ways in which
The model communicates with the viewer, and how the viewer communicates with the model. The commit posted with this
If the last meaningful commit made, but also the commit where it was created.

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/src/master/SRC/TaskController.java

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/a8567b4211f8f0c7ff6aa49f8e104e75adaf9141

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/af67c10e6698ec7c5dda3293908a7b6ee19b283c

Task: Add functionality to TaskController to support remove task button

https://cs3398s22oberon.atlassian.net/browse/OTM-40?atlOrigin=eyJpIjoiY2Y1ZDhlOWRlZTFkNGMyODk0YTFjOTUxMjA3NzZhMjEiLCJwIjoiaiJ9

Grant added the functionality for the TaskManager class to be able to call the model class and remove a task based on the TaskViewer's
current selected task.

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/src/master/SRC/TaskController.java

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/5eb31a0ac519f846f3aa8c44b5ea1a68b4b7acbb

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/af67c10e6698ec7c5dda3293908a7b6ee19b283c

Task: add a viewtask button to the GUI

https://cs3398s22oberon.atlassian.net/browse/OTM-39?atlOrigin=eyJpIjoiMzRhNmZhMzU3MWViNDNjZDk5NTc0NGNkYmY5NWEyNjAiLCJwIjoiaiJ9

Added a viewtask button to the file OberonGUI that will cycle to the next available task within the TaskModel's TaskService object
Functionality was also included in this task and I added that too.

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/src/master/SRC/OberonGUI.java

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/7eb0a330d68402532ddfdae9e8e2021a59abca0e

Task: BUG: Fix remove when TaskCounter is at 0

https://cs3398s22oberon.atlassian.net/browse/OTM-42?atlOrigin=eyJpIjoiNjRmOWY1YTBlZWE5NGI4ZTlhOGM5NjU3NGEwZmVlOGMiLCJwIjoiaiJ9

Fixed a bug where remove would remove the wrong data when Taskcounter was at 0 in class TaskController.

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/src/master/SRC/TaskController.java

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/af67c10e6698ec7c5dda3293908a7b6ee19b283c

Task: Discuss what methods the TaskController class will need to communicate with the TaskModel and Task Viewer classes

https://cs3398s22oberon.atlassian.net/browse/OTM-37?atlOrigin=eyJpIjoiOWY0NTE1NjE1YjgyNGRiNDhkNTJiMTY0ZjU4NDEyMTAiLCJwIjoiaiJ9

Discussed with group members individually as they worked to cordinate communication between the view and the model classes

(WARMING: THIS IS A RICH TEXT FILE, IT MUST BE OPENED IN MICROSOFT WORD)

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/src/master/Reports/Report%20on%20Controler%20class%20methods%20for%20GUI%20GCS37.rtf

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/9b83440955efc948d9db0b3682d81437c9ef9d90

Task: Create a UML diagram from the synchronization meeting

https://cs3398s22oberon.atlassian.net/browse/OTM-30?atlOrigin=eyJpIjoiZmY4NzY1OTczZTUzNGQ4NDgzZGIzNDc1ODFkZGIwMWMiLCJwIjoiaiJ9

I created this UML diagram in an attempt to make it simpiler for group members to understand MVC and other design aspects

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/src/master/Images/OTM%20UML.png

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/635dfebc4b7c56fc6d5649bab7ead0408cba04a0 (OLD MD FORMAT)

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/111b38c237bf43ef03fd6d758590700081be75b9 (NEW PNG COMMIT)


***Justin Jimenez***

Task: Create a basic task class.

https://cs3398s22oberon.atlassian.net/jira/software/projects/OTM/boards/2/backlog?assignee=61ef4266c3cb7c007215c870&selectedIssue=OTM-8

Justin worked on the task service file, this holds our basic task methods to add or remove a task.

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/src/master/SRC/TaskService.java

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/909a42f2c2f89397147f1e6c7d967c966a38de2b


Task: Create a method that adds tasks to a list.

https://cs3398s22oberon.atlassian.net/jira/software/projects/OTM/boards/2/backlog?assignee=61ef4266c3cb7c007215c870&selectedIssue=OTM-13

Justin created a method to be able to add tasks to our task list.

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/src/master/SRC/TaskService.java

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/909a42f2c2f89397147f1e6c7d967c966a38de2b



Task: Create a method that removes tasks from a list.

https://cs3398s22oberon.atlassian.net/jira/software/projects/OTM/boards/2/backlog?assignee=61ef4266c3cb7c007215c870&selectedIssue=OTM-15

Justin worked on creating a method that would remove a task from our task list.

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/src/master/SRC/TaskService.java

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/2b3de0ace5164b80cc620478befaf2ff1b9684a0



Task: Create getters and setters for a basic task class.

https://cs3398s22oberon.atlassian.net/jira/software/projects/OTM/boards/2/backlog?assignee=61ef4266c3cb7c007215c870&selectedIssue=OTM-12

Justin created getters and setters for our task in order to set and retrieve variables information.

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/src/master/SRC/BasicTask.java

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/909a42f2c2f89397147f1e6c7d967c966a38de2b

***Rafael Hernandez***
Task : Create basic GUI layout for a task managing app. 

https://cs3398s22oberon.atlassian.net/browse/OTM-26

Rafael worked on a simple working gui layout that would be added upon as the sprint continues and features are added. The gui was made as a starting place for the 
gui that would work with the task manager and would be built upon. 

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/a7fe0e15390b75d09d96e785bcfdd69ae6385667

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/ec5170414fbd150bcc3adba13495260f1454decf



Task : Add a button for adding, removing, and display the tasks being added to the GUI. 

https://cs3398s22oberon.atlassian.net/browse/OTM-27

Rafael worked on adding a "add task " remove task" button that was visible on the gui. 
These buttons would be the basic functionality of the task manager for this sprint.

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/bad89596534245674f7f0c73625198e11b2482f7



Task: Create classes that take user input from the GUI on command. 

https://cs3398s22oberon.atlassian.net/browse/OTM-23

Rafael worked on adding functionality to the "add task" button and made sure tasks would display when being added using the Controller. 
Worked on being able to take take user input and add a task
as well as being able to display the task that was added to a task area. 

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/7a616ba1419939ebe762aa14ca9547615e098016


***Jacob Jordan***
Task: Work on learning GUI and adding functionality to remove task button
https://cs3398s22oberon.atlassian.net/browse/OTM-41

Jacob Built the project after installing a new IDE and experimented with the GUI, after looking at the class file for the GUI, he added functionality to the “remove task” button.
https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/833526c829460c7ff0af565fb1855f0d40d107ed

Task: Create a date data structure.
https://cs3398s22oberon.atlassian.net/browse/OTM-28

Jacob created a date data structure.  At first, he was going to make a custom struct, but decided to just make it its own class with three int fields.  He also made an interface class for the date and a DateCreator class.
https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/8d5e1a677d13a283a86e5fb7079becf50d6c3b34

Task: Create a TaskModel class
https://cs3398s22oberon.atlassian.net/browse/OTM-38

Jacob created a TaskModel class for the task manager’s model.
https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/c54d9ec7f73d971d5ccf32da9acfda7d5341d51c

Task: Create a class for the viewer.
https://cs3398s22oberon.atlassian.net/browse/OTM-19

Jacob created a class for the task manager’s viewer.
https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/f904e77bc860061775226139357a7f41372d683e
https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/b69736ebebaba80199c1bdec04b019a50bd5f1f2

***Oscar Ramirez***

Task: Team Synchronization Meetup

https://cs3398s22oberon.atlassian.net/browse/OTM-33

We met up in a 3 hour long Zoom session to discuss how to design this project. At the end of the session, Grant was able to design a UML design for us to use based on what we talked about.

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/src/demoBranch/Images/UML%20DIAGRAM.md

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/0ed4f92c73adc1a5f22085dc0ddb422248478dcf

Task: Create a Task Interface.

https://cs3398s22oberon.atlassian.net/browse/OTM-9

Oscar created a Task Interface file to be used by the class that creates the tasks in the task manager. This allows for more abstraction between the files.

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/src/master/SRC/TaskInterface.java

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/31c035a94dc8ee6806351a51f539a7784b79b34b

Task: Create a class that creates tasks. (Not used in demo, as it became redundant).

https://cs3398s22oberon.atlassian.net/browse/OTM-14

Oscar created a class that is in charge of buildung the task with the task info once the user decides to add a task to the list.

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/src/master/SRC/TaskCreate.java

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/6560b375bf8ab5cbb9d7e2881e374e355e139703

Task: Create a Task Storage (Not used in Demo #1)

https://cs3398s22oberon.atlassian.net/browse/OTM-10

Oscar created a storge class for all the tasks in the task manger to be held, which would be called upon in the future to display tasks.

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/src/master/SRC/TaskStorage.java

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/6560b375bf8ab5cbb9d7e2881e374e355e139703

Task: Create a class that calls controller for user input (Not used in demo, as it became redundant during Sprint #1 but may be used in the future)

https://cs3398s22oberon.atlassian.net/browse/OTM-17

Oscar created a class that calls the controller class for input by the user, with the intention of this being expanded on. Howver, while development continued in Sprint #1, this file became redundant but might be reworked and expanded upon in the future.

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/src/master/SRC/userInput.java

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/6560b375bf8ab5cbb9d7e2881e374e355e139703

## Screenshots
![Example screenshot](./img/screenshot.png)
<!-- If you have screenshots you'd like to share, include them here. -->

***To be added***


## Setup
What are the project requirements/dependencies? Where are they listed? A requirements.txt or a Pipfile.lock file perhaps? Where is it located?

Proceed to describe how to install / setup one's local environment / get started with the project.
***To be added***

## Usage
How does one go about using it?
Provide various use cases and code examples here.

`write-your-code-here`
***To be added***

## Project Status
Project is: _in progress_ 


## Room for Improvement For Sprint 2
Include areas you believe need improvement / could be improved. Also add TODOs for future development.

Room for improvement:
- Improvement to be done for Sprint 2
- Improvement to be done for Sprint 2

To do:
***Grant Smith***

For Sprint 2 I will begin my work by first fixing all existing bugs, then beginning work on refactoring parts of the code
relating to solid principle violations.

**Justin Jimenez**
For Sprint 2 I would like to add more features to our current program, possibly edit an existing tasks or adding more details to the task. 

**Rafael Hernandez**
For sprint two I want to work on the overall design of the gui. Things like better button placement, added fucntionality to buttons, and making
sure everything work the way its supposed to. 
***To be added***

***Oscar Ramirez***
For Sprint 2, I will be helping Rafael with GUI setup and focus on making test cases to better debug our program.

## Acknowledgements
Give credit here.
- This project was inspired by...
- This project was based on [this tutorial](https://www.example.com).
- Many thanks to...
***To be added***

## Contact
Created by Oberon Team
Template for ReadME provided by: [@flynerdpl](https://www.flynerd.pl/) - feel free to contact me!
***To be added***

<!-- Optional -->
<!-- ## License -->
<!-- This project is open source and available under the [... License](). -->

<!-- You don't have to include all sections - just the one's relevant to your project -->