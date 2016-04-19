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

import org.sonar.api.batch.CheckProject;
import org.sonar.api.batch.SensorContext;
import org.sonar.api.issue.Issue;
import org.sonar.api.issue.ProjectIssues;
import org.sonar.api.resources.Project;
import org.sonar.api.utils.log.Logger;
import org.sonar.api.utils.log.Loggers;

public class ListAllIssuesPostJob implements org.sonar.api.batch.PostJob, CheckProject {

  private static final Logger LOGGER = Loggers.get(ListAllIssuesPostJob.class);
  private final ProjectIssues projectIssues;

  public ListAllIssuesPostJob(ProjectIssues projectIssues) {
    this.projectIssues = projectIssues;
  }

  @Override
  public boolean shouldExecuteOnProject(Project project) {
    return true;
  }

  @Override
  public void executeOn(Project project, SensorContext context) {
    LOGGER.info("ListAllIssuesPostJob");

    // all open issues
    for (Issue issue : projectIssues.issues()) {
      String ruleKey = issue.ruleKey().toString();
      Integer issueLine = issue.line();
      String severity = issue.severity();
      boolean isNew = issue.isNew();

      // just to illustrate, we dump some fields of the 'issue' into the logs
      LOGGER.info("{} : {}({})", ruleKey, issue.componentKey(), issueLine);
      LOGGER.info("isNew: {} | severity: {}", isNew, severity);
    }

    // all resolved issues
    for (Issue issue : projectIssues.resolvedIssues()) {
      LOGGER.info("{} : {}({})", issue.ruleKey().toString(), issue.componentKey(), issue.line());
      LOGGER.info("isNew: {} | resolution: {}", issue.isNew(), issue.resolution());
    }
  }
}
