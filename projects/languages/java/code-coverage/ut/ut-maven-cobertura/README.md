This example demonstrates how to import JUnit and Cobertura reports.

Prerequisites
=============
* [SonarQube](http://www.sonarsource.org/downloads/) 4.5+
* [SonarQube Java Plugin](http://docs.sonarqube.org/display/PLUG/Java+Plugin) 3.10+
* [SonarQube Cobertura Plugin](http://docs.sonarqube.org/display/PLUG/Cobertura+Plugin) 1.6.3+
* Maven 3.0+

Usage
=====
* Build the project and execute the unit tests:

        mvn clean compile
		mvn cobertura:cobertura

* Analyze the project with SonarQube using Maven:

        mvn sonar:sonar



