This example demonstrates how to analyze an XML project with the SonarQube Runner.
File validation against a custom schema.

Prerequisites
=============
* [SonarQube](http://www.sonarsource.org/downloads/) 3.0 or higher
* [SonarQube Runner](http://docs.codehaus.org/x/N4KxDQ) 2.0 or higher
* [SonarQube XML Plugin](http://docs.codehaus.org/display/SONAR/XML+Plugin) 1.0 or higher

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
