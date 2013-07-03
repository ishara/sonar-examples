This example demonstrates how to analyze C# projects with the SonarQube Runner.

Prerequisites
=============
* [SonarQube](http://www.sonarsource.org/downloads/) 2.11 or higher
* [SonarQube Runner](http://docs.codehaus.org/x/N4KxDQ) 1.3 or higher or Maven 2.2.1 or higher
* [SonarQube C# Plugin](http://docs.codehaus.org/x/YID_Cw) 1.3 or higher

Usage
=====
* Compile the project:

        mvn clean install

* Analyze it with SonarQube using the SonarQube Runner:

        sonar-runner
