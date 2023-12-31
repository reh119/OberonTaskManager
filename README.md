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

## 2nd Sprint Contributions
***Grant Smith:***

Task: Refactor the code to better represent and implement object oriented design, and allow for the new tasks

https://cs3398s22oberon.atlassian.net/browse/OTM-56?atlOrigin=eyJpIjoiM2I3YWZhMWMyYzkxNDViNTlhYjdiNmU0MWM1N2EwYTAiLCJwIjoiaiJ9

Grant (me) refactored the code by creating classes to create tasks, and adding the vector of tasks for visible tasks the GUI might need, stored in the controller,
also in the process removed the complex logic regarding current index, and replaced it with the simple visibletasks vector and selected task variable.

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/2039dc97e76b67dde272f5053ab9793118130b02

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/43f5c6ce9efcc56618a3b626d8da658337931bfe

Task: Fix the bug with adding and viewing more than 2 tasks

https://cs3398s22oberon.atlassian.net/browse/OTM-55?atlOrigin=eyJpIjoiZjNjMWQ1NzYyY2JjNDVjMWJhNTYyZDU4YTMzNGRiMGYiLCJwIjoiaiJ9

Grant (me) Fixed the bug with adding and viewing 2 or more tasks, this was accomplished by adding a method that used the new refactored code,
Through the use of the new classes added to model. This also was fixed by creating the vector storing tasks on creation of the tasks service
and creating an object of TaskService on creation of the TaskModel.

(these are the same as they were a major part of the refactoring)

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/2039dc97e76b67dde272f5053ab9793118130b02

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/43f5c6ce9efcc56618a3b626d8da658337931bfe

Task: Fix the bug with remove task not working properly.

https://cs3398s22oberon.atlassian.net/browse/OTM-53?atlOrigin=eyJpIjoiYTkxZTg0NmViODQ3NGEzMjhiMGZhMmU3MjJmYjhhNzgiLCJwIjoiaiJ9

Grant (me) Fixed the bug with removing tasks, this was accomplished by adding a method that used the new refactored code, specifically,
it took the selected tasks, and called the model to remove it.

(these are the same as they were a major part of the refactoring)

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/2039dc97e76b67dde272f5053ab9793118130b02

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/43f5c6ce9efcc56618a3b626d8da658337931bfe

Task: Create classes needed to parse data from model for the view/GUI.

https://cs3398s22oberon.atlassian.net/browse/OTM-58?atlOrigin=eyJpIjoiMTI5Y2Q1ZGEwMDRhNDhiYjgwMTE2NDdmN2M4MjZhOWUiLCJwIjoiaiJ9

Grant (me) Created the classes for parsing data, specifically they create a stringifier/formatter
on runtiome based on passed values, then returns a vector of strings that the GUI can use.

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/a87cdf8aa90936db117e7e51db64d8c7387e29f6

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/1865064ce68a7fa7e8dfd88ae057ce956263ca49

Task: Change the locations of some methods to ensure functionality

https://cs3398s22oberon.atlassian.net/browse/OTM-78?atlOrigin=eyJpIjoiYTE0MWRkZTQ0YjU0NDlmZDkyYjJmMTRjYTU0OWUyMDciLCJwIjoiaiJ9

Grant (me) Fixed an error with sorttasks being in the model instead of the controller, which meant that visibletasks would not be sorted,
but instead the backend would be sorted, not sorting the users tasks visually. In addition fixed a broken method in the cacluation of
day of the week. also replaced all instances of arraylist with vector to better standardize the code.

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/6e5703df024556b0179fd6ff3ec1338b5a818b15

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/cc1e0b76fb6b5c911d79a0d091441a04fdc06e73

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/a396f96a5c479edf5a7e62cc1b3477906665f554


***Justin Jimenez:***

Task: Create a method that searches through an array and sorts all tasks of a certain type, date, priority.
https://cs3398s22oberon.atlassian.net/browse/OTM-59

Justin added the sort method to alphabetically sort the title, sort the date and priotrity numerically ascending. 

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/03878aae9779dae159887f043e4ae3a9771c86a5


Task: Create a method that searches through array and finds all tasks of a certain type, date, priority.
https://cs3398s22oberon.atlassian.net/browse/OTM-57

Justin added the search method in order to search and return the task of a certain type, date and priotrity.

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/cf7e770076318eb155cc145b3bebf2d430c779cd


Task: Create a SocialTask Class that implements ITask.
https://cs3398s22oberon.atlassian.net/browse/OTM-52

Justin included the SocialTask class to have a different task types that would include additional variables 
onto the BasicTask Class

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/b421125834aea8c04e0d8326479584082bf0bb1e


Task: Create a WorkTask Class that implements ITask.
https://cs3398s22oberon.atlassian.net/browse/OTM-51

Justin included the WorkTask class to have a different task types that would include additional variables 
onto the BasicTask Class

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/e22154bbbe52a27da311ebc7e6150d80dfef87cd

Task: Create a SchoolTask Class that implements ITask.
https://cs3398s22oberon.atlassian.net/browse/OTM-50

Justin included the SchoolTask class to have a different task types that would include additional variables 
onto the BasicTask Class

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/824bce14d747dc12e8b7f143c85933c170a73e0e


***Rafael Hernandez***
Task: Create a sort option where user can sort tasks by priority, type and date.
https://cs3398s22oberon.atlassian.net/browse/OTM-71

Rafael (me) added a function/button for when tasks need to be sorted by a certain type ( priority, date, type) 

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/1b55d6d33e7c74ddd981ee94eb1ffbc5fa208ded

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/8170cdd874aa9caa3978125934955f5e8c24b4ad

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/1b55d6d33e7c74ddd981ee94eb1ffbc5fa208ded

Task: Create a search function menu/bar that allows users to search for tasks 
https://cs3398s22oberon.atlassian.net/browse/OTM-70

Rafael (me) added a search bar/function for when user wants to search for a certain task by a type or date. 

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/18fd7fd5cd28825b0c37f22f56d319bcbd214067

Task: Create a menu/dropdown for when user wants to set task types, and set priority. Make to where a new window pops up when 
a task type is selected with fields to enter
https://cs3398s22oberon.atlassian.net/browse/OTM-69

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/3607af738dc3be44136654652b46266622c62add

Task: Design a V2 GUI with a diagram/drawing. 
https://cs3398s22oberon.atlassian.net/browse/OTM-68 

Rafael took some time before actually created a GUI to design one on paper with functions that we plan on having for the task manager. 

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/5fe740d169625c446c5eeed9838e46e988fa16fc

Task: Improve upon former GUI (add tasks, display task, gui design and organizaton. 
https://cs3398s22oberon.atlassian.net/browse/OTM-67

Rafael made improvments on the team GUI by re designing the old gui we had into a completley different version that incorporated all the 
functions that we planned to have on it. 

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/9290645ab4f06bc5030991a021c97f23d570997a



***Jacob Jordan***

Task: Create a method to return the day of a week by using a Java library when passed a task.

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/d5baca662de143c7f108899bce28a506686835a3
https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/0cb6429f9e5a596a64aa3edfab32f23963db1ca2

Jacob made a method that returns a task's day of the week when passed a task object.

Task: Add implementation to the selectTask method in TaskController.

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/75a3870334545fbefc2fc33d04e926f9d4bacdb3
https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/82ca466633620356554cf329c4fe3e64afe2dda5

Jacob implemented a method for setting a selected task from visible tasks in the Task Controller.

Task: Add Support for returning formatted string vectors from the controller.

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/234d785eef0561184f2f45f2eb040d1e87070f6e

Jacob implemented a method for returnning formatted strings for visible tasks and selected tasks in the Task Controller.

Task: Add methods to the project to start switching GUI during runtime.

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/0866807290112f735a0c9f8e935d6a71e0b75bd7

Jacob created the start of severla methods that resest the tasks and overall allow for the GUI to be hanged out during runtime.


***Oscar Ramirez***

Task: Practice building a basic GUI on Netbeans using a tutorial

https://cs3398s22oberon.atlassian.net/browse/OTM-75

Oscar followed an online tutorial to get used to using the Netbeans IDE.

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/src/master/Reports/NumberAdditionUI%20copy.java

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/54495326ec8c29b550eb2c54d7850a3efaae9cdf

https://netbeans.apache.org/kb/docs/java/gui-functionality.html (Tutorial Followed)

Task: Design a standard (2nd) Graphical User Interface's framework.

https://cs3398s22oberon.atlassian.net/browse/OTM-73

Oscar began setting up the basic framework for our Task Manager's second GUI.

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/src/master/SRC/GUI2.java

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/322b13d0f16f21fd8404dd88cdb91e8e5b3f1661

Task: Add (to 2nd GUI) a Clear, Display, and Exit button to allow the user to clear the GUI fields, display tasks, and exit respectively.

https://cs3398s22oberon.atlassian.net/browse/OTM-74

Oscar added a clear, display, and exit button to the second GUI.

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/src/master/SRC/GUI2.java

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/322b13d0f16f21fd8404dd88cdb91e8e5b3f1661

Task: Add a button or tab that allows user to select what typ of task they will be adding.

https://cs3398s22oberon.atlassian.net/browse/OTM-76

Oscar added a way for users to select a task type on the second GUI.

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/src/master/SRC/GUI2.java

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/322b13d0f16f21fd8404dd88cdb91e8e5b3f1661

Task: Begin implementing extra panel to the GUI that will allow the users to fill in the extra text fields that are added when a task type (school, work, etc) is chosen.

https://cs3398s22oberon.atlassian.net/browse/OTM-77

Oscar added extra panels to the second GUI for text fields that correspond to the different task types.

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/src/master/SRC/GUI2.java

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/322b13d0f16f21fd8404dd88cdb91e8e5b3f1661


## 3rd Sprint Contributions
***Justin Jimenez:***

Task: Create J-Unit testing for the sort task
https://cs3398s22oberon.atlassian.net/jira/software/projects/OTM/boards/2?assignee=61ef4266c3cb7c007215c870&selectedIssue=OTM-91

Justin added two J-Unit tests for sort task to test for the title and priority.

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/branch/OTM-91-create-j-unit-testing-for-sort-task


Task: Sort tasks in descending order
https://cs3398s22oberon.atlassian.net/jira/software/projects/OTM/boards/2?assignee=61ef4266c3cb7c007215c870&selectedIssue=OTM-92

Justin edited the Sort Task class to use an additional boolean parameter for ascending and descending sort order.

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/branch/feature/OTM-92-sort-tasks-in-descending-order


Task: Edit selected task
https://cs3398s22oberon.atlassian.net/jira/software/projects/OTM/boards/2?assignee=61ef4266c3cb7c007215c870&selectedIssue=OTM-88

Justin created a method within TaskController to edit a selested task.

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/branch/feature/OTM-88-edit-selected-task


Task: Implement a search based on date range
https://cs3398s22oberon.atlassian.net/jira/software/projects/OTM/boards/2?assignee=61ef4266c3cb7c007215c870&selectedIssue=OTM-96

Justin refactored the search based on date code to include a feature of searching by a date range.

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/branch/feature/OTM-96-search-date-range


Task: Sort tasks by task type
https://cs3398s22oberon.atlassian.net/jira/software/projects/OTM/boards/2?assignee=61ef4266c3cb7c007215c870&selectedIssue=OTM-104

Justin added an additional statement in the Sort method to sort based on task type.

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/branch/feature/OTM-104-sort-by-task-type


Task: Refactor Search and Sort Task
https://cs3398s22oberon.atlassian.net/jira/software/projects/OTM/boards/2?assignee=61ef4266c3cb7c007215c870&selectedIssue=OTM-103

Justin refactored the search and sort methods to each have their own classes.

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/branch/OTM-103-refactor-the-search-and-sort

***Grant Smith***

NOTE: All Tasks were finished late besides JUNIT tests due to an impassable block caused by another groupmember

Jira Task 112 Hook up GUI1 and GUI2 to backend - https://cs3398s22oberon.atlassian.net/browse/OTM-112?atlOrigin=eyJpIjoiOGViMDVhOTA2MjVkNDlmNTlhYWRlNGUwNmQzMjEwMDciLCJwIjoiaiJ9
Hooked up GUI1 and GUI2 to the backend as in sprint 2, but without breaking the GUI code in the progress
Bitbucket Branch - https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/src/f5bd4dff3991efd36786e1cacbd110914b96df4d/?at=feature%2FOTM-112-hook-up-both-gui1-and-2s-buttons

Jira Task 113 Add functionality to editTask button in the GUI - https://cs3398s22oberon.atlassian.net/browse/OTM-113?atlOrigin=eyJpIjoiOTFmMjE4NmI1YmM2NDYyOGIxNTIyODgxYjcyYTUxNjciLCJwIjoiaiJ9
Added the functionality to EditTask for both GUI1 and GUI2 and conencted it to the backend Via TaskController
BitBucket Branch - https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/src/a43a88ceef46b440afe78904169a75e00384def0/?at=feature%2FOTM-113-add-functionality-to-the-edittas

Jira Task 114 Add functionality to the ViewTask button - https://cs3398s22oberon.atlassian.net/browse/OTM-114?atlOrigin=eyJpIjoiYTc4NjIyYzUzNzRjNDZlNmIyYmMyZDFlMWU5YjE4M2QiLCJwIjoiaiJ9
Added functionality to the ViewTask button, has minimal need for the backend but was used
Bitbucket Branch - https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/src/e5acdad21663ac18d6ca7c5b22b654045e6e3a56/?at=feature%2FOTM-114-add-functionality-to-the-viewtas

Jira Task 115 Add functionality to the SwitchGUI button - https://cs3398s22oberon.atlassian.net/browse/OTM-115?atlOrigin=eyJpIjoiN2JlMGY5NGE1NTQzNDRiOWJjOTkyZDhjN2Q4OTVlMTEiLCJwIjoiaiJ9
Added functionality to both GUIs switchGUI button via the backend, turned out to be realtively simple
Bitbucket Branch - https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/src/bcf0b22687f81ae3e088497792a2fcaa811f15a8/?at=feature%2FOTM-115-add-functionality-to-the-changeg

Jira Task 116 Add functionality to have a search range via the GUI - https://cs3398s22oberon.atlassian.net/browse/OTM-116?atlOrigin=eyJpIjoiMjE4MTNiMWNiN2UwNGY1ZGFlOGI5NTBiMmFiYTc5NGUiLCJwIjoiaiJ9
NOTE: THIS TASK WAS OBSOLETED BY ANOTHER GROUP MEMBERS WORK
I did not need to add this due to other group members work accidentally resolving this, with that said I made up for this with extra time in other tasks
Bitbucket Branch - https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/src/da5172005cae2c2cb710802a7eb460bb6ed6896f/?at=feature%2FOTM-116-add-additional-functionality-for

Jira Task 117 Add JUnitTests for the TaskController and the model's objects. - https://cs3398s22oberon.atlassian.net/browse/OTM-117?atlOrigin=eyJpIjoiNDAwYjAyNDViZTY5NGE3ZGI0NTgzZTQ4MWQ2ZGU1ZjIiLCJwIjoiaiJ9
Added JUNIT tests for the TaskController and model's objects, managed to get it working with the help of Dr. Lehr, but it broke on the demoBranch for unknown reasons relating to a commit by a group member.
Bitbucket Branch - https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/src/2b9db0e060e387216fb19b4209db36c2af38c9c0/?at=feature%2FOTM-117-add-junittests-for-the-taskcontr



***Rafael Hernandez***
Jira Task 93:Create sort by Descending option on task view 

Rafael created a descend toggle on the gui, giving the user an option to be able to sort in descendning order

https://cs3398s22oberon.atlassian.net/jira/software/projects/OTM/boards/2?assignee=61eb34957ae0dc006acc285b&selectedIssue=OTM-93
https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/branch/feature/OTM-93-create-sort-by-descending-option-reh119

Jira Task 85: Refine GUI, add color, and other customizations to GUI

Rafael refactored the previous gui from sprint to. and added things that were missing, as well as removing things that werent needed like mains.
https://cs3398s22oberon.atlassian.net/jira/software/projects/OTM/boards/2?assignee=61eb34957ae0dc006acc285b&selectedIssue=OTM-85
https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/branch/feature/OTM-85-refine-gui-add-color-and-other-cu


Jira Task 89:Edit button so the user can edit previously added tasks

Rafael Created a edit button so that users could change tasks that they had already added. Created a popup
window on the gui giving the user ability to do this. 
https://cs3398s22oberon.atlassian.net/jira/software/projects/OTM/boards/2?assignee=61eb34957ae0dc006acc285b&selectedIssue=OTM-89
https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/branch/feature/OTM-89-edit-button-so-the-user-can-edit-tasks


Jira Task 99:Refactor gui to be more organized, remove main
Made many changes here such as adding missing fields to the sort task, making frames not local, gui displaying taks dynamically
and labeling variables correclty
https://cs3398s22oberon.atlassian.net/jira/software/projects/OTM/boards/2?assignee=61eb34957ae0dc006acc285b&selectedIssue=OTM-99
https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/branch/feature/OTM-99-refactor-gui-to-be-more-organized



Jira Task 100: Create view task button so that user can view tasks and their fields
Rafael created an edit task button where users could view tasks they have previously added. These fields are uneditable and are only used to 
view tasks. 


https://cs3398s22oberon.atlassian.net/jira/software/projects/OTM/boards/2?assignee=61eb34957ae0dc006acc285b&selectedIssue=OTM-100
https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/branch/feature/OTM-100-create-view-task-button-so-that-

Jira Task 82:Remove the TaskID field from the display, and all associated TaskID uses in the GUI.
Rafael removed the taskId field as it wasnt needed for the user(the user didnt need to see it.) 

https://cs3398s22oberon.atlassian.net/jira/software/projects/OTM/boards/2?assignee=61eb34957ae0dc006acc285b&selectedIssue=OTM-82
https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/branch/feature/OTM-82-remove-the-taskid-field-from-the-



Jira Task 112: Change GUI Button
Rafael created a change gui button where the user could click, and changed the gui if they wished to. 

https://cs3398s22oberon.atlassian.net/jira/software/projects/OTM/boards/2?assignee=61eb34957ae0dc006acc285b&selectedIssue=OTM-110
https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/branch/feature/OTM-110-change-gui-button

***Jacob Jordan***
Jacob added an ExceptionParser calss with methods to catch with and deal with exceptions regarding user inputs
https://cs3398s22oberon.atlassian.net/jira/software/projects/OTM/boards/2?assignee=61eba30c84311c006952f9e2&selectedIssue=OTM-94
https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/src/OTM-94-Input-vlidation-searched-range/

Jacob added an InputValidate calss with methods to deal with a greater range of potential incorrect inputs from the user
https://cs3398s22oberon.atlassian.net/jira/software/projects/OTM/boards/2?assignee=61eba30c84311c006952f9e2&selectedIssue=OTM-98
https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/src/OTM-98-add-functionality-task-name-search/

Jacob added popups, bug chasing and the final features of the input validate class.  Tested the InputValidate class.
https://cs3398s22oberon.atlassian.net/jira/software/projects/OTM/boards/2?assignee=61eba30c84311c006952f9e2&selectedIssue=OTM-97
https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/src/InputValidationFinshingTouch/SRC/CoreCode/



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

***Sprint 3 todo:***

***Grant Smith***

For Sprint 3 I will begin my work by starting to fix the problems with missing elements in the GUI and add their functionality to the backend,
in addition I will attempt to add a customtask Task Type and functionality for parsing that.

**Justin Jimenez**

For Sprint 3 I would like to add J-Unit tests to my code. I would also like to provide assistance with the GUI side of the code in ensuring
that is uses the full functionallity of what has been created in the back-end.

**Rafael Hernandez**

For sprint 3, I will work on adding the last new feature to the GUI. which is a calender view. I will also focus on having the actual buttons work in the way theyre suppossed to,
 and add tests to make sure it doesnt crash. I will also work on input validation for the GUI. 

***Oscar Ramirez***
For Sprint 3, I will work on fully connecting the Second GUI to the backend code will also adding new elements to the design (sort button,
extra windows, etc.). I also want to customize the design to make it more visually pleasing and accesible.

***Jacob Jordan***
For Sprint 3, I will be working on the back end, implementing imput validation and JUnit tests for various classes.  I will also communicate with my teammates to create more tasks that overall allow the GUI to function as neededed.
Overall I will be adding missing elemts from our demo to the backend as we see fit.

***Sprint 4 TODO***

***Grant Smith***
For sprint 4 I would start by implementing the input validation, and ensuring it works correctly, then add an aditional quality to the search function allowing for
partial searches such as finding bob2 by searching bob.

***Rafael Hernandez***
For sprint 4, I would like to ensure that everything is 100% working. I would have also wanted to test the gui and make sure we spot any bugs that could be found or that break the program. 

***Jacob Jordan***
For sprint 4, I would add a backlof of finished tasks and add more input validation.  I would also add additional functionalities to the search function by allowing to search for terms by sub strings.

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