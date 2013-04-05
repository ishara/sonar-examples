package sample;

import org.sonar.wsclient.Host;
import org.sonar.wsclient.Sonar;
import org.sonar.wsclient.connectors.HttpClient4Connector;
import org.sonar.wsclient.services.*;

public class Sample {

  public static void main(String args[]) {
    String url = "http://localhost:9000";
    String login = "admin";
    String password = "admin";
    Sonar sonar = new Sonar(new HttpClient4Connector(new Host(url, login, password)));

    String projectKey = "java-sonar-runner-simple";
    String manualMetricKey = "burned_budget";

    sonar.create(ManualMeasureCreateQuery.create(projectKey, manualMetricKey).setValue(50.0));

    for (ManualMeasure manualMeasure : sonar.findAll(ManualMeasureQuery.create(projectKey))) {
      System.out.println("Manual measure on project: " + manualMeasure);
    }
  }

}
