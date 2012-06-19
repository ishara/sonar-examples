package example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class OneTest {
  @Test
  public void testFoo() throws Exception {
    One one = new One();
    assertEquals("foo", one.foo());
  }

}
