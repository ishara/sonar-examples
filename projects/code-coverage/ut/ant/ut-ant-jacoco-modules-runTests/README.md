This example demonstrates how to analyze a multi-module Java project with Ant and Jacoco, running tests.

Prerequisites
=============
* [SonarQube](http://www.sonarsource.org/downloads/) 3.4 or higher
* [SonarQube Ant Task](http://docs.codehaus.org/x/QYKxDQ) 2.0 or higher
* [JaCoCo Ant Task](http://www.eclemma.org/jacoco/) 0.5.6 or higher
* [Ant](http://ant.apache.org/) 1.7.1 or higher

Usage
=====
* Set the path to the SonarQube Ant Task in the parent build.xml file
* Set the path to the JaCoCo Ant Task in the build.xml file
* Set the SonarQube properties in the parent build.xml file
* Run the following command:

        ant all
