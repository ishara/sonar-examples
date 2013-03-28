This example demonstrates how to analyze a simple Java project with Gradle.

Prerequisites
=============
* [Sonar](http://www.sonarsource.org/downloads/) 2.11 or higher
* [Gradle](http://www.gradle.org/) 1.5 or higher

Usage
=====
* Analyze the project with Sonar using Gradle:

        gradle sonarRunner [-Dsonar.host.url=... -Dsonar.jdbc.url=... -Dsonar.jdbc.username=... -Dsonar.jdbc.password=...]
