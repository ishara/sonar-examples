This example demonstrates how to analyze C# projects with the SonarQube Runner or Maven.

Prerequisites
=============
* [SonarQube](http://www.sonarsource.org/downloads/) 2.11 or higher
* [SonarQube Runner](http://docs.codehaus.org/x/N4KxDQ) 1.3 or higher or Maven 2.2.1 or higher
* [SonarQube C# Plugin](http://docs.codehaus.org/x/YID_Cw) 1.3 or higher

Usage
=====
* Download the project sample from [https://github.com/SonarCommunity/sonar-dotnet/tree/master/sonar/dotnet/sonar-dotnet-plugin/src/test/resources/solution/Example](https://github.com/SonarCommunity/sonar-dotnet/tree/master/sonar/dotnet/sonar-dotnet-plugin/src/test/resources/solution/Example)
* Compile it:

        mvn clean install

* Analyze it with SonarQube using the SonarQube Runner:

        sonar-runner

* Or analyze it with SonarQube using Maven:

        mvn sonar:sonar
