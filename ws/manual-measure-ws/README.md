This example demonstrates how to use the Sonar web service API (manual_measures).

Documentation
=============
* http://docs.codehaus.org/x/iABuC

Prerequisites
=============
* [Sonar](http://www.sonarsource.org/downloads/) 3.5 or higher

Usage
=====
* In src/main/java/sample/Sample.java, set the proper values to connect to your Sonar server and project. 
* Compile the project:

        mvn clean compile assembly:single

* Call the web service:

        cd target
		java -jar manual-measure-ws-1.0-SNAPSHOT-jar-with-dependencies.jar
		
* Check the output
