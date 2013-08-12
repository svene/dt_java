
## Templates for Directory Structures of JVM based projects

This project provides a collection of directory templates to be used by
gdt (Groovy Directory Template, see [https://github.com/svene/directory_template](https://github.com/svene/directory_template) ).
Currently supported are:

* java
* swing
* javafx
* gradle

### Recent changes
* 12.8.2013: removed template *gradlewrapper* since gradle 1.7 comes with native support to generate the wrapper: simply call *gradle wrapper*. Note that it is not necessary anymore to have a *wrapper* task in *build.gradle* as it was necessary with earlier versions of gradle.
* 1.8.2013: moved template *opendolphin* to [https://github.com/canoo/open-dolphin-gdt](https://github.com/canoo/open-dolphin-gdt)

### Prerequisites
* You need to have Java 1.7 or at least 1.6. Note that GDT does not work with Java 1.8 yet since groovy's @Grab annotations currently have
a problem with Java 1.8

* You need a groovy installation. I recommend [gvm] (http://gvmtool.net/) to easily install and manage your groovy
installation.


### Installation


If not done already install gdt:

	groovy https://raw.github.com/svene/gdt_bin/master/gdt_setup.groovy

(for details see [gdt](https://github.com/svene/directory_template) )

Then install *dt_java*:

	gdt.sh install -github svene dt_java

### Updating *dt_java*
If you already have installed *dt_java* but want to use a newer version of a template update *dt_java*:

	gdt.sh update dt_java

## The Templates

### Java template

Creates a folder with a *src* directory structure for a java project.

Usage:

	mkdir javademo
	cd javademo
	gdt.sh java

Most likely you want to use the *gradle* template next to setup a build file for it.

### Gradle template

Creates a *build.gradle* file for your Java project.
Makes most sense after having applied the *java* template before

Usage:

	mkdir javademo
	cd javademo
	gdt.sh gradle

Now you can build and run your project:

	gradle run

### Swing template

Creates a *src* folder with a simple Swing app as a starting point.

Usage:

	mkdir swingdemo
	cd swingdemo
	gdt.sh swing

Most likely you want to use the *gradle* template next to setup a build file for it.

### JavaFX template

Creates a *src* folder with a simple JavaFX app as a starting point. Note that this
templates comes with a *build.gradle* file already included.

Usage:

	mkdir javafxdemo
	cd javafxdemo
	gdt.sh javafx


Build and run the example as follows (requires an installation of the build tool 'gradle'):

	invoke: gradle run

which should show a nice JavaFX hello world window.

