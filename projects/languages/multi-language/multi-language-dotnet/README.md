This example demonstrates how to analyze a multi-language .NET solution.

Prerequisites
=============
* [Sonar](http://www.sonarsource.org/downloads/) 3.0 or higher
* [Sonar Runner](http://docs.codehaus.org/x/N4KxDQ) 2.0 or higher
* [Sonar .NET Plugin](http://docs.codehaus.org/x/YID_Cw) 2.0 or higher
* [Sonar VB.NET Plugin](http://www.sonarsource.com/products/plugins/languages/vbnet/) 1.0 or higher
* Other optional plugins can be downloaded to activate tools such as [FxCop, Gallio, etc.](http://docs.codehaus.org/x/YID_Cw)

Usage (not using optional tools)
==================================
* Analyze the project with Sonar using the Sonar Runner:

        sonar-runner

Usage (using optional tools)
==================================
* Compile the project as the optional tools requires the project to be compiled.

        mvn clean install
 
* Comment the 'sonar.<tool>.mode=skip' lines in the 'sonar-project.properties' file.
* Analyze the project with Sonar using the Sonar Runner:

        sonar-runner
