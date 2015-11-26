This example demonstrates how to analyze an XML project with the SonarQube Runner.
File validation against a custom schema.

Prerequisites
=============
* [SonarQube](http://www.sonarsource.org/downloads/) 4.5+
* [SonarQube Scanner](http://docs.sonarqube.org/display/SONAR/Analyzing+with+SonarQube+Scanner) 2.4+
* [SonarQube XML Plugin](http://docs.sonarqube.org/display/PLUG/XML+Plugin) 1.3+

Usage
=====
*   Copy the 'XML Schema Check' rule:
    * Name: Validation against custom schema
    * Default Severity: Blocker
    * filePattern: leave it empty
    * schemas: schemas/shiporder.xsd
    * Description: Validation against custom schema
* Activate the 'Validation against custom schema' rule
* Analyze the project with SonarQube using the SonarQube Runner:

        sonar-runner
