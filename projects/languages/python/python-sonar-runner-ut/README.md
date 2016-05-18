This example demonstrates how to import Python Tests Execution Results into SonarQube with the SonarQube Scanner.

Prerequisites
=============
* [SonarQube](http://www.sonarqube.org/downloads/) 4.5+
* [SonarQube Scanner](http://docs.sonarqube.org/display/SCAN/Analyzing+with+SonarQube+Scanner) 2.6.1+
* [SonarQube Python Plugin](http://docs.sonarqube.org/display/PLUG/Python+Plugin) 1.5+

Tests Execution Results Generation
==================================
* Go in nosetests directory and run the command : nosetests --with-xunit ../src/samples/datepattern.py
* Tests Execution Results report is generated in nosetests under this name nosetests.xml
* Path to this file is referenced in sonar-project.properties

Usage
=====
* Analyze the projec with SonarQube using the SonarQube Scanner:

        sonar-scanner
