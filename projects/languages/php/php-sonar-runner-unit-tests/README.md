This example demonstrates how to analyze a PHP project with the SonarQube Scanner.
It reuses existing unit test execution and code coverage reports from PHPUnit.

Prerequisites
=============
* [SonarQube](http://www.sonarqube.org/downloads/) 4.5+
* [SonarQube Scanner](http://docs.sonarqube.org/display/SCAN/Analyzing+with+SonarQube+Scanner) 2.6.1+
* [SonarQube PHP Plugin](http://docs.sonarqube.org/display/PLUG/PHP+Plugin) 2.8+

Usage
=====
* In "reports/phpunit.coverage.xml", change the path "src/Math.php" to the full path of this file on your machine.
* Analyze the project with SonarQube using the SonarQube Scanner:

        sonar-scanner
