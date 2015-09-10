package org.sonar.samples.java.checks;

import java.io.File;

import org.junit.Rule;
import org.junit.Test;
import org.sonar.java.JavaAstScanner;
import org.sonar.java.model.VisitorsBridge;
import org.sonar.samples.java.checks.SecurityAnnotationMandatoryCheck;
import org.sonar.squidbridge.api.SourceFile;
import org.sonar.squidbridge.checks.CheckMessagesVerifierRule;

public class SecurityAnnotationMandatoryCheckTest {

  @Rule
  public CheckMessagesVerifierRule checkMessagesVerifier = new CheckMessagesVerifierRule();

  @Test
  public void detected() {

    // Parse a known file and use an instance of the check under test to raise the issue.
    SecurityAnnotationMandatoryCheck check = new SecurityAnnotationMandatoryCheck();
    check.name = "MySecurityAnnotation";

    SourceFile file = JavaAstScanner
      .scanSingleFile(new File("src/test/files/SecurityAnnotationMandatoryCheck.java"), new VisitorsBridge(check));

    // Check the message raised by the check
    checkMessagesVerifier.verify(file.getCheckMessages())
      .next().atLine(16).withMessage("Mandatory Annotation not set @MySecurityAnnotation");
  }
}
