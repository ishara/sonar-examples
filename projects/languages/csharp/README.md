This example demonstrates how to analyze C# projects with the Sonar Runner or Maven.

Prerequisites
=============
* [Sonar 2.11](http://www.sonarsource.org/downloads/) or higher
* [Sonar Runner](http://docs.codehaus.org/display/SONAR/Installing+and+Configuring+Sonar+Runner) 1.3 or higher or Maven 2.2.1 or higher
* [Sonar C# Plugin](http://docs.codehaus.org/display/SONAR/C-Sharp+Plugins+Ecosystem) 1.3 or higher

Usage
=====
* Download the project sample from [http://svn.codehaus.org/sonar-plugins/trunk/dotnet/tools/dotnet-tools-commons/src/test/resources/solution/Example/](http://svn.codehaus.org/sonar-plugins/trunk/dotnet/tools/dotnet-tools-commons/src/test/resources/solution/Example/)
* Compile it:

        mvn clean install
		
		
* Analyze it with Sonar using the Sonar Runner:

        sonar-runner
		
* Or analyze it with Sonar using Maven:

        mvn sonar:sonar
