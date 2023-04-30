package org.sonar.template.java;

import org.sonar.api.SonarPlugin;

import java.util.Arrays;
import java.util.List;

/**
 * Entry point of plugin
 */
public class JavaCustomRulesPlugin extends SonarPlugin {

  @Override
  public List getExtensions() {
    return Arrays.asList(
      // server extensions -> objects are instantiated during server startup
      JavaCustomRulesDefinition.class,

      // batch extensions -> objects are instantiated during code analysis
      JavaCustomRulesCheckRegistrar.class);
  }
}
