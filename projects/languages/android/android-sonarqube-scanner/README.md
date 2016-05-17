This example demonstrates how to analyze a simple Android App with SonarQube Scanner.

Prerequisites
=============
* [SonarQube](http://www.sonarqube.org/downloads/) 4.5+
* [SonarQube Scanner](http://docs.sonarqube.org/display/SCAN/Analyzing+with+SonarQube+Scanner) 2.6.1+
* [SonarQube Android Lint Plugin](http://docs.sonarqube.org/display/SONAR/Android+Lint+Plugin) 1.1+
* [Ant](http://ant.apache.org/) 1.7.1 or higher
* [Android SDK](http://developer.android.com/sdk/index.html)

Make sure that the environment variable ANDROID_HOME is defined and point to your Android SDK root folder installation.

Usage
=====
* Compile the project with Ant:

        ant debug

* Analyze the project with SonarQube using the SonarQube Runner:

        sonar-scanner


In order to benefit from Android Lint rules, do not forget to use a SonarQube quality profile that contains Android Lint rules for your analyses.
