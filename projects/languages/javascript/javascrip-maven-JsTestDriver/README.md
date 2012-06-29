This example demonstrates how to analyse JavaScript project with Maven and running unit tests with JsTestDriver.

Prerequisites
=============
* Sonar 2.11 or higher
* Sonar JavaScript Plugin 1.0 or higher

Usage
=====
* In the pom.xml file, replace <path_to_browser> by the path to your browser executable where JavaScript unit tests will be run on. Ex: C:\Users\myUser\AppData\Local\Google\Chrome\Application\chrome.exe
* Run "mvn test" to execute JsTestDriver unit tests and gather code coverage statistics
* Run "mvn sonar:sonar" to analyse JavaScript code with Sonar and import unit test results