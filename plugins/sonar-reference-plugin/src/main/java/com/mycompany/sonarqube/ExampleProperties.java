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

import java.util.Arrays;
import java.util.List;
import org.sonar.api.config.PropertyDefinition;

public class ExampleProperties {

  public static final String MY_PROPERTY_KEY = "sonar.example.myproperty";

  private ExampleProperties() {
    // only statics
  }

  public static List<PropertyDefinition> definitions() {
    return Arrays.asList(
      PropertyDefinition.builder(MY_PROPERTY_KEY)
        .name("My Property")
        .description("Description of my property")
        .defaultValue("Hello World!")
        .build(),

      PropertyDefinition.builder(FooLanguage.FILE_SUFFIXES_PROPERTY_KEY)
        .name("File Suffixes")
        .description("Comma-separated list of suffixes for files to analyze.")
        .defaultValue(FooLanguage.DEFAULT_FILE_SUFFIXES)
        .build()
      );
  }
}
