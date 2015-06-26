This example demonstrates how to analyze Gradle project with mixed Groovy (Spock) and Java (JUnit) test suite.

Prerequisites
=============
* [SonarQube](http://www.sonarsource.org/downloads/)
* [SonarQube Groovy Plugin](http://docs.codehaus.org/display/SONAR/Groovy+Plugin)

Usage
=====
* Compile the project:

        ./gradlew check

* Analyze it with SonarQube using Gradle:

        ./gradlew sonarqube
