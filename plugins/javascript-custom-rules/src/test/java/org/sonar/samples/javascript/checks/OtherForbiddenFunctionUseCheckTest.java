package org.sonar.samples.javascript.checks;

import org.junit.Test;
import org.sonar.plugins.javascript.api.tests.TreeCheckTest;
import org.sonar.samples.javascript.checks.OtherForbiddenFunctionUseCheck;
import org.sonar.squidbridge.checks.CheckMessagesVerifier;

/**
 * Test class to test the check implementation.
 */
public class OtherForbiddenFunctionUseCheckTest extends TreeCheckTest {

  @Test
  public void test() throws Exception {
    CheckMessagesVerifier.verify(getIssues("src/test/resources/checks/otherForbiddenFunctionUseCheck.js", new OtherForbiddenFunctionUseCheck()))
      .next().atLine(1).withMessage("Remove the usage of this forbidden function.")
      .next().atLine(2)
      .noMore();
  }

}
