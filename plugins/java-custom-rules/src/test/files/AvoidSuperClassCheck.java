/*
 * Creation : 20 avr. 2015
 */
package org.sonar.samples.java;

import org.apache.log4j.Logger;

/**
 * A class with extends another class outside the JVM but in classpath
 */
public class AvoidSuperClassCheck extends Logger { // Noncompliant {{The usage of super class org.apache.log4j.Logger is forbidden}}

  protected AvoidSuperClassCheck(String name) {
    super(name);
  }

}
