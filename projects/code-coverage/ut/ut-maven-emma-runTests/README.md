This example demonstrates how to analyze a project with Maven and Emma, running tests.

Prerequisites
=============
* [Sonar](http://www.sonarsource.org/downloads/) 2.6 or higher
* [Sonar Emma Plugin](http://docs.codehaus.org/display/SONAR/Sonar+Emma+Plugin) 1.2.1 or higher

Usage
=====
* Compile the project:

        mvn clean install
  	
		
* Analyze it with Sonar using Maven:

        mvn sonar:sonar


