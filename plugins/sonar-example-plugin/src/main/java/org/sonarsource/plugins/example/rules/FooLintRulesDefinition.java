package org.sonarsource.plugins.example.rules;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import org.sonar.api.server.rule.RulesDefinition;
import org.sonar.api.server.rule.RulesDefinitionXmlLoader;
import org.sonarsource.plugins.example.languages.FooLanguage;

public final class FooLintRulesDefinition implements RulesDefinition {

  protected static final String KEY = "foolint";
  protected static final String NAME = "FooLint";

  protected String rulesDefinitionFilePath() {
    return "/example/foolint-rules.xml";
  }

  private void defineRulesForLanguage(Context context, String repositoryKey, String repositoryName, String languageKey) {
    NewRepository repository = context.createRepository(repositoryKey, languageKey).setName(repositoryName);

    InputStream rulesXml = this.getClass().getResourceAsStream(rulesDefinitionFilePath());
    if (rulesXml != null) {
      RulesDefinitionXmlLoader rulesLoader = new RulesDefinitionXmlLoader();
      rulesLoader.load(repository, rulesXml, StandardCharsets.UTF_8.name());
    }

    repository.done();
  }

  @Override
  public void define(Context context) {
    String repositoryKey = FooLintRulesDefinition.getRepositoryKeyForLanguage(FooLanguage.KEY);
    String repositoryName = FooLintRulesDefinition.getRepositoryNameForLanguage(FooLanguage.KEY);
    defineRulesForLanguage(context, repositoryKey, repositoryName, FooLanguage.KEY);
  }

  public static String getRepositoryKeyForLanguage(String languageKey) {
    return languageKey.toLowerCase() + "-" + KEY;
  }

  public static String getRepositoryNameForLanguage(String languageKey) {
    return languageKey.toUpperCase() + " " + NAME;
  }

}
