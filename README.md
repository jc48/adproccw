------------------------------------------------------------------------
This is the project README file. Here, you will be able find out the
main information about this project as well as the main user
instructions.
------------------------------------------------------------------------

PROJECT TITLE: Java Coursework Assignment - Pipe Ordering System

PURPOSE OF PROJECT: Simulate a Pinball Machine

VERSION or DATE: 20.03.2017

HOW TO START THIS PROJECT: Double click on package BlueJ Project File

AUTHORS: Conor Farrell, Michael Kölling (mik), Bruce Quig

USER INSTRUCTIONS:

Right click on the demo class. Select "newDemo()", this will create an instance of
the demo class. Once this is done a window should appear which is the canvas that the pinballs will
be simulated in. Right click on the instance of the demo class that has appeared in the bottom left
blueJ project view of all the classes (red "Demo" box). When you right click you will see 5 methods;
void functionality1(), void functionality2(), void functionality3(), void functionality5(), and
void fullSimulation().

Functionality:

Pinball0: Will change colour when hitting and edge (wall) and will change the size of this pinball when it comes
into contact with another pinball.

Pinball2: Will flash from white to its original colour when hitting a wall. This functionality, will, when hitting
a wall for the first time it will trigger the flashing, when it hits it the second time it will stop the flashing,
this will continue until the simulation has ended. When this pinball comes into contact with another pinball it
changes direction.

Functionality 1: This functionality is showing the presence of bumpers and the 2 correct types of pinball. The
pinballs used here are Pinball0 and Pinball2. The correct behaviour of each type of pinball when hitting a wall,
the correct behaviour of each type of pinball when colliding with a bumper and the correct ending of the simulation
(The siimulation will stop and display the score board).

Functionality 2: Correct behaviour of each pinball when colliding with another pinball. Here Pinball0 will change
size when coming into contact with a pinball and Pinball2 will change direction when coming into contact with
a pinball.

Functionality 3: Presence of holes. Correct action when a smaller pinball interacts with a hole (the pinball will
lose all of its points and be removed from the machine). Correct behaviour when a larger pinball interacts with a
hole (the pinball will lose all of its points but will not be removed from the machine).

Functionality 4: Presence of the score on the pinballs (this will have a number in the middle of each moving
object), correct addition of points when colliding with a wall (adds one to the score of that exact pinball),
correct addition of points when colliding with a bumper (adds two to the score of that exact pinball),
correct addition of points when colliding with another pinball (adds five to the score of both of the
pinballs that interact), correct points action when interacting with a hole (sets the points of that pinball to
be zero, if the pinball is larger than the hole it can gather more points after the points have been set to
zero, if the pinball is smaller or the same size as the hole it will remove its points completely setting its
final value to zero). Correct display of points at the end of the simulation (the score board will appear on
the screen once the simulation has ended).

Full simulation: The full simulation shows the presence of everything, the contact of objects, pinballs holes and the correct ending of the
simulation as well as the score board once the simulation has finished.
