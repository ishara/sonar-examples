package org.sonar.samples.java.checks;

import org.junit.Test;
import org.sonar.java.checks.verifier.JavaCheckVerifier;

public class AvoidAnnotationCheckTest {

  @Test
  public void detected() {

    // Parse a known file and use an instance of the check under test to raise the issue.
    AvoidAnnotationCheck check = new AvoidAnnotationCheck();
    check.name = "Zuper";

    // Verifies that the check will raise the adequate issues with the expected message
    JavaCheckVerifier.verify("src/test/files/AvoidAnnotationCheck.java", check);
  }
}
