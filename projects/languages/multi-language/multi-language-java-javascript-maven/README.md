This example demonstrates how to analyze a multi-language project (Java / JavaScript) with Maven.

Prerequisites
=============
* [Sonar](http://www.sonarsource.org/downloads/) 3.3 or higher
* [Sonar Ant Task](http://docs.codehaus.org/display/SONAR/Installing+and+Configuring+Ant+Task) 2.0 or higher
* Maven 2.2.1 or higher

Usage
=====
* Build the project:

        mvn clean install

* Analyze the project with Sonar using Maven:

        mvn sonar:sonar
