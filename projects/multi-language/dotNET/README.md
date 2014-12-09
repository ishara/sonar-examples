This example demonstrates how to analyze solutions containing both C# and VB.NET projects with the SonarQube Runner.

Prerequisites
=============
* [SonarQube](http://www.sonarsource.org/downloads/) 3.7 or higher
* [SonarQube Runner](http://docs.codehaus.org/x/N4KxDQ) 2.3 or higher
* [SonarQube C# Plugin](http://docs.codehaus.org/x/BIREDg) 3.3 or higher
* [SonarQube VB.NET Plugin] (http://docs.codehaus.org/x/aoB4Dg) 2.2 or higher
* [Analysis Bootstrapper for Visual Studio Projects](http://docs.codehaus.org/x/TAA1Dg) 1.2 or higher

Usage
=====
* Launch MSBuild to build the project in the Debug configuration using the following command: 
  Note: You can skip this step if you disable all FxCop rules, which requires the assemblies to be built.

        MSBuild.exe

* Analyze the project using the SonarQube Runner:

        sonar-runner
