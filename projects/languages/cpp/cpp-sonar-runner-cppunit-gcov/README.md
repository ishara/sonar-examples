This example demonstrates how to analyze a C++ project with the SonarQube Scanner and how to import CPPUnit and GCOV reports.

Prerequisites
=============
* [SonarQube](http://www.sonarqube.org/downloads/) 4.5+
* [SonarQube Scanner](http://docs.sonarqube.org/display/SCAN/Analyzing+with+SonarQube+Scanner) 2.6.1+
* [SonarSource C/C++ Plugin](http://www.sonarsource.com/products/plugins/languages/cpp/) 3.11+

Usage
=====
* Analyze the project with SonarQube using the SonarQube Scanner:

        sonar-scanner

* You can find an example on how to generate the gcov file in create_gcov_report.sh
