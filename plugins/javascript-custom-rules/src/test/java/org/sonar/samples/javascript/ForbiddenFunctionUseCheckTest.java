package org.sonar.samples.javascript;

import org.junit.Test;
import org.sonar.plugins.javascript.api.CheckTest;
import org.sonar.squidbridge.api.SourceFile;
import org.sonar.squidbridge.checks.CheckMessagesVerifier;

/**
 * Test class to test the check implementation.
 */
public class ForbiddenFunctionUseCheckTest extends CheckTest {

  @Test
  public void test() throws Exception {
    SourceFile file = scanFile("src/test/resources/checks/forbiddenFunctionUseCheck.js", new ForbiddenFunctionUseCheck());

    CheckMessagesVerifier.verify(file.getCheckMessages())
      .next().atLine(1).withMessage("Remove the usage of this forbidden function.")
      .next().atLine(2)
      .next().atLine(4)
      .next().atLine(5);
  }

}
