This example demonstrates how to analyze a Pacbase project with the Sonar Runner.

Prerequisites
=============
* [Sonar](http://www.sonarsource.org/downloads/) 3.0 or higher
* [Sonar Runner](http://docs.codehaus.org/display/SONAR/Installing+and+Configuring+Sonar+Runner) 1.4 or higher
* [Sonar Pacbase Plugin](http://www.sonarsource.com/products/plugins/languages/pacbase/) 1.2 or higher

Usage
=====
* Feed Sonar with the Pacbase rules:
  * copy the install/rules.xml file to the /extensions/rules/pacbase directory
  * restart your Sonar server

* Analyze the project with Sonar using the Sonar Runner:

        sonar-runner
