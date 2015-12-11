This example demonstrates how to analyze an Objective-C project with the SonarQube Runner.

Prerequisites
=============
* [SonarQube](http://www.sonarsource.org/downloads/) 4.5+
* [SonarQube Scanner](http://docs.sonarqube.org/display/SONAR/Analyzing+with+SonarQube+Scanner) 2.4+
* [SonarSource Objective-C Plugin](http://www.sonarsource.com/products/plugins/languages/objective-c/) 3.8+
* [SonarSource build-wrapper](http://www.sonarsource.com/products/plugins/languages/c-cpp-objectivec/downloads/) 3.8+

Usage
=====
* Analyze the project with SonarQube using the SonarQube Runner:

        /path/to/build-wrapper-macosx-x86 --out-dir out xcodebuild clean build
        sonar-runner

