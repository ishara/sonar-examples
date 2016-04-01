This example demonstrates how to analyze a JavaScript project with Maven running unit tests with JsTestDriver.

Prerequisites
=============
* [SonarQube](http://www.sonarsource.org/downloads/) 4.5+
* [Sonar JavaScript Plugin](http://docs.sonarqube.org/display/PLUG/JavaScript+Plugin) 2.11+
* Maven 3.0+

Usage
=====
* In the pom.xml file, set the path.to.browser property to the path of your browser executable where JavaScript unit tests will be run on. Examples with Chrome:
  * Windows: C:\Users\myUser\AppData\Local\Google\Chrome\Application\chrome.exe
  * Mac: /Applications/Google Chrome.app/Contents/MacOS/Google Chrome
* Execute JsTestDriver unit tests and gather code coverage statistics:

        mvn test

* Analyze the JavaScript code with Sonar and import unit tests results:

        mvn sonar:sonar
