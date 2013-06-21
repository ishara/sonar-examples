Usage
=====
* Build the plugin:

        mvn clean install
		
* Copy the plugin into SONARQUBE_HOME/extensions/plugin
* Restart your SonarQube server
* Go to Settings > Quality Profile
* The custom Checkstyle rule is now available: "Methods Count Check", key = org.sonar.examples.checkstyle.MethodsCountCheck
* Activate this rule
* Run a SonarQube analysis to check your code against this coding rule
