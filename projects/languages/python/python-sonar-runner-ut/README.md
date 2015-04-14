This example demonstrates how to import Python Tests Execution Results into SonarQube with the SonarQube Runner.

Prerequisites
=============
* [SonarQube](http://www.sonarsource.org/downloads/) 4.5 or higher
* [SonarQube Runner](http://docs.codehaus.org/x/N4KxDQ) 2.4 or higher
* [SonarQube Python Plugin](http://docs.codehaus.org/display/SONAR/Python+Plugin) 1.5 or higher

Tests Execution Results Generation
==================================
* Go in nosetests directory and run the command : nosetests --with-xunit ../src/samples/datepattern.py
* Tests Execution Results report is generated in nosetests under this name nosetests.xml
* Path to this file is referenced in sonar-project.properties

Usage
=====
* Analyze the projec with SonarQube using the SonarQube Runner:

        sonar-runner
