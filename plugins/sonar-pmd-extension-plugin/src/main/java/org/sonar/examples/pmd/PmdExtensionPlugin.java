package org.sonar.examples.pmd;

import org.sonar.api.SonarPlugin;

import java.util.Arrays;
import java.util.List;

public class PmdExtensionPlugin extends SonarPlugin {

  public List getExtensions() {
    return Arrays.asList(PmdExtensionRepository.class);
  }

}
