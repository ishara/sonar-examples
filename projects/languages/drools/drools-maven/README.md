This example demonstrates how to analyze a Drools project with Maven.

Prerequisites
=============
* [SonarQube](http://www.sonarsource.org/downloads/) 2.11 or higher
* Maven 2.2.1 or higher
* [SonarQube Drools Plugin](http://docs.codehaus.org/display/SONAR/Drools+Plugin) 0.2 or higher

Usage
=====
* Compile it:

        mvn clean install
		
		
* Analyze it with SonarQube using Maven:

        mvn sonar:sonar
