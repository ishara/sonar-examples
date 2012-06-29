This example demonstrates how to analyse JavaScript project with Maven and running unit tests with JsTestDriver.

Prerequisites
=============
* Sonar 2.11 or higher
* Sonar JavaScript Plugin 1.0 or higher

Usage
=====
* In the pom.xml file, replace <path_to_browser> by the path to your browser executable. Ex: C:\Users\myUser\AppData\Local\Google\Chrome\Application\chrome.exe
* Run mvn clean install
* Run mvn sonar:sonar
