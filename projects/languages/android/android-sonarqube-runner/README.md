This example demonstrates how to analyze a simple Android project with the SonarQube Runner.

Prerequisites
=============
* [SonarQube](http://www.sonarsource.org/downloads/) 3.5 or higher
* [SonarQube Runner](http://docs.codehaus.org/x/N4KxDQ) 2.3 or higher
* [Android](http://docs.codehaus.org/x/J6C7DQ) 0.1 or higher
* [Ant](http://ant.apache.org/) 1.7.1 or higher
* [Android SDK](http://developer.android.com/sdk/index.html)

Usage
=====
* Compile the project with Ant:

        ant debug

* Analyze the project with SonarQube using the SonarQube Runner:

        sonar-runner
