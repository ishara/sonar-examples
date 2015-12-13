package com.mycompany.sonarqube.rules;

import org.sonar.api.rule.RuleStatus;
import org.sonar.api.rule.Severity;
import org.sonar.api.server.rule.RulesDefinition;

public class MyCustomJavaRulesDefinition implements RulesDefinition {

  @Override
  public void define(Context context) {
    NewRepository repository = context.createRepository("java-example", "java").setName("My Custom Java Analyzer");

    // define a rule programmatically.
    NewRule x1Rule = repository.createRule("ExampleRule1")
      .setName("Stupid rule")
      .setHtmlDescription("Generate an issue on every line 1")

      // optional tags
      .setTags("style", "stupid")

      // optional status. Default value is READY.
      .setStatus(RuleStatus.BETA)

      // default severity when the rule is activated on a Quality profile. Default value is MAJOR.
      .setSeverity(Severity.MINOR);

    x1Rule
      .setDebtSubCharacteristic("INTEGRATION_TESTABILITY")
      .setDebtRemediationFunction(x1Rule.debtRemediationFunctions().linearWithOffset("1h", "30min"));

    // don't forget to call done() to finalize the definition
    repository.done();
  }
}
