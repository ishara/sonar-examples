/*
 * Copyright (C) 2009-2014 SonarSource SA
 * All rights reserved
 * mailto:contact AT sonarsource DOT com
 */
package org.sonar.samples.java.checks;

import org.sonar.api.server.rule.RulesDefinition;
import org.sonar.check.Priority;
import org.sonar.check.Rule;
import org.sonar.plugins.java.api.JavaFileScanner;
import org.sonar.plugins.java.api.JavaFileScannerContext;
import org.sonar.plugins.java.api.tree.BaseTreeVisitor;
import org.sonar.plugins.java.api.tree.MethodTree;
import org.sonar.squidbridge.annotations.SqaleConstantRemediation;
import org.sonar.squidbridge.annotations.SqaleSubCharacteristic;

/**
 * This class is an example of how to implement your own rules.
 * The (stupid) rule raises a minor issue each time a method is encountered.
 * The @Rule annotation allows to specify metadata like rule key, name, description
 * or default severity.
 */
@Rule(key = "MethodDeclaration",
  name = "Avoid using methods",
  description = "My stupid rule to avoid calling methods",
  tags = {"stupid", "example"},
  // default severity (formerly "priority") when rule is enabled in Quality profile
  priority = Priority.MINOR)
@SqaleSubCharacteristic(RulesDefinition.SubCharacteristics.ARCHITECTURE_CHANGEABILITY)
@SqaleConstantRemediation("10min")
/**
 * The class extends BaseTreeVisitor: the visitor for the Java AST.
 * The logic of the rule is implemented by overriding its methods.
 * It also implements the JavaFileScanner interface to be injected with the JavaFileScannerContext to attach issues to this context.
 */
public class AvoidMethodDeclarationRule extends BaseTreeVisitor implements JavaFileScanner {

  /**
   * Private field to store the context: this is the object used to create issues.
   */
  private JavaFileScannerContext context;

  /**
   * Implementation of the method of the JavaFileScanner interface.
   * @param context Object used to attach issues to source file.
   */
  @Override
  public void scanFile(JavaFileScannerContext context) {
    this.context = context;

    // The call to the scan method on the root of the tree triggers the visit of the AST by this visitor
    scan(context.getTree());

    // For debugging purpose, you can print out the entire AST of the analyzed file
    System.out.println(PrinterVisitor.print(context.getTree()));

  }

  /**
   * Overriding the visitor method to implement the logic of the rule.
   * @param tree AST of the visited method.
   */
  @Override
  public void visitMethod(MethodTree tree) {

    // All the code located before the call to the overridden method is executed before visiting the node

    // Adds an issue by attaching it with the tree and the rule
    context.addIssue(tree, this, "Avoid method calls (don't ask why)");

    // The call to the super implementation allows to continue the visit of the AST.
    // Be careful to always call this method to visit every node of the tree.
    super.visitMethod(tree);

    // All the code located after the call to the overridden method is executed when leaving the node
  }

}
