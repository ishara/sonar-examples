This example demonstrates how to analyze a Java project with Maven and Cobertura, running tests.

Prerequisites
=============
* [SonarQube](http://www.sonarsource.org/downloads/) 3.4 or higher
* Maven 2.2.1 or higher

Usage
=====
* Build the project and run the tests:

        mvn clean install

* Analyze the project with SonarQube using Maven:

        mvn sonar:sonar



