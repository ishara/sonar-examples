/*
 * Example Plugin for SonarQube
 * Copyright (C) 2009-2016 SonarSource SA
 * mailto:contact AT sonarsource DOT com
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package com.mycompany.sonarqube;

import com.mycompany.sonarqube.scanner.ExampleSensor;
import com.mycompany.sonarqube.scanner.FooLintIssuesLoaderSensor;
import com.mycompany.sonarqube.scanner.IssueSensor;
import com.mycompany.sonarqube.scanner.ListAllIssuesPostJob;
import com.mycompany.sonarqube.scanner.RandomMeasureComputer;
import com.mycompany.sonarqube.rules.FooLintProfile;
import com.mycompany.sonarqube.rules.FooLintRulesDefinition;
import com.mycompany.sonarqube.rules.MyCustomJavaRulesDefinition;
import com.mycompany.sonarqube.ui.ExampleFooter;
import com.mycompany.sonarqube.ui.ExampleRubyWidget;
import java.util.ArrayList;
import java.util.List;
import org.sonar.api.SonarPlugin;

import static java.util.Arrays.asList;

/**
 * This class is the entry point for all extensions. It must be referenced from pom.xml.
 */
public final class ExamplePlugin extends SonarPlugin {

  /**
   * Returns the list of the extensions to be available at runtime.
   */
  @Override
  public List getExtensions() {
    List extensions = new ArrayList();
    extensions.addAll(ExampleProperties.definitions());
    extensions.add(FooLanguage.class);
    extensions.add(ExampleMetrics.class);

    // Rules, Quality Profile
    extensions.addAll(asList(FooLintRulesDefinition.class, FooLintProfile.class, MyCustomJavaRulesDefinition.class));

    // Scanner
    extensions.addAll(asList(ExampleSensor.class, RandomMeasureComputer.class, IssueSensor.class, ListAllIssuesPostJob.class, FooLintIssuesLoaderSensor.class));

    // UI
    extensions.addAll(asList(ExampleFooter.class, ExampleRubyWidget.class));
    return extensions;
  }
}
