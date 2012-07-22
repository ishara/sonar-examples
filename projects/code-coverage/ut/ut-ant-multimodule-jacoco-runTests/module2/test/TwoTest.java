import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TwoTest {
  @Test
  public void testFoo() throws Exception {
    Two two = new Two();
    assertEquals("foo", two.foo());
  }

}
