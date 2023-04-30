This example demonstrates how to analyze a simple Java project with Ant.

Prerequisites
=============
* [SonarQube](http://www.sonarqube.org/downloads/) 4.5+
* [SonarQube Scanner for Ant](http://docs.sonarqube.org/display/SCAN/Analyzing+with+SonarQube+Scanner+for+Ant) 2.4.1+
* [Ant](http://ant.apache.org/) 1.7.1 or higher

Usage
=====
* Set the path to the SonarQube Ant Task in the build.xml file
* Set the sonar.jdbc.* properties in the build.xml file
* Run the following command:

        ant all
