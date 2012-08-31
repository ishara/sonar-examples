This example demonstrates how to analyze a project with Ant reusing existing JUnit and JaCoCo reports.

Prerequisites
=============
* [Sonar](http://www.sonarsource.org/downloads/) 2.12 or higher
* [Sonar Ant Task](http://docs.codehaus.org/display/SONAR/Installing+and+Configuring+Ant+Task) 1.4 or higher
* [Ant](http://ant.apache.org/) 1.7.1 or higher

Usage
=====
* Set the path to the Ant Task in the build.xml file
* Set the sonar.jdbc.* properties in the build.xml file
* Run the following command:

        ant all

