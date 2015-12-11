This example demonstrates how to analyze a Groovy project with Maven.

Prerequisites
=============
* [SonarQube](http://www.sonarsource.org/downloads/) 4.5+
* [SonarQube Groovy Plugin](http://docs.sonarqube.org/display/PLUG/Groovy+Plugin) 1.3.1+
* Maven 3.0+

Usage
=====
* Compile the project:

        mvn clean install

* Analyze it with SonarQube using Maven:

        mvn sonar:sonar
