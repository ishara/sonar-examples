/*
 * Copyright (C) 2009-2013 SonarSource SA
 * All rights reserved
 * mailto:contact AT sonarsource DOT com
 */
package org.sonar.samples.javascript;

import org.sonar.check.Priority;
import org.sonar.check.Rule;
import org.sonar.plugins.javascript.api.tree.expression.FunctionExpressionTree;
import org.sonar.plugins.javascript.api.visitors.BaseTreeVisitor;

@Rule(
  key = "example",
  priority = Priority.MINOR,
  name = "Example",
  description = "desc")
/**
 * Example of implementation of a check by extending BaseTreeVisitor.
 * BaseTreeVisitor provides method to visit node of the AST that represent
 * the source code.
 * Those methods can be overriding to process information
 * related to node and issue can be created via the context that can be
 * accessed through BaseTreeVisitor#getContext().
 */
public class ExampleCheck extends BaseTreeVisitor {

  /**
   * Overriding method visiting the function expression to create an issue
   * each time a function expression is used.
   */
  @Override
  public void visitFunctionExpression(FunctionExpressionTree tree) {
    getContext().addIssue(this, tree, "Function expression.");
    // super method must be called in order to visit what is under the function node in the AST
    super.visitFunctionExpression(tree);
  }

}
