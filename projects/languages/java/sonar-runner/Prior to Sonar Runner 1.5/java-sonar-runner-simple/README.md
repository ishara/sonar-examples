This example demonstrates how to analyze a Java project with the Sonar Runner.

Prerequisites
=============
* [Sonar](http://www.sonarsource.org/downloads/) 3.1 or higher
* [Sonar Runner](http://docs.codehaus.org/display/SONAR/Installing+and+Configuring+Sonar+Runner) 1.4 or higher
* Make sure that the PMD rule 'JUnit assertions should include a message' is activated on your default profile to get violations on test files (or set a specific quality profile in the sonar-project.properties file).

Usage
=====
* Analyze it with Sonar using the Sonar Runner:

        sonar-runner
