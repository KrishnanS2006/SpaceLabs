# SpaceLabs

## Introduction
SpaceLabs is a Java Swing Application designed to model the orbits of planets. With a huge amount of features, extreme customization, and accurate math, SpaceLabs can be used for a multitude of applications, such as classes and games.

## How to run
The simplest way to run SpaceLabs is by running the Main.java file. To access the application, you can use the ZIP file, or download/clone the repository from GitHub [here](https://github.com/krishnans2006/SpaceLabs)
You can then answer the questions that are presented to you and get started. More information and precise directions and recommendations can be found [here](https://docs.google.com/document/d/1qjTnt3Aw3jn5dt-yD9G_rNrQlMIP1gaxcdvkmKG-5cc/edit?usp=sharing)

## How it works
In the main JFrame, a JApplet is instantiated and added. This JApplet allows for updating the positions of multiple components, and displaying them to a screen in a whiteboard-style manner. This JApplet contains a side panel, which houses all the buttons, sliders, and labels required to interact with the simulation. The JApplet also contains the visual representation of the planet system. 

The JApplet uses many other classes to function properly. 
These classes are PSystem, Planet, PlanetsDetail, and SidePanel. All these classes are described in-depth below.

### PSystem or Planet System
The Planet System class acts as a connector between the applet and the Planet Class. This class has many public methods which allow the applet to access and customize the private and public variables of the Planet Class all at once. 

### Planet

Stores all the important data related to creating the graphics for the simulation. Stores different data for different planets using switch and case. Also contains methods for calculation of location.

### Planets Detail
The default planets in our simulation are the planets of the Solar System. Facts about these planets have been gathered to provide useful mathematical information and fun facts to users. Facts include Orbital Period, Orbital Eccentricity, Day Lenght, Rotation Period, diameter, mass, etc. Fun or interesting facts are also gathered to keep the users engaged in our simulation. Users can also learn new things from this simulation. All data has been gathered from the NASA website.

### SidePanel

The SidePanel instantiates different buttons and uses boolean class variables to direct the JApplet to carry out different actions related to specific buttons. These actions or methods are all connected to the above classes.  

## Sources
 - https://nssdc.gsfc.nasa.gov/planetary/factsheet/
 - https://dotnettutorials.net/lesson/applet-in-java/
 - https://docs.oracle.com/javase/7/docs/api/
