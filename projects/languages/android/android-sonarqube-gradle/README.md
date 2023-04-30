This example demonstrates how to analyze a simple Android App with SonarQube Scanner for Gradle.

Prerequisites
=============
* [SonarQube](http://www.sonarqube.org/downloads/) 4.5+
* [SonarQube Scanner for Gradle Runner](http://docs.sonarqube.org/display/SCAN/Analyzing+with+SonarQube+Scanner+for+Gradle) 2.0.1+
* [SonarQube Android Lint Plugin](http://docs.sonarqube.org/display/SONAR/Android+Lint+Plugin) 1.1+
* [Android SDK 23](http://developer.android.com/sdk/index.html)
* [Android Build Tools 23.0.3](http://developer.android.com/tools/help/sdk-manager.html)
* Make sure that environment variable ANDROID_HOME is correctly defined

Usage
=====
* Build the project with Gradle:

        gradle build

* Analyze the project with SonarQube using the SonarQube Scanner for Gradle:

        gradle sonarqube


In order to benefit from Android Lint rules, do not forget to use a SonarQube quality profile that contains Android Lint rules for your analyses.
