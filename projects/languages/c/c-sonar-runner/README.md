This example demonstrates how to analyze a C project with the SonarQube Scanner.

Prerequisites
=============
* GCC compiler to compile the project sample
* [SonarQube](http://www.sonarsource.org/downloads/) 4.5+
* [SonarQube Scanner](http://docs.sonarqube.org/display/SCAN/Analyzing+with+SonarQube+Scanner) 2.4+
* [SonarSource C/C++ Plugin](http://www.sonarsource.com/products/plugins/languages/cpp/) 3.8+
* [SonarSource Build Wrapper](http://www.sonarsource.com/products/plugins/languages/cpp/) 3.8+

Usage
=====
* Run the build wrapper:

        build-wrapper --out-dir bw-outputs ./build.sh


* Analyze the project with SonarQube using the SonarQube Scanner:

        sonar-scanner
