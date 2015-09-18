package org.sonar.samples.java.checks;

import com.google.common.collect.ImmutableList;
import org.sonar.check.Rule;
import org.sonar.plugins.java.api.IssuableSubscriptionVisitor;
import org.sonar.plugins.java.api.tree.NewClassTree;
import org.sonar.plugins.java.api.tree.Tree;

import java.util.List;

@Rule(
  key = "AvoidUnmodifiableList",
  name = "Avoid usage of UnmodifiableList",
  description = "This rule detects instanciation of apache commons collections UnmodifableList",
  tags = {"example"})
public class AvoidUnmodifiableList extends IssuableSubscriptionVisitor {

  @Override
  public List<Tree.Kind> nodesToVisit() {
    return ImmutableList.of(Tree.Kind.NEW_CLASS);
  }

  @Override
  public void visitNode(Tree tree) {
    if (((NewClassTree) tree).symbolType().isSubtypeOf("org.apache.commons.collections4.list.UnmodifiableList")) {
      addIssue(tree, "Avoid using UnmodifiableList");
    }
  }

}
