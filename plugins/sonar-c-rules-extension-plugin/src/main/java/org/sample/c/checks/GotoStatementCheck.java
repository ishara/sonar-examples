package org.sample.c.checks;

import org.sonar.check.Priority;
import org.sonar.check.Rule;

import com.sonar.c.plugin.CCheck;
import com.sonar.sslr.api.AstNode;

@Rule(key = "C.GotoStatementCheck", name = "Avoid using goto statement", priority = Priority.MAJOR,
    description = "<p>The goto statement shall not be used.</p>")
public class GotoStatementCheck extends CCheck {

  @Override
  public void init() {
    subscribeTo(getContext().getGrammar().gotoStatement);
  }

  public void visitNode(AstNode node) {
    getContext().createLineViolation(this, "Avoid using goto statement.", node);
  }
}
