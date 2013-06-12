This example demonstrates how to analyze a Java project with Ant reusing existing JUnit and JaCoCo reports.

Prerequisites
=============
* [SonarQube](http://www.sonarsource.org/downloads/) 3.4 or higher
* [SonarQube Ant Task](http://docs.codehaus.org/x/QYKxDQ) 2.0 or higher
* [Ant](http://ant.apache.org/) 1.7.1 or higher

Usage
=====
* Set the path to the SonarQube Ant Task in the build.xml file
* Set the sonar.jdbc.* properties in the build.xml file
* Run the following command:

        ant all

