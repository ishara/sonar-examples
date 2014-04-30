This example demonstrates how to import JUnit and JaCoCo reports.

Prerequisites
=============
* [SonarQube](http://www.sonarsource.org/downloads/) 4.2 or higher
* [SonarQube Java Ecosystem](http://docs.codehaus.org/x/tZC7DQ) 2.2 or higher
* Maven 2.2.1 or higher


Usage
=====
* Prepare jacoco agent to allow coverage report generation, build the project, and execute the unit tests:

        mvn org.jacoco:jacoco-maven-plugin:prepare-agent clean install

* To get coverage per tests information, you will need to activate the profile when running the instrumented tests:

        mvn org.jacoco:jacoco-maven-plugin:prepare-agent clean install -Pcoverage-per-test

* Analyze the project with SonarQube using Maven:

        mvn sonar:sonar

