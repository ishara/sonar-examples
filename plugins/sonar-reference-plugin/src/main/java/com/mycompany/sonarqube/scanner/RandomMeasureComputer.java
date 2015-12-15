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
import org.apache.commons.lang.math.RandomUtils;
import org.sonar.api.ce.measure.Component;
import org.sonar.api.ce.measure.Measure;
import org.sonar.api.ce.measure.MeasureComputer;

public class RandomMeasureComputer implements MeasureComputer {

  @Override
  public MeasureComputerDefinition define(MeasureComputerDefinitionContext defContext) {
    return defContext.newDefinitionBuilder()
      .setOutputMetrics(ExampleMetrics.RANDOM.getKey())
      .build();
  }

  @Override
  public void compute(MeasureComputerContext context) {
    // This method is executed on the whole tree of components.
    // Bottom-up traversal : files -> directories -> modules -> project

    double value;
    if (context.getComponent().getType() == Component.Type.FILE) {
      // set a random value on files
      value = RandomUtils.nextDouble();
    } else {
      // directory, module or project: sum values of children
      value = 0.0;
      for (Measure childMeasure : context.getChildrenMeasures(ExampleMetrics.RANDOM.getKey())) {
        value += childMeasure.getDoubleValue();
      }
    }
    context.addMeasure(ExampleMetrics.RANDOM.getKey(), value);
  }

  @Override
  public String toString() {
    return getClass().getSimpleName();
  }
}
