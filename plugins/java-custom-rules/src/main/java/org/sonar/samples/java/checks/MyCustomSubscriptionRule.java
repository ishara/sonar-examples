package org.sonar.samples.java.checks;

import java.util.List;

import org.sonar.api.server.rule.RulesDefinition;
import org.sonar.check.Rule;
import org.sonar.plugins.java.api.IssuableSubscriptionVisitor;
import org.sonar.plugins.java.api.semantic.Symbol.MethodSymbol;
import org.sonar.plugins.java.api.semantic.Type;
import org.sonar.plugins.java.api.tree.MethodTree;
import org.sonar.plugins.java.api.tree.Tree;
import org.sonar.squidbridge.annotations.SqaleConstantRemediation;
import org.sonar.squidbridge.annotations.SqaleSubCharacteristic;

import com.google.common.collect.ImmutableList;

@Rule(key = "method_with_same_type_as_arg",
  name = "method with same return type as argument",
  description = "This rule detects methods with same type as argument",
  tags = {"example"})
@SqaleSubCharacteristic(RulesDefinition.SubCharacteristics.ARCHITECTURE_CHANGEABILITY)
@SqaleConstantRemediation("10min")
/**
 * To use subsctiption visitor, just extend the IssuableSubscriptionVisitor.
 */
public class MyCustomSubscriptionRule extends IssuableSubscriptionVisitor {

  @Override
  public List<Tree.Kind> nodesToVisit() {
    // Register to the kind of nodes you want to be called upon visit.
    return ImmutableList.of(Tree.Kind.METHOD);
  }

  @Override
  public void visitNode(Tree tree) {
    // Cast the node to the correct type :
    // in this case we registered only to one kind so we will only receive MethodTree see Tree.Kind enum to know about which type you can
    // cast depending on Kind.
    MethodTree methodTree = (MethodTree) tree;
    // Retrieve symbol of method.
    MethodSymbol methodSymbol = methodTree.symbol();
    Type returnType = methodSymbol.returnType().type();
    // Check method has only one argument.
    if (methodSymbol.parameterTypes().size() == 1) {
      Type argType = methodSymbol.parameterTypes().get(0);
      // Verify argument type is same as return type.
      if (argType.is(returnType.fullyQualifiedName())) {
        // raise an issue on this node of the SyntaxTree
        addIssue(tree, "message");
      }
    }
  }
}
