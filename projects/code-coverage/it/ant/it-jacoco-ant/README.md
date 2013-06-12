This example demonstrates how to add information on integration tests coverage for a Java project using JaCoCo and Ant.

Prerequisites
=============
* [SonarQube](http://www.sonarsource.org/downloads/) 3.0 or higher
* [SonarQube Ant Task](http://docs.codehaus.org/x/QYKxDQ) 2.0 or higher
* [Ant](http://ant.apache.org/) 1.7.1 or higher

Usage
=====
* Set the path to the SonarQube Ant Task in the build.xml file
* Set the sonar.jdbc.* properties in the build.xml file
* Run the following command:

        ant all

