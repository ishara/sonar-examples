package org.sonar.template.java;

import com.google.common.collect.Iterables;

import org.sonar.api.server.rule.RulesDefinition;
import org.sonar.api.server.rule.RulesDefinitionAnnotationLoader;
import org.sonar.plugins.java.Java;

import java.util.List;

/**
 * Declare rule metadata in server repository of rules. 
 * That allows to list the rules in the page "Rules".
 */
public class JavaCustomRulesDefinition implements RulesDefinition {

  public static final String REPOSITORY_KEY = "java-custom-rules-template";

  @Override
  public void define(Context context) {
    NewRepository repository = context.createRepository(REPOSITORY_KEY, Java.KEY);
    repository.setName("Java Custom Rules - Template");

    List<Class> checks = JavaCustomRulesList.getChecks();
    new RulesDefinitionAnnotationLoader().load(repository, Iterables.toArray(checks, Class.class));
    repository.done();
  }

}
