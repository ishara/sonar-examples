This example demonstrates how to import Python Coverage Execution Results into SonarQube with the SonarQube Runner.

Prerequisites
=============
* [SonarQube](http://www.sonarsource.org/downloads/) 4.5 or higher
* [SonarQube Runner](http://docs.sonarqube.org/display/SONAR/Installing+and+Configuring+SonarQube+Runner) 2.4 or higher
* [SonarQube Python Plugin](http://docs.sonarqube.org/display/SONAR/Python+Plugin) 1.5 or higher
* [Coverage from Ned Batchelder](http://nedbatchelder.com/code/coverage/cmd.html)

Tests Execution Results Generation
==================================
* Run from your project root directory:
** coverage erase
** coverage run --branch --source=src ./src/purchase.py
** coverage xml -i
* Path to the generated file coverage.xml is referenced in sonar-project.properties

Usage
=====
* Analyze the projec with SonarQube using the SonarQube Runner:

        sonar-runner
