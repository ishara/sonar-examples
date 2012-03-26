/*
 * Copyright (C) 2010 SonarSource SA
 * All rights reserved
 * mailto:contact AT sonarsource DOT com
 */

package org.sample.c.checks;

import java.util.List;

import org.sonar.api.SonarPlugin;

import com.google.common.collect.Lists;

public class CustomCRulesPlugin extends SonarPlugin {

  public List getExtensions() {
    return Lists.newArrayList(TokenOnFirstLineCheck.class);
  }
}
