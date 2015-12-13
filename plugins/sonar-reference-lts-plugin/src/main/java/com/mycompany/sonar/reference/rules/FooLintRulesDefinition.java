package com.mycompany.sonar.reference.rules;

import java.io.InputStream;
import java.util.List;

import org.sonar.api.server.rule.RulesDefinition;
import org.sonar.api.server.rule.RulesDefinitionXmlLoader;

import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;
import com.mycompany.sonar.reference.FooLanguage;

public final class FooLintRulesDefinition implements RulesDefinition {

  protected static final String KEY = "foolint";
  protected static final String NAME = "FooLint";

  protected static final List<String> LANGUAGE_KEYS = ImmutableList.of(FooLanguage.KEY);

  public FooLintRulesDefinition() {
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
      defineRulesForLanguage(context, FooLintRulesDefinition.getRepositoryKeyForLanguage(languageKey), FooLintRulesDefinition.getRepositoryNameForLanguage(languageKey),
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
