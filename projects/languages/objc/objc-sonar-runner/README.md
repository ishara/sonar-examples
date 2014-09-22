This example demonstrates how to analyze an Objective-C project with the SonarQube Runner.

Prerequisites
=============
* [SonarQube](http://www.sonarsource.org/downloads/) 3.6 or higher
* [SonarQube Runner](http://docs.codehaus.org/x/N4KxDQ) 2.0 or higher
* [SonarSource Objective-C Plugin](http://www.sonarsource.com/products/plugins/languages/objective-c/) 3.0 or higher
* [SonarSource build-wrapper](http://www.sonarsource.com/products/plugins/languages/c-cpp-objectivec/downloads/) 3.1 or higher

Usage
=====
* Analyze the project with SonarQube using the SonarQube Runner:

        /path/to/build-wrapper-macosx-x86 --out-dir out xcodebuild clean build
        sonar-runner

