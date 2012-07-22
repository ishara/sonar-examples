public class Two {
  String message = "foo";

  public String foo() {
    return message;
  }

  public void uncoveredMethod() {
    System.out.println(foo());
  }
  
  public void uncoveredMethod2() {
    System.out.println(foo());
  }
  
}
