This example demonstrates how to analyze a C++ project with the SonarQube Scanner.

Prerequisites
=============
* G++ compiler to compile the project sample
* [SonarQube](http://www.sonarqube.org/downloads/) 4.5+
* [SonarQube Scanner](http://docs.sonarqube.org/display/SCAN/Analyzing+with+SonarQube+Scanner) 2.6.1+
* [SonarSource C/C++ Plugin](http://www.sonarsource.com/products/plugins/languages/cpp/) 3.11+
* [SonarSource Build Wrapper](http://www.sonarsource.com/products/plugins/languages/cpp/) 3.11+

Usage
=====
* Run the build wrapper:

        build-wrapper --out-dir bw-outputs ./build.sh

* Analyze the project with SonarQube using the SonarQube Scanner:

        sonar-scanner
