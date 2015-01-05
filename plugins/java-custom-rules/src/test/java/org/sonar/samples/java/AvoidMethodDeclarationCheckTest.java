/*
 * Copyright (C) 2009-2014 SonarSource SA
 * All rights reserved
 * mailto:contact AT sonarsource DOT com
 */

package org.sonar.samples.java;

import org.junit.Rule;
import org.junit.Test;
import org.sonar.java.JavaAstScanner;
import org.sonar.java.model.VisitorsBridge;
import org.sonar.squidbridge.api.SourceFile;
import org.sonar.squidbridge.checks.CheckMessagesVerifierRule;

import java.io.File;

/**
 * This class is the test of the ExampleCheck.
 * Checks by running it against a minimal valid file.
 */
public class AvoidMethodDeclarationCheckTest {

  @Rule
  public CheckMessagesVerifierRule checkMessagesVerifier = new CheckMessagesVerifierRule();

  @Test
  public void detected() {

    // Parse a known file and use an instance of the check under test to raise the issue.
    SourceFile file = JavaAstScanner
      .scanSingleFile(new File("src/test/files/AvoidMethodDeclarationCheck.java"), new VisitorsBridge(new AvoidMethodDeclarationCheck()));

    // Check the message raised by the check
    checkMessagesVerifier.verify(file.getCheckMessages())
      // Expecting an issue at line 9 with a predefined message. This allows test of dynamic messages.
      .next().atLine(9).withMessage("Avoid method calls (don't ask why)");
  }
}
