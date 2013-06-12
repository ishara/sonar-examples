This example demonstrates how to collect code coverage by integration tests, tests are located in a separate Java Maven module.
SonarQube aggregates code coverage by unit tests and integration tersts to compute an overall code coverage (this feature requires SonarQube 3.3).

Prerequisites
=============
* [SonarQube](http://www.sonarsource.org/downloads/) 3.4 or higher
* Maven 2.2.1 or higher

Usage
=====
* Build the project and execute all the tests:

        mvn clean install

* Analyze the project with SonarQube using Maven:

        mvn sonar:sonar
