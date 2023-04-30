This example demonstrates how to import Python Coverage Execution Results into SonarQube with the SonarQube Scanner.

Prerequisites
=============
* [SonarQube](http://www.sonarqube.org/downloads/) 4.5+
* [SonarQube Scanner](http://docs.sonarqube.org/display/SCAN/Analyzing+with+SonarQube+Scanner) 2.6.1+
* [SonarQube Python Plugin](http://docs.sonarqube.org/display/PLUG/Python+Plugin) 1.5+
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
* Analyze the projec with SonarQube using the SonarQube Scanner:

        sonar-scanner
