This example demonstrates how to analyze an Objective-C project with the SonarQube Scanner.

Prerequisites
=============
* [SonarQube](http://www.sonarqube.org/downloads/) 4.5+
* [SonarQube Scanner](http://docs.sonarqube.org/display/SCAN/Analyzing+with+SonarQube+Scanner) 2.6.1+
* [SonarSource Objective-C Plugin](http://www.sonarsource.com/products/plugins/languages/objective-c/) 3.11+
* [SonarSource Build Wrapper](http://www.sonarsource.com/products/plugins/languages/objective-c/) 3.11+

Usage
=====
* Analyze the project with SonarQube using the SonarQube Scanner:

        /path/to/build-wrapper-macosx-x86 --out-dir out xcodebuild clean build
        sonar-scanner
