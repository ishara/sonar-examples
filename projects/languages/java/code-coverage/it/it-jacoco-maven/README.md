This example demonstrates how to add information on integration tests coverage for a Java project using JaCoCo and Maven.

Prerequisites
=============
* [SonarQube](http://www.sonarsource.org/downloads/) 4.5+
* Maven 3.0+

Usage
=====
* Build the project and run tests:

        mvn clean install

* Analyze the project with SonarQube using Maven:

        mvn sonar:sonar


