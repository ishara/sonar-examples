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

      // just to illustrate, we dump some fields of the 'issue' in sysout (bad, very bad)
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
