package org.sonar.samples.java;

import org.junit.Rule;
import org.junit.Test;
import org.sonar.java.JavaAstScanner;
import org.sonar.java.model.VisitorsBridge;
import org.sonar.squidbridge.api.SourceFile;
import org.sonar.squidbridge.checks.CheckMessagesVerifierRule;

import java.io.File;

public class ForbiddenAnnotationCheckTest {

  @Rule
  public CheckMessagesVerifierRule checkMessagesVerifier = new CheckMessagesVerifierRule();

  @Test
  public void detected() {

    // Parse a known file and use an instance of the check under test to raise the issue.
    ForbiddenAnnotationCheck check = new ForbiddenAnnotationCheck();
    check.name = "Zuper";

    SourceFile file = JavaAstScanner
      .scanSingleFile(new File("src/test/files/ForbiddenAnnotationCheck.java"), new VisitorsBridge(check));

    // Check the message raised by the check
    checkMessagesVerifier.verify(file.getCheckMessages())
      .next().atLine(14).withMessage("Avoid using annotation @Zuper");
  }
}
