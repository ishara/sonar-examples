package org.sonar.samples.java;

import java.io.File;

import org.junit.Rule;
import org.junit.Test;
import org.sonar.java.JavaAstScanner;
import org.sonar.java.model.VisitorsBridge;
import org.sonar.squidbridge.api.SourceFile;
import org.sonar.squidbridge.checks.CheckMessagesVerifierRule;

public class ForbiddenAnnotationCheckTest {

  @Rule
  public CheckMessagesVerifierRule checkMessagesVerifier = new CheckMessagesVerifierRule();

  @Test
  public void detected() {

    // Parse a known file and use an instance of the check under test to raise the issue.
    SourceFile file = JavaAstScanner
      .scanSingleFile(new File("src/test/files/ForbiddenAnnotationCheck.java"), new VisitorsBridge(new ForbiddenAnnotationCheck()));

    // Check the message raised by the check
    checkMessagesVerifier.verify(file.getCheckMessages())
      .next().atLine(14).withMessage("Avoid using annotations starting with a Z");
  }
}
