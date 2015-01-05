package org.sonar.samples.java;

import org.sonar.api.BatchExtension;
import org.sonar.api.batch.rule.CheckFactory;
import org.sonar.api.batch.rule.Checks;
import org.sonar.plugins.java.api.JavaFileScanner;
import org.sonar.plugins.java.api.JavaFileScannersFactory;

/**
 * Instantiates the "checks" (implementations of rules) that are executed during
 * source code analysis
 */
public class MyJavaFileScannersFactory implements JavaFileScannersFactory, BatchExtension {

  private final CheckFactory checkFactory;

  public MyJavaFileScannersFactory(CheckFactory checkFactory) {
    this.checkFactory = checkFactory;
  }

  @Override
  public Iterable<JavaFileScanner> createJavaFileScanners() {
    // we could simply return Arrays.asList(new ForbiddenAnnotationCheck(), new MethodCallCheck())
    // but it would not set the property values declared in Quality profiles (see
    // field ForbiddenAnnotationCheck#name)
    Checks<JavaFileScanner> checks = checkFactory.create(MyJavaRulesDefinition.REPOSITORY_KEY);
    checks.addAnnotatedChecks(checkClasses());
    return checks.all();
  }

  /**
   * Lists all the checks provided by the plugin
   */
  public static Class[] checkClasses() {
    return new Class[] {AvoidAnnotationCheck.class, AvoidMethodDeclarationCheck.class};
  }
}
