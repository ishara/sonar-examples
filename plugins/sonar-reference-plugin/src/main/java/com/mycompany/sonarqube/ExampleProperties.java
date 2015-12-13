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
