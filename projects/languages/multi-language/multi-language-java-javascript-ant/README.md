This example demonstrates how to analyze a multi-language project (Java / JavaScript) with the SonarQube Ant Task.

Prerequisites
=============
* [SonarQube](http://www.sonarqube.org/downloads/) 4.5+
* [SonarQube Scanner for Ant](http://docs.sonarqube.org/display/SCAN/Analyzing+with+SonarQube+Scanner+for+Ant) 2.4.1+
* [SonarQube Java Plugin](http://docs.sonarqube.org/display/PLUG/Java+Plugin) 3.13.1+
* [SonarQube JavaScript Plugin](http://docs.sonarqube.org/display/PLUG/JavaScript+Plugin) 2.12+
* [Ant](http://ant.apache.org/) 1.7.1+

Usage
=====
* Set the path to the SonarQube Ant Task in the build.xml file
* Set the sonar.jdbc.* properties in the build.xml file
* Run the following command:

        ant all
