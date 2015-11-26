This example demonstrates how to analyze PL/SQL from Oracle Forms.

Prerequisites
=============
* [SonarQube](http://www.sonarsource.org/downloads/) 4.5+
* [SonarQube Scanner](http://docs.sonarqube.org/display/SONAR/Analyzing+with+SonarQube+Scanner) 2.4+
* [SonarSource PL/SQL Plugin](http://www.sonarsource.com/products/plugins/languages/plsql/) 2.7+
* [SonarQube Oracle Forms PL/SQL Extractor](https://github.com/SonarCommunity/sonar-forms-plsql-extractor) 1.1+

Usage
=====
* Extract the PL/SQL source code from your Oracle Forms. Let's say that you downloaded the project sample to C:\plsql-oracle-forms.

        set FORMS_PATH=C:\plsql-oracle-forms\forms
		java -DinputDir=C:\plsql-oracle-forms\forms -DoutputDir=C:\plsql-oracle-forms\src  -cp C:\path\to\sonar-forms-plsql-extractor-X.X-jar-with-dependencies.jar;C:\path\to\oracle\forms\java\frmjdapi.jar org.sonar.oracleforms.plsql.PlSqlExtractor

* Analyze the project with SonarQube using the SonarQube Runner:

        sonar-runner
