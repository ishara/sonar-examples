This example demonstrates how to collect code coverage by tests, which executed by [tycho-surefire-plugin](http://www.eclipse.org/tycho/).

Prerequisites
=============

* Sonar 2.12 or higher
* Maven 3.0.3 or higher

Execution
=========

1.  Build project and execute all tests:

        mvn clean install

2.  Analyse by Sonar :

        mvn sonar:sonar
