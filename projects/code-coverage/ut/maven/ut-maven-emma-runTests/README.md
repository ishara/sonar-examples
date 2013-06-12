This example demonstrates how to analyze a Java project with Maven and Emma, running tests.

Prerequisites
=============
* [SonarQube](http://www.sonarsource.org/downloads/) 3.4 or higher
* Maven 2.2.1 or higher
* [SonarQube Emma Plugin](http://docs.codehaus.org/display/SONAR/Sonar+Emma+Plugin) 1.2.1 or higher

Usage
=====
* Compile the project:

        mvn clean install
  	
		
* Analyze the project with SonarQube using Maven:

        mvn sonar:sonar


