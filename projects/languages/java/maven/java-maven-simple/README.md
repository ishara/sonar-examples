This example demonstrates how to analyze a simple Java Maven project.

Prerequisites
=============
* [SonarQube](http://www.sonarsource.org/downloads/) 4.5+
* Maven 2.2.1 or higher

Usage
=====
* Build the project:

        mvn clean install

* Analyze it with SonarQube using Maven:

        mvn sonar:sonar
