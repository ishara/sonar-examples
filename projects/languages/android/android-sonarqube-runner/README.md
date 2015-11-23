This example demonstrates how to analyze a simple Android App with SonarQube Scanner.

Prerequisites
=============
* [SonarQube](http://www.sonarsource.org/downloads/) 4.5 or higher
* [SonarQube Scanner](http://docs.sonarqube.org/display/SONAR/Installing+and+Configuring+SonarQube+Scanner) 2.4 or higher
* [SonarQube Android Lint Plugin](http://docs.sonarqube.org/display/SONAR/Android+Lint+Plugin) 1.1+
* [Ant](http://ant.apache.org/) 1.7.1 or higher

Optional
========
* [Android SDK](http://developer.android.com/sdk/index.html)

For you own project you will need to run Android Lint by yourself so you will need Android SDK.
Here, the Android Lint Report is already generated for the purpose of this example in the file lint-report.xml

Usage
=====
* Compile the project with Ant:

        ant debug

* Analyze the project with SonarQube using the SonarQube Runner:

        sonar-runner
