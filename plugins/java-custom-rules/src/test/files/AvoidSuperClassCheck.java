/*
 * Creation : 20 avr. 2015
 */
package org.sonar.samples.java;

import org.apache.log4j.Logger;

/**
 * A class with extends another class outside the JVM but in classpath
 */
public class AvoidSuperClassCheck extends Logger {

  protected AvoidSuperClassCheck(String name) {
    super(name);
  }

}
