
#Templates for Directory Structures of JVM based projects

This project provides a collection of directory templates to be used by
gdt (Groovy Directory Template, see [https://github.com/svene/directory_template](https://github.com/svene/directory_template) ).
Currently supported are:

* java
* swing
* javafx
* opendolphin
* gradle
* gradlewrapper15

## Installation
* if not done already install gdt: see see [gdt](https://github.com/svene/directory_template)
* invoke: gdt.sh install -github svene dt_java

## Update
If you already have installed dt_java but want to use a newer version of a template update dt_java:

* gdt.sh update dt_java

## Gradle Wrapper template

* create an empty directory and cd into it
* invoke: gdt.sh gradlewrapper15

which will create the following files and directories:

	.
	├── gradle
	│   └── wrapper
	│       ├── gradle-wrapper.jar
	│       └── gradle-wrapper.properties
	├── gradlew
	└── gradlew.bat

On *nix you have to set the executable flag on gradlew like this:

* chmod +x gradlew

Applying this template to a folder which already contains a gradle build file means you do not have to
install gradle. Instead you can simply use the wrapper. E.g. instead of

* gradle build

you can invoke

* ./gradlew build

## JavaFX template

* create an empty directory and cd into it
* invoke: gdt.sh javafx

Build and run the example as follows (requires an installation of the build tool 'gradle'):

* invoke: gradle run

which should show a nice JavaFX hello world window.

## Open Dolphin template

Directory Template to start a new [Open Dolphin](http://open-dolphin.org/) project.

* create an empty directory and cd into it
* invoke: gdt.sh opendolphin

You can run the application in two modes, the develop/test/debug mode and the remote mode.

To run it in develop mode invoke:

* gradle :combined:run

which should show a small window with a button on it. If you click it you should see some messages
on the terminal illustrating the commands which are sent from client to server and vice versa.


To run it in remove mode invoke:

* gradle jettyRun

and in a second terminal

* gradle :client:run

Not that the client and the server communication messages now appear in the client respectively server terminal.

To continue have a look at the Open Dolphin tutorial of [DolphinJumpStart](https://github.com/canoo/DolphinJumpStart)

