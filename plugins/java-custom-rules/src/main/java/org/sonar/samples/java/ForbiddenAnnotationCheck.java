package org.sonar.samples.java;

import java.util.List;

import org.sonar.api.rule.RuleKey;
import org.sonar.check.Priority;
import org.sonar.check.Rule;
import org.sonar.plugins.java.api.JavaFileScanner;
import org.sonar.plugins.java.api.JavaFileScannerContext;
import org.sonar.plugins.java.api.tree.AnnotationTree;
import org.sonar.plugins.java.api.tree.BaseTreeVisitor;
import org.sonar.plugins.java.api.tree.IdentifierTree;
import org.sonar.plugins.java.api.tree.MethodTree;
import org.sonar.plugins.java.api.tree.Tree;

@Rule(key = ExampleCheck.KEY, priority = Priority.MAJOR, name = "Avoid using annotations starting with a Z",
  description = "My stupid rule to avoid using annotations starting with a Z.")
public class ForbiddenAnnotationCheck extends BaseTreeVisitor implements JavaFileScanner {

  public static final String KEY = "MyKey123";
  private final RuleKey RULE_KEY = RuleKey.of(JavaExtensionRulesRepository.REPOSITORY_KEY, KEY);

  private JavaFileScannerContext context;

  @Override
  public void scanFile(JavaFileScannerContext context) {
    this.context = context;

    scan(context.getTree());

    System.out.println(PrinterVisitor.print(context.getTree()));
  }

  @Override
  public void visitMethod(MethodTree tree) {

    List<AnnotationTree> annotations = tree.modifiers().annotations();
    for (AnnotationTree annotationTree : annotations) {
      if (annotationTree.annotationType().is(Tree.Kind.IDENTIFIER)) {
        IdentifierTree idf = (IdentifierTree) annotationTree.annotationType();
        System.out.println(idf.name());

        if (idf.name().startsWith("Z")) {
          context.addIssue(idf, RULE_KEY, "Avoid using annotations starting with a Z");
        }
      }
    }

    // The call to the super implementation allows to continue the visit of the AST.
    // Be careful to always call this method to visit every node of the tree.
    super.visitMethod(tree);
  }
}
