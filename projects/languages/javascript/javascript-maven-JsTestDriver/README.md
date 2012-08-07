This example demonstrates how to analyse JavaScript project with Maven and running unit tests with JsTestDriver.

Prerequisites
=============
* Sonar 2.11 or higher
* Sonar JavaScript Plugin 1.0 or higher

Usage
=====
* In the pom.xml file, replace <path_to_browser> by the path to your browser executable where JavaScript unit tests will be run on. Examples with Chrome:
  * Windows: C:\Users\myUser\AppData\Local\Google\Chrome\Application\chrome.exe
  * Mac: /Applications/Google Chrome.app/Contents/MacOS/Google Chrome
* Execute JsTestDriver unit tests and gather code coverage statistics

        mvn test

* Analyse JavaScript code by Sonar and import unit test results

        mvn sonar:sonar
