This example demonstrates how to import JaCoCo reports with a maven project

Prerequisites
=============
* [SonarQube](http://www.sonarsource.org/downloads/) 4.5+
* [SonarQube Scanner](http://docs.sonarqube.org/display/SONAR/Analyzing+with+SonarQube+Scanner) 2.4+
* [SonarQube Groovy Plugin](http://docs.sonarqube.org/display/PLUG/Groovy+Plugin) 1.3.1+
* Maven 3.0+

Usage
=====
* Compile the project:

        mvn clean install

* Analyze the project with SonarQube using the SonarQube Runner:

        sonar-runner
