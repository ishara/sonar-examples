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
package com.mycompany.sonarqube.scanner;

import com.mycompany.sonarqube.ExampleMetrics;
import com.mycompany.sonarqube.ExampleProperties;
import org.sonar.api.batch.Sensor;
import org.sonar.api.batch.SensorContext;
import org.sonar.api.batch.fs.FileSystem;
import org.sonar.api.batch.fs.InputFile;
import org.sonar.api.config.Settings;
import org.sonar.api.measures.Measure;
import org.sonar.api.resources.Project;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

public class ExampleSensor implements Sensor {

  private static final Logger LOG = Loggers.get(ExampleSensor.class);

  private Settings settings;
  private FileSystem fs;

  /**
   * Use of IoC to get Settings and FileSystem
   */
  public ExampleSensor(Settings settings, FileSystem fs) {
    this.settings = settings;
    this.fs = fs;
  }

  @Override
  public boolean shouldExecuteOnProject(Project project) {
    LOG.info("ProjectName: " + project.getName());
    LOG.info("ProjectScope: " + project.getScope());
    LOG.info("Project isRoot ?" + project.isRoot());
    LOG.info("Project isModule ?" + project.isModule());

    // This sensor is executed only when there are Java files
    return fs.hasFiles(fs.predicates().hasLanguage("java"));
  }

  @Override
  public void analyse(Project project, SensorContext sensorContext) {
    LOG.info("ExampleSensor.analyse(...) method called for Project: " + project.getName());

    // This sensor create a measure for metric MESSAGE on each Java file
    String value = settings.getString(ExampleProperties.MY_PROPERTY_KEY);
    LOG.info("{}={}", ExampleProperties.MY_PROPERTY_KEY, value);
    for (InputFile inputFile : fs.inputFiles(fs.predicates().hasLanguage("java"))) {
      sensorContext.saveMeasure(inputFile, new Measure<String>(ExampleMetrics.MESSAGE, value));
    }
  }

  @Override
  public String toString() {
    return getClass().getSimpleName();
  }

}
