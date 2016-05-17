This example demonstrates how to analyze a .Net project with the SonarQube Scanner for MSBuild.

Prerequisites
=============
* [SonarQube](http://www.sonarqube.org/downloads/) 4.5+
* [SonarQube Scanner for MSBuild](http://docs.sonarqube.org/display/SCAN/Analyzing+with+SonarQube+Scanner+for+MSBuild) 2.0+
* [SonarSource C# Plugin](http://docs.sonarqube.org/display/PLUG/C%23+Plugin) 5.0+
* [Compatible .NET Build Environment](http://docs.sonarqube.org/display/SCAN/From+the+Command+Line)

Usage
=====
* Run SonarQube Scanner for MSBuild begin phase:

        MSBuild.SonarQube.Runner.exe begin /k:"org.sonarqube:csharp-simple-sq-scanner-msbuild" /n:"C# :: Simple Project :: SonarQube Scanner for MSBuild" /v:"1.0"

* Build the project with MSBuild:

        MSBuild.exe /t:Rebuild

* Run SonarQube Scanner for MSBuild end phase:

        MSBuild.SonarQube.Runner.exe end
