Templates for JVM based Directory Structures
===============================================================================

* Author: Sven Ehrke

This project provides a collection of directory templates (see https://github.com/svene/directory_template).
Currently supported are:

* java
* java/swing
* gradle

Note that code is in a very early state and so far mearly served to have a use case
for developing https://github.com/svene/directory_template.
Feedback and contributions in form of improvements of the existing code and
new templates is highly appreciated.

Getting started
---------------
	mkdir myproject
	cd myproject

With groovy 1.8.3:

	$ groovy https://raw.github.com/svene/dt_java/master/gdt.groovy simplejava

With earlier version of groovy:

	$ wget https://raw.github.com/svene/dt_java/master/gdt.groovy
	$ groovy gdt.groovy simplejava

Answer 'org.myproject' when asked for the packagename:

	??> Packagename [org.svenehrke.simplejava]

This will create the following folder structure

	src/
	├── main
	│   └── java
	│       └── org
	│           └── myproject
	│               └── Main.java
	└── test
	    └── java

As you can see the packagename you entered is reflected in the folder structure.
And when you open Main.java you will find that the packagename is reflected inside
that file as well.

What was also generated is a hidden directory '.directory_template'. Inside it
a file name 'inputParameters.properties' 'has been created:

	.directory_template/
	├── inputParameters.properties
	└── simplejava

'inputParameters.properties' contains the values you entered at the commandline.
This makes it possible for future calls to pick up the values you defined so far
so that you do do not have to repeat them over and over again.
Let's try that out immediately:

We would like to build and run your new java project and being state of the art
we would like to do this with gradle. So type in:

	groovy https://raw.github.com/svene/dt_java/master/gdt.groovy gradle

respectively

	groovy gdt.groovy gradle

since we want to execute our java program with gradle as well we will be asked
for the packagename so that the applcaction plugin for gradle can be setup correctly.
And as you notice it suggests 'org.myproject' since we used that during our last
call and that value was stored in 'inputParameters.properties'. Stimply hi
RETURN to confirm the proposed value:

	??> Packagename [org.myproject]

Now we end up with 'build.gradle' file in the current directory.
Insinde it the main class is defined correctly:

	mainClassName = 'org.myproject.Main'

Let us build the newly created project:

	gradle build

And run it:

	gradle run


Simple Java Template
--------------------
	$ mkdir myproject
	$ cd myproject
	$ groovy https://raw.github.com/svene/dt_java/master/gdt.groovy simplejava

Gradle Template
---------------
	$ mkdir myproject
	$ cd myproject
	$ groovy https://raw.github.com/svene/dt_java/master/gdt.groovy gradle

Simple Java Swing Template
--------------------------

	$ mkdir myproject
	$ cd myproject
	$ groovy https://raw.github.com/svene/dt_java/master/gdt.groovy simpleswing

Run the swing application (provided you have also created the gradle build file):

	$ gradle run

To Do
-----
- gradle template: support wrapper
