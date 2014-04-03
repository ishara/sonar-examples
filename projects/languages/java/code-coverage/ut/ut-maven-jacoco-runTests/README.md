This example demonstrates how to analyze a project with Maven running JUnit and JaCoCo.
There are two options:
* do not activate the JaCoCo JUnit listener => no information about mapping unit tests and covered code will be retrieved
* activate the JaCoCo JUnit listener => information about mapping unit tests and covered code will be retrieved (only available for SonarQube 3.5+)

Prerequisites
=============
* [SonarQube](http://www.sonarsource.org/downloads/) 3.4 or higher
* Maven 2.2.1 or higher

Usage for version 3.4+ (do not activate the JaCoCo JUnit listener)
==================================================================
* Build the project:

        mvn clean install

* Analyze the project with SonarQube using Maven:

        mvn sonar:sonar

Usage for version 3.5+ (activate the JaCoCo JUnit listener)
===========================================================
* Build the project:

        mvn clean install

* Analyze the project with SonarQube using Maven:

        mvn sonar:sonar -Pcoverage-per-test
