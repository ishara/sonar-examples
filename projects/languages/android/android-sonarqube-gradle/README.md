This example demonstrates how to analyze a simple Android App with SonarQube Scanner for Gradle.

Prerequisites
=============
* [SonarQube](http://www.sonarsource.org/downloads/) 4.5 or higher
* [SonarQube Scanner for GRadle Runner](http://docs.sonarqube.org/display/SONAR/Analyzing+with+SonarQube+Scanner+for+Gradle) 1.1 or higher
* [SonarQube Android Lint Plugin](http://docs.sonarqube.org/display/SONAR/Android+Lint+Plugin) 1.1+
* [Android SDK](http://developer.android.com/sdk/index.html)

Usage
=====
* Build the project with Gradle:

        gradle build

* Analyze the project with SonarQube using the SonarQube Scanner for Gradle:

        gradle sonarqube
