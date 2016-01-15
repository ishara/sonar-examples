/*
 * Example Plugin for SonarQube LTS
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
package com.mycompany.sonar.reference;

import java.util.Arrays;
import java.util.List;

import org.sonar.api.Properties;
import org.sonar.api.Property;
import org.sonar.api.SonarPlugin;

import com.mycompany.sonar.reference.batch.ExampleSensor;
import com.mycompany.sonar.reference.batch.FooLintIssuesLoaderSensor;
import com.mycompany.sonar.reference.batch.IssueSensor;
import com.mycompany.sonar.reference.batch.ListAllIssuesPostJob;
import com.mycompany.sonar.reference.batch.RandomDecorator;
import com.mycompany.sonar.reference.rules.FooLintProfile;
import com.mycompany.sonar.reference.rules.FooLintRulesDefinition;
import com.mycompany.sonar.reference.rules.MyCustomJavaRulesDefinition;
import com.mycompany.sonar.reference.ui.ExampleFooter;
import com.mycompany.sonar.reference.ui.ExampleRubyWidget;

/**
 * This class is the entry point for all extensions
 */
@Properties({
  @Property(
    key = ExamplePlugin.MY_PROPERTY,
    name = "Plugin Property",
    description = "A property for the plugin",
    defaultValue = "Hello World!"),
  @Property(
    key = ExamplePlugin.FILE_SUFFIXES_KEY,
    name = "File Suffixes",
    description = "Comma-separated list of suffixes for files to analyze.",
    defaultValue = ExamplePlugin.DEFAULT_FILE_SUFFIXES)
})
public final class ExamplePlugin extends SonarPlugin {

  public static final String MY_PROPERTY = "sonar.example.myproperty";

  public static final String FILE_SUFFIXES_KEY = "sonar.foo.file.suffixes";
  public static final String DEFAULT_FILE_SUFFIXES = "foo";

  // This is where you're going to declare all your SonarQube extensions
  @Override
  public List getExtensions() {
    return Arrays.asList(
      // Language
      FooLanguage.class,

      // Rules, Quality Profile
      FooLintRulesDefinition.class, FooLintProfile.class, MyCustomJavaRulesDefinition.class,

      // Metrics
      ExampleMetrics.class,

      // Batch
      ExampleSensor.class, RandomDecorator.class, IssueSensor.class, ListAllIssuesPostJob.class, FooLintIssuesLoaderSensor.class,

      // UI
      ExampleFooter.class, ExampleRubyWidget.class);
  }
}
