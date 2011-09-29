package org.sonar.examples.checkstyle;

import org.sonar.api.SonarPlugin;

import java.util.Arrays;
import java.util.List;

public final class CheckstyleExtensionPlugin extends SonarPlugin {
  public List getExtensions() {
    return Arrays.asList(CheckstyleExtensionRepository.class);
  }
}
