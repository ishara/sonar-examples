This example demonstrates how to collect code coverage by integration tests, tests are located in a separate Java Maven module.

Prerequisites
=============
* [Sonar](http://www.sonarsource.org/downloads/) 2.12 or higher
* Maven 2.2.1 or higher

Usage
=====
* Build the project and execute all the tests:

        mvn clean install

* Analyze the project with Sonar using Maven:

        mvn sonar:sonar
