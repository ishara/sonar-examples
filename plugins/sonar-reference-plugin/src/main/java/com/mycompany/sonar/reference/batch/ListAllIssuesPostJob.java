package com.mycompany.sonar.reference.batch;

import org.sonar.api.batch.CheckProject;
import org.sonar.api.batch.SensorContext;
import org.sonar.api.issue.Issue;
import org.sonar.api.issue.ProjectIssues;
import org.sonar.api.resources.Project;

public class ListAllIssuesPostJob implements org.sonar.api.batch.PostJob, CheckProject {

  private final ProjectIssues projectIssues;

  public ListAllIssuesPostJob(ProjectIssues projectIssues) {
    this.projectIssues = projectIssues;
  }

  @Override
  public boolean shouldExecuteOnProject(Project project) {
    return Boolean.TRUE;
  }

  @Override
  public void executeOn(Project project, SensorContext context) {
    System.out.println("ListAllIssuesPostJob");

    // all open issues
    for (Issue issue : projectIssues.issues()) {
      String ruleKey = issue.ruleKey().toString();
      Integer issueLine = issue.line();
      String severity = issue.severity();
      boolean isNew = issue.isNew();

      // just to illustrate, we dump some fields of the 'issue' in sysout (bad, very bad)
      System.out.println(ruleKey + " : " + issue.componentKey() + "(" + issueLine + ")");
      System.out.println("isNew: " + isNew + " | severity: " + severity);
    }

    // all resolved issues
    for (Issue issue : projectIssues.resolvedIssues()) {
      String ruleKey = issue.ruleKey().toString();
      Integer issueLine = issue.line();
      boolean isNew = issue.isNew();

      System.out.println(ruleKey + " : " + issue.componentKey() + "(" + issueLine + ")");
      System.out.println("isNew: " + isNew + " | resolution: " + issue.resolution());
    }
  }
}
