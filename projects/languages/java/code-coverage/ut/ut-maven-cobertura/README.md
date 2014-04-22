This example demonstrates how to import JUnit and Cobertura reports.

Prerequisites
=============
* [SonarQube](http://www.sonarsource.org/downloads/) 4.2 or higher
* [SonarQube Java Ecosystem](http://docs.codehaus.org/x/tZC7DQ) 2.2 or higher
* [SonarQube Cobertura Plugin](http://docs.codehaus.org/x/fZS7DQ) 1.5 or higher
* Maven 2.2.1 or higher

Usage
=====
* Build the project and execute the unit tests:

        mvn clean compile
		mvn cobertura:cobertura

* Analyze the project with SonarQube using Maven:

        mvn sonar:sonar



