This example demonstrates how to analyze a C++ project with the SonarQube Runner and how to import CPPUnit and GCOV reports.

Prerequisites
=============
* [SonarQube](http://www.sonarsource.org/downloads/) 3.6 or higher
* [SonarQube Runner](http://docs.sonarqube.org/display/SONAR/Installing+and+Configuring+SonarQube+Runner) 2.0 or higher
* [SonarSource C/C++ Plugin](http://www.sonarsource.com/products/plugins/languages/cpp/) 1.6 or higher

Usage
=====
* Analyze the project with SonarQube using the SonarQube Runner:

        sonar-runner

* You can find an example on how to generate the gcov file in create_gcov_report.sh
