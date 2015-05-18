/*
 * Copyright (C) 2009-2013 SonarSource SA
 * All rights reserved
 * mailto:contact AT sonarsource DOT com
 */
package org.sonar.samples.javascript;

import com.google.common.collect.ImmutableSet;
import org.sonar.check.Priority;
import org.sonar.check.Rule;
import org.sonar.plugins.javascript.api.tree.expression.CallExpressionTree;
import org.sonar.plugins.javascript.api.tree.expression.ExpressionTree;
import org.sonar.plugins.javascript.api.tree.expression.IdentifierTree;
import org.sonar.plugins.javascript.api.visitors.BaseTreeVisitor;

import java.util.Set;

/**
 * Example of implementation of a check by extending {@link BaseTreeVisitor}.
 * BaseTreeVisitor provides method to visit node of the Abstract Syntax Tree
 * that represents the source code.
 * <p>
 * Those methods can be overriding to process information
 * related to node and issue can be created via the context that can be
 * accessed through {@link BaseTreeVisitor#getContext()}.
 */
@Rule(
  key = "S1",
  priority = Priority.MAJOR,
  name = "Forbidden function should not be used.",
  description = "<p>The following functions should not be used:</p> <ul><li>foo</li> <li>bar</li></ul>")
public class ForbiddenFunctionUseCheck extends BaseTreeVisitor {

  private static final Set<String> FORBIDDEN_FUNCTIONS = ImmutableSet.of("foo", "bar");

  /**
   * Overriding method visiting the call expression to create an issue
   * each time a call to "foo()" or "bar()" is done.
   */
  @Override
  public void visitCallExpression(CallExpressionTree tree) {
    ExpressionTree callee = tree.callee();

    if (callee instanceof IdentifierTree && FORBIDDEN_FUNCTIONS.contains(((IdentifierTree) callee).name())) {
      getContext().addIssue(this, tree, "Remove the usage of this forbidden function.");
    }

    // super method must be called in order to visit what is under the function node in the
    super.visitCallExpression(tree);
  }

}
