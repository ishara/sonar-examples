package example;

public class One {
  String message = "foo";
  String message2 = "toto";

  public String foo() {
    return message;
  }

  public String toto() {
    return message2;
  }

  public void uncoveredMethod() {
    System.out.println(foo());
  }
}
