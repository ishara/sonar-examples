/*
 * Copyright (C) 2009-2014 SonarSource SA
 * All rights reserved
 * mailto:contact AT sonarsource DOT com
 */

package org.sonar.samples.java;

import java.io.File;

import org.junit.Rule;
import org.junit.Test;
import org.sonar.java.JavaAstScanner;
import org.sonar.java.model.VisitorsBridge;
import org.sonar.squidbridge.api.SourceFile;
import org.sonar.squidbridge.checks.CheckMessagesVerifier;
import org.sonar.squidbridge.checks.CheckMessagesVerifierRule;

public class AvoidBrandInMethodNamesCheckTest {

  @Rule
  public CheckMessagesVerifierRule checkMessagesVerifierRule = new CheckMessagesVerifierRule();

  @Test
  public void detected() {

    SourceFile file = JavaAstScanner
      .scanSingleFile(new File("src/test/files/AvoidBrandInMethodNamesCheck.java"), new VisitorsBridge(new AvoidBrandInMethodNamesCheck()));

    CheckMessagesVerifier checkMessagesVerifier = checkMessagesVerifierRule.verify(file.getCheckMessages());
    checkMessagesVerifier.next().atLine(9).withMessage("Avoid using Brand in method name");
    checkMessagesVerifier.next().atLine(13).withMessage("Avoid using Brand in method name");
  }
}
