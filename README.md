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

Usage
-----
	mkdir myproject
	cd myproject

With groovy 1.8.3:

	$ groovy https://raw.github.com/svene/dt_java/master/gdt.groovy simplejava

With earlier version of groovy:

	$ wget https://raw.github.com/svene/dt_java/master/gdt.groovy
	$ groovy gdt.groovy

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

