This example demonstrates how to analyze a simple Java project with Ant.

Prerequisites
=============
* [SonarQube](http://www.sonarsource.org/downloads/) 4.5+
* [SonarQube Scanner for Ant](http://docs.sonarqube.org/display/SONAR/Installing+and+Configuring+SonarQube+Scanner+for+Ant) 2.3+
* [Ant](http://ant.apache.org/) 1.7.1 or higher

Usage
=====
* Set the path to the SonarQube Ant Task in the build.xml file
* Set the sonar.jdbc.* properties in the build.xml file
* Run the following command:

        ant all
