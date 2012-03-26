/*
 * Copyright (C) 2010 SonarSource SA
 * All rights reserved
 * mailto:contact AT sonarsource DOT com
 */

package org.sample.c.checks;

import org.sonar.check.Priority;
import org.sonar.check.Rule;

import com.sonar.c.plugin.CCheck;
import com.sonar.sslr.api.AstAndTokenVisitor;
import com.sonar.sslr.api.AstNode;
import com.sonar.sslr.api.Token;

@Rule(key = "C.TokenOnFirstLine", name = "Avoid defining a token on the first line", priority = Priority.MAJOR,
    description = "<p>Log a violation if a token exists on first line.</p>")
public class TokenOnFirstLineCheck extends CCheck implements AstAndTokenVisitor {

  private boolean violationAlreadyTriggeredOnCurrentFile = false;
  private static final int LINE = 1;

  @Override
  public void visitFile(AstNode node) {
    violationAlreadyTriggeredOnCurrentFile = false;
  }

  public void visitToken(Token token) {
    if ( !violationAlreadyTriggeredOnCurrentFile && token.getLine() == LINE) {
      violationAlreadyTriggeredOnCurrentFile = true;
      getContext().createLineViolation(this, "Remove this token from the first line", LINE);
    }
  }
}
