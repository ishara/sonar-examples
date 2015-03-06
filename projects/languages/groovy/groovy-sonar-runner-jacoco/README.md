This example demonstrates how to import JaCoCo reports with a maven project

Prerequisites
=============
* Maven 2.2 or higher
* [SonarQube](http://www.sonarsource.org/downloads/) 4.5.2 or higher
* [SonarQube Groovy Plugin](http://docs.codehaus.org/display/SONAR/Groovy+Plugin) 1.1 or higher
* [SonarQube Runner](http://docs.codehaus.org/x/N4KxDQ) 2.3 or higher

Usage
=====
* Compile the project:

        mvn clean install

* Analyze the project with SonarQube using the SonarQube Runner:

        sonar-runner
