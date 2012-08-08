package org.codehaus.sonar.tests.simple;

import java.util.Collection;

import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.definition.KnowledgePackage;
import org.drools.definition.type.FactField;
import org.drools.definition.type.FactType;
import org.drools.io.ResourceFactory;
import org.drools.runtime.StatefulKnowledgeSession;

public class MultiRules {

  public static void run() throws Exception {
    new MultiRules().execute(new String[] { "multirules.drl" }, "Freddy", "Olivier", "Simon", "Jeremie");
  }

  public void execute(String[] rules, String... names) throws Exception {

    KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
    KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();

    for (int i = 0; i < rules.length; i++) {
      String ruleFile = rules[i];
      System.out.println("Loading file: " + ruleFile);
      kbuilder.add(ResourceFactory.newClassPathResource(ruleFile, MultiRules.class), ResourceType.DRL);
    }

    Collection<KnowledgePackage> pkgs = kbuilder.getKnowledgePackages();
    kbase.addKnowledgePackages(pkgs);
    StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();
    FactType factType = ksession.getKnowledgeBase().getFactType("org.codehaus.sonar.tests.simple", "SonarUser");

    for (String name : names) {
      Object fact = factType.newInstance();
      FactField field = factType.getField("name");
      if (field != null) {
        field.set(fact, name);
      }
      System.out.println("Inserting fact: " + fact);
      ksession.insert(fact);
    }

    ksession.fireAllRules();
  }

}
