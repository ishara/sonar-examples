This example demonstrates how to analyze a Pacbase project with the Sonar Runner.

Prerequisites
=============
* [SonarQube](http://www.sonarsource.org/downloads/) 3.0 or higher
* [SonarQube Runner](http://docs.codehaus.org/x/N4KxDQ) 2.0 or higher
* [SonarSource Pacbase Plugin](http://www.sonarsource.com/products/plugins/languages/pacbase/) 1.2 or higher

Usage
=====
* Feed SonarQube with the Pacbase rules:
  * copy the install/rules.xml file to the /extensions/rules/pacbase directory
  * restart your SonarQube server
* Analyze the project with SonarQube using the SonarQube Runner:

        sonar-runner
