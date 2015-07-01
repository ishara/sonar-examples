package com.mycompany.sonar.reference;

import java.io.InputStream;
import java.util.List;

import org.sonar.api.server.rule.RulesDefinition;
import org.sonar.api.server.rule.RulesDefinitionXmlLoader;

import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;

public final class ExampleRulesDefinition implements RulesDefinition {

  protected static final String KEY = "example";
  protected static final String NAME = "Example";

  protected static final List<String> LANGUAGE_KEYS = ImmutableList.of("java");

  public ExampleRulesDefinition() {
  }

  protected String rulesDefinitionFilePath() {
    return "/rules.xml";
  }

  private void defineRulesForLanguage(Context context, String repositoryKey, String repositoryName, String languageKey) {
    NewRepository repository = context.createRepository(repositoryKey, languageKey).setName(repositoryName);

    InputStream rulesXml = this.getClass().getResourceAsStream(rulesDefinitionFilePath());
    if (rulesXml != null) {
      RulesDefinitionXmlLoader rulesLoader = new RulesDefinitionXmlLoader();
      rulesLoader.load(repository, rulesXml, Charsets.UTF_8.name());
    }

    repository.done();
  }

  @Override
  public void define(Context context) {
    for (String languageKey : LANGUAGE_KEYS) {
      defineRulesForLanguage(context, ExampleRulesDefinition.getRepositoryKeyForLanguage(languageKey), ExampleRulesDefinition.getRepositoryNameForLanguage(languageKey),
        languageKey);
    }
  }

  public static String getRepositoryKeyForLanguage(String languageKey) {
    return languageKey.toLowerCase() + "-" + KEY;
  }

  public static String getRepositoryNameForLanguage(String languageKey) {
    return languageKey.toUpperCase() + " " + NAME;
  }

}
