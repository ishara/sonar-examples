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
package com.mycompany.sonar.reference.batch;

import org.apache.commons.lang.math.RandomUtils;
import org.sonar.api.batch.Decorator;
import org.sonar.api.batch.DecoratorContext;
import org.sonar.api.measures.MeasureUtils;
import org.sonar.api.resources.Project;
import org.sonar.api.resources.Resource;
import org.sonar.api.resources.ResourceUtils;

import com.mycompany.sonar.reference.ExampleMetrics;

/**
 * Decorator is removed in 5.2
 */
public class RandomDecorator implements Decorator {

  @Override
  public boolean shouldExecuteOnProject(Project project) {
    return true;
  }

  @Override
  public void decorate(Resource resource, DecoratorContext context) {
    // This method is executed on the whole tree of resources.
    // Bottom-up navigation : Files -> Dirs -> modules -> project
    if (ResourceUtils.isFile(resource)) {
      // Sonar API includes many libraries like commons-lang and google-collections
      double value = RandomUtils.nextDouble();

      // Add a measure to the current File
      context.saveMeasure(ExampleMetrics.RANDOM, value);

    } else {
      // we sum random values on resources different than file. Another option would be to declare a Formula on metric declaration
      context.saveMeasure(ExampleMetrics.RANDOM, MeasureUtils.sum(true, context.getChildrenMeasures(ExampleMetrics.RANDOM)));
    }
  }

  @Override
  public String toString() {
    return getClass().getSimpleName();
  }

}
