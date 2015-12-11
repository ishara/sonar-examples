This example demonstrates how to analyze a C++ project with the SonarQube Runner and how to import CPPUnit and GCOV reports.

Prerequisites
=============
* [SonarQube](http://www.sonarsource.org/downloads/) 4.5+
* [SonarQube Scanner](http://docs.sonarqube.org/display/SONAR/Analyzing+with+SonarQube+Scanner) 2.4+
* [SonarSource C/C++ Plugin](http://www.sonarsource.com/products/plugins/languages/cpp/) 3.8+

Usage
=====
* Analyze the project with SonarQube using the SonarQube Runner:

        sonar-runner

* You can find an example on how to generate the gcov file in create_gcov_report.sh
