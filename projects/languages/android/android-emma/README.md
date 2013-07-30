This example demonstrates how to analyse project for Android.

Prerequisites
=============

* [SonarQube](http://www.sonarsource.org/downloads/) 3.0 or higher
* [SonarQube Emma Plugin](http://docs.codehaus.org/display/SONAR/Emma+Plugin) 1.3 or higher
* Maven 3.0.3 or higher
* [Android SDK](http://developer.android.com/sdk/index.html)

Execution
=========

1.  Build project and execute all tests:

        mvn clean install -Pemma -Dandroid.sdk.path=...

2.  Analyze with SonarQube:

        mvn sonar:sonar
