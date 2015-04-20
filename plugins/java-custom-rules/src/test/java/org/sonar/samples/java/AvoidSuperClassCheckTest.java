/*
 * Creation : 20 avr. 2015
 */
package org.sonar.samples.java;

import org.junit.Rule;
import org.junit.Test;
import org.sonar.java.JavaAstScanner;
import org.sonar.java.model.VisitorsBridge;
import org.sonar.squidbridge.api.SourceFile;
import org.sonar.squidbridge.checks.CheckMessagesVerifierRule;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class AvoidSuperClassCheckTest {

  /** JAR dependencies for classpath execution */
  private static final List<File> CLASSPATH_JAR;

  static {
    // Jar ClassPath construction. Don't use 'ClassLoader.getSystemClassLoader()', because with Maven+Surefire/Jacoco execution, only
    // surefirebooter.jar & jacoco.agent-version-runtime.jar are on classpath => 'old schoold way'
    CLASSPATH_JAR = new ArrayList<>();
    for (String jar : System.getProperty("java.class.path").split(File.pathSeparator)) {
      if (jar.endsWith(".jar")) {
        CLASSPATH_JAR.add(new File(jar));
      }
    }
  }

  @Rule
  public CheckMessagesVerifierRule checkMessagesVerifier = new CheckMessagesVerifierRule();

  @Test
  public void checkWithJarDependenciesInClassPath() throws Exception {
    AvoidSuperClassCheck customRule = new AvoidSuperClassCheck();

    // 'symbolType' used in custom rule => unit test scanner requires project jar dependencies
    SourceFile file = JavaAstScanner.scanSingleFile(new File("src/test/files/AvoidSuperClassCheck.java"), new VisitorsBridge(customRule, CLASSPATH_JAR));

    checkMessagesVerifier.verify(file.getCheckMessages()).next().atLine(11);
  }
}
