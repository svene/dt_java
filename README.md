
#Templates for Directory Structures of JVM based projects

This project provides a collection of directory templates to be used by
gdt (Groovy Directory Template, see [https://github.com/svene/directory_template](https://github.com/svene/directory_template) ).
Currently supported are:

* java
* swing
* javafx
* gradle

# Installation
* if not done already install gdt: see see [gdt](https://github.com/svene/directory_template)
* invoke: gdt.sh install -github svene dt_java

## javafx template

* create an empty directory and cd into it
* invoke: gdt.sh javafx

Build and run the example as follows (requires an installation of the build tool 'gradle'):

* invoke: gradle run

which should show a nice JavaFX hello world window.

(soon gdt templates for the gradle wrapper will be available so that a gradle installation will not be necessary anymore)
