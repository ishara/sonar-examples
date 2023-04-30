/*
 * Copyright (C) 2009-2013 SonarSource SA
 * All rights reserved
 * mailto:contact AT sonarsource DOT com
 */
package org.sonar.samples.php.checks;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import org.sonar.api.server.rule.RulesDefinition;
import org.sonar.check.Priority;
import org.sonar.check.Rule;
import org.sonar.plugins.php.api.tree.Tree;
import org.sonar.plugins.php.api.tree.Tree.Kind;
import org.sonar.plugins.php.api.tree.declaration.NamespaceNameTree;
import org.sonar.plugins.php.api.tree.expression.ExpressionTree;
import org.sonar.plugins.php.api.tree.expression.FunctionCallTree;
import org.sonar.plugins.php.api.visitors.PHPSubscriptionCheck;
import org.sonar.plugins.php.api.visitors.PHPVisitorCheck;
import org.sonar.squidbridge.annotations.SqaleConstantRemediation;
import org.sonar.squidbridge.annotations.SqaleSubCharacteristic;

import java.util.List;
import java.util.Set;

/**
 * Example of implementation of a check by extending {@link PHPSubscriptionCheck}.
 * PHPSubscriptionCheck provides method {@link PHPSubscriptionCheck#visitNode} to visit nodes of the Abstract Syntax Tree
 * that represents the source code. Provide the list of nodes you want to visit through {@link PHPSubscriptionCheck#nodesToVisit}.
 * <p>
 * Those methods should be overridden to process information
 * related to node and issue can be created via the context that can be
 * accessed through {@link PHPVisitorCheck#context()}.
 */
@Rule(
  key = "S1",
  priority = Priority.MAJOR,
  name = "Forbidden function should not be used.",
  tags = {"convention"}
// Description can either be given in this annotation or through HTML name <ruleKey>.html located in package src/resources/org/sonar/l10n/php/rules/<repositoryKey>
// description = "<p>The following functions should not be used:</p> <ul><li>foo</li> <li>bar</li></ul>",
  )
@SqaleSubCharacteristic(RulesDefinition.SubCharacteristics.DATA_RELIABILITY)
@SqaleConstantRemediation("5min")
public class OtherForbiddenFunctionUseCheck extends PHPSubscriptionCheck {

  private static final Set<String> FORBIDDEN_FUNCTIONS = ImmutableSet.of("foo", "bar");

  @Override
  public List<Kind> nodesToVisit() {
    return ImmutableList.of(Kind.FUNCTION_CALL);
  }

  /**
   * Overriding method visiting the call expression to create an issue
   * each time a call to "foo()" or "bar()" is done.
   */
  @Override
  public void visitNode(Tree tree) {
    ExpressionTree callee = ((FunctionCallTree) tree).callee();

    if (callee.is(Kind.NAMESPACE_NAME) && FORBIDDEN_FUNCTIONS.contains(((NamespaceNameTree) callee).qualifiedName())) {
      context().newIssue(this, "Remove the usage of this forbidden function.").tree(tree);
    }
  }

}
