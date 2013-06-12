This example demonstrates how to analyze a Groovy project with Maven.

Prerequisites
=============
* [SonarQube](http://www.sonarsource.org/downloads/) 2.5 or higher
* Maven 2.2 or higher
* [SonarQube Groovy Plugin](http://docs.codehaus.org/display/SONAR/Groovy+Plugin) 0.6 or higher

Usage
=====
* Compile the project:

        mvn clean install

* Analyze it with SonarQube using Maven:

        mvn sonar:sonar
