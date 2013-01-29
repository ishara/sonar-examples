This example demonstrates how to analyze an XML project with the Sonar Runner.
File validation is done with a custom XSD.

Prerequisites
=============
* [Sonar](http://www.sonarsource.org/downloads/) 3.0 or higher
* [Sonar Runner](http://docs.codehaus.org/display/SONAR/Installing+and+Configuring+Sonar+Runner) 2.0 or higher
* [Sonar XML Plugin](http://docs.codehaus.org/display/SONAR/XML+Plugin) 1.0 or higher

Usage
=====
* Copy the 'XML Schema Check' rule:
** Name: Validation against custom schema
** Default Severity: Blocker
** filePattern: leave it empty
** schemas: schemas/order.xsd
** Description: Validation against custom schema
* Activate the 'Validation against custom schema' rule

* Analyze the project with Sonar using the Sonar Runner:

        sonar-runner
