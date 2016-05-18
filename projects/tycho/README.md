This example demonstrates how to collect code coverage by tests, which executed by [tycho-surefire-plugin](http://www.eclipse.org/tycho/).

Prerequisites
=============
* [SonarQube](http://www.sonarqube.org/downloads/) 4.5+
* [SonarQube Java Plugin](http://docs.sonarqube.org/display/PLUG/Java+Plugin) 3.13.1+
* Maven 3.0.3+

Execution
=========

1.  Build project and execute all tests:

        mvn clean install

2.  Analyze with SonarQube:

        mvn sonar:sonar
