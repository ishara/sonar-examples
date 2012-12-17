This example demonstrates how to analyze a Java project with Maven and JaCoCo, running tests.

Prerequisites
=============
* [Sonar](http://www.sonarsource.org/downloads/) 2.12 or higher
* Maven 2.2.1 or higher

Usage
=====
* Build the project and run the tests:

        mvn clean install

* Analyze the project with Sonar using Maven:

        mvn sonar:sonar


