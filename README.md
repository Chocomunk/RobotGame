# Robot Game Base
This repository is a foundation for the robot game project. Build off of this base and see what you can come up with!

## Task
Building off the code in this repository, create a grid-based game. This game will be a re-creation of the FRC game for the 2017 season. Your game should feature gears that can be picked up, pegs which the gear can be placed on, and a climber that the robot can climb. Following this design, a the user should be able to control a robot to move around the grid and perform actions. Don't worry too much about the graphics, colors squares will work fine.

## Goals
* Learn object oriented programming (OOP)

## Installation

To get this project onto your computer, you can either clone the repository using git or download it.
#### Cloning with git

Make sure git is installed then run the command below in your desired parent directory.
```
$ git clone https://github.com/Chocomunk/RobotGame
```

#### Download as a zip
In this repository's home page ([https://github.com/Chocomunk/RobotGame](https://github.com/Chocomunk/RobotGame)) click on the green "Clone or download" dropdown and select "Download ZIP" to download the repository in a zip file.

![](https://i.imgur.com/IQgh7ms.png)

## Importing into eclipse
First, make sure this repository is downloaded into your desired directory, I have mine in a "Java" folder in my user's "Documents" folder.

![](https://i.imgur.com/M2RgLsg.png)

In eclipse, I set the workspace to this folder on startup
![](https://i.imgur.com/R2sDell.png)

After eclipse sets up your workspace and you get past the welcome page, you should see the eclipse environment with no projects (if you have projects the following instructions will still apply)

![](https://i.imgur.com/eThF9RF.png)

To add the framework as a project into eclipse, we will have to create a new project around the existing source code. To do this, first right click in the "Project Explorer" section and select "New/Project...". You should then see this popup in some form.

![](https://i.imgur.com/0YpCQEY.png)

Select "Java Project". For the project name, put the exact name of the folder that holds the code you downloaded. For me it is "RobotGame-master" (scroll up to the image of my workspace). Your menu should look something like this.

![](https://i.imgur.com/wcxWRoW.png)

If the project name is the exact same as the name of your folder, eclipse will automatically recognize the code inside it and be able to create a project from it. Click finish and yes to any popups that appear. After eclipse finishes doing its work, your "Project Explorer" section should change into a "Package Explorer" section (if you clicked yes to everything) and the project should exist in there. Your "Package Explorer" section should look like this.

![](https://i.imgur.com/frjJXL4.png)

And you should be set! Remember to work in the src/RobotGame/Scene.java file as a start. Ideally you should be creating other packages and objects to create your game, but all drawing of objects and updating of game pieces should be done the Scene.Java files. Good luck!