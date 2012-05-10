package org.sample.c.checks;

import java.io.File;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.sonar.squid.api.CheckMessage;

import com.sonar.c.CAstScanner;
import com.sonar.sslr.squid.checks.CheckMessagesVerifier;

public class GotoStatementCheckTest {

  @Test
  public void test() {
    File cSourceFile = FileUtils.toFile(GotoStatementCheckTest.class.getResource("/checks/goto_statement.c"));

    Set<CheckMessage> violations = CAstScanner.scanSingleFile(cSourceFile, new GotoStatementCheck()).getCheckMessages();

    CheckMessagesVerifier.verify(violations).next().atLine(13).withMessage("Avoid using goto statement.").noMore();
  }
}
