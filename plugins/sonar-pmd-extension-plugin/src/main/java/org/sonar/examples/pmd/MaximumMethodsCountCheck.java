package org.sonar.examples.pmd;

import net.sourceforge.pmd.AbstractRule;
import net.sourceforge.pmd.ast.ASTClassOrInterfaceBody;
import net.sourceforge.pmd.ast.ASTMethodDeclaration;
import net.sourceforge.pmd.properties.IntegerProperty;

import java.util.List;

public class MaximumMethodsCountCheck extends AbstractRule {

  private static final IntegerProperty propertyDescriptor = new IntegerProperty(
      "maxAuthorisedMethodsCount", "Maximum number of methods authorised", 2, 1.0f);

  public Object visit(ASTClassOrInterfaceBody node, Object data) {
    List<ASTMethodDeclaration> methods = node.findChildrenOfType(ASTMethodDeclaration.class);
    if (methods.size() > getIntProperty(propertyDescriptor)) {
      addViolation(data, node);
    }
    return super.visit(node, data);
  }

}
