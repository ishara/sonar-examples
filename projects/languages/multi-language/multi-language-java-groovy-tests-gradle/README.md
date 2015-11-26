This example demonstrates how to analyze Gradle project with mixed Groovy (Spock) and Java (JUnit) test suite.

Prerequisites
=============
* [SonarQube](http://www.sonarsource.org/downloads/) 4.5+
* [SonarQube Groovy Plugin](http://docs.sonarqube.org/display/PLUG/Groovy+Plugin) 1.3+

Usage
=====
* Compile the project:

        ./gradlew check

* Analyze it with SonarQube using Gradle:

        ./gradlew sonarqube
