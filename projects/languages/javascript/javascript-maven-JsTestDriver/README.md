This example demonstrates how to analyze a JavaScript project with Maven running unit tests with JsTestDriver.

Prerequisites
=============
* [Sonar](http://www.sonarsource.org/downloads/) 2.11 or higher
* [Sonar Runner](http://docs.codehaus.org/display/SONAR/Installing+and+Configuring+Sonar+Runner) 1.4 or higher
* [Sonar JavaScript Plugin](http://docs.codehaus.org/display/SONAR/JavaScript+Plugin) 1.0 or higher

Usage
=====
* In the pom.xml file, replace <path_to_browser> by the path to your browser executable where JavaScript unit tests will be run on. Examples with Chrome:
  * Windows: C:\Users\myUser\AppData\Local\Google\Chrome\Application\chrome.exe
  * Mac: /Applications/Google Chrome.app/Contents/MacOS/Google Chrome
* Execute JsTestDriver unit tests and gather code coverage statistics:

        mvn test

* Analyze the JavaScript code with Sonar and import unit tests results:

        mvn sonar:sonar
