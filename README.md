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

https://cs3398s22oberon.atlassian.net/jira/software/projects/OTM/boards/2/backlog?assignee=61ef3089875fc1007027b7b6&selectedIssue=OTM-20

Grant worked on the Controller file, Controller is an extendable class made for all controllers used in the MVC. 
In this case its used in the first version of TaskController, and by the model class as a settable controller, 
so extended classes like taskcontroller can be set freely without much modification.

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/src/master/SRC/Controller.java

https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/33b7bcf3bb2af33b5cae6061e39989b3240d24e8

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

Rafael worked on a simple working gui layout that would be added upon as the sprint continues and features are added.
https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/a7fe0e15390b75d09d96e785bcfdd69ae6385667
https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/ec5170414fbd150bcc3adba13495260f1454decf

Task : Add a button for adding, removing, and display the tasks being added to the GUI.
https://cs3398s22oberon.atlassian.net/browse/OTM-27

Rafael worked on adding a "add task " remove task" button that was visible on the gui. 
https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/bad89596534245674f7f0c73625198e11b2482f7

Task: Create classes that take user input from the GUI on command.

https://cs3398s22oberon.atlassian.net/browse/OTM-23

Rafael worked on adding functionality to the "add task" button and made sure tasks would display when being added using the Controller. 
https://bitbucket.org/cs3398-s22-oberon/oberon-task-manager/commits/7a616ba1419939ebe762aa14ca9547615e098016

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
- Feature to be added 1
- Feature to be added 2


***To be added***

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