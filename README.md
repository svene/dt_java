
#Templates for Directory Structures of JVM based projects

This project provides a collection of directory templates to be used by
gdt (Groovy Directory Template, see [https://github.com/svene/directory_template](https://github.com/svene/directory_template) ).
Currently supported are:

* java
* swing
* javafx
* opendolphin
* gradle

## Installation
* if not done already install gdt: see see [gdt](https://github.com/svene/directory_template)
* invoke: gdt.sh install -github svene dt_java

## Update
If you already have installed dt_java but want to use a newer version of a template update dt_java:

* gdt.sh update dt_java

## JavaFX template

* create an empty directory and cd into it
* invoke: gdt.sh javafx

Build and run the example as follows (requires an installation of the build tool 'gradle'):

* invoke: gradle run

which should show a nice JavaFX hello world window.

(soon gdt templates for the gradle wrapper will be available so that a gradle installation will not be necessary anymore)

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

(soon gdt templates for the gradle wrapper will be available so that a gradle installation will not be necessary anymore)
