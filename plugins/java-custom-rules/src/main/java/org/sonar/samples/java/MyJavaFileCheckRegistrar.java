package org.sonar.samples.java;

import org.sonar.plugins.java.api.CheckRegistrar;
import org.sonar.plugins.java.api.JavaCheck;
import org.sonar.samples.java.checks.AvoidAnnotationCheck;
import org.sonar.samples.java.checks.AvoidBrandInMethodNamesCheck;
import org.sonar.samples.java.checks.AvoidMethodDeclarationCheck;
import org.sonar.samples.java.checks.SecurityAnnotationMandatoryCheck;

import java.util.Arrays;

/**
 * Provide the "checks" (implementations of rules) classes that are gonna be executed during
 * source code analysis.
 *
 * This class is a batch extension by implementing the {@link org.sonar.plugins.java.api.CheckRegistrar} interface.
 */
public class MyJavaFileCheckRegistrar implements CheckRegistrar {

  /**
   * Register the classes that will be used to instantiate checks during analysis.
   */
  @Override
  public void register(RegistrarContext registrarContext) {
    // Call to registerClassesForRepository to associate the classes with the correct repository key
    registrarContext.registerClassesForRepository(MyJavaRulesDefinition.REPOSITORY_KEY, Arrays.asList(checkClasses()));
  }

  /**
   * Lists all the checks provided by the plugin
   */
  public static Class<? extends JavaCheck>[] checkClasses() {
    return new Class[] {SecurityAnnotationMandatoryCheck.class, MyCustomSubscriptionRule.class, AvoidAnnotationCheck.class, AvoidMethodDeclarationCheck.class,
      AvoidBrandInMethodNamesCheck.class};
  }
}
