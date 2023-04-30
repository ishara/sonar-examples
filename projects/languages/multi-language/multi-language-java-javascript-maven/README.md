This example demonstrates how to analyze a multi-language project (Java / JavaScript) with Maven.

Prerequisites
=============
* [SonarQube](http://www.sonarqube.org/downloads/) 4.5+
* [SonarQube Java Plugin](http://docs.sonarqube.org/display/PLUG/Java+Plugin) 3.13.1+
* [SonarQube JavaScript Plugin](http://docs.sonarqube.org/display/PLUG/JavaScript+Plugin) 2.12+
* Maven 3.0+

Usage
=====
* Build the project:

        mvn clean install

* Analyze the project with SonarQube using Maven:

        mvn sonar:sonar
