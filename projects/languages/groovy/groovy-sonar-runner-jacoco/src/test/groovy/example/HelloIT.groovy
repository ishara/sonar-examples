package example;

import org.junit.Test;

class HelloIT {

  @Test
  void test_sayHelloToIntegrationTests() {
    def hello = new Hello()
    hello.sayHelloToIntegrationTests()
    assert hello != null
  }
}
