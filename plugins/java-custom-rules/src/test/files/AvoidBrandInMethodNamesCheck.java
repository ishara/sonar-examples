/**
 *This file is the sample code against we run our unit test.
 *It is placed src/test/files in order to not be part of the maven compilation.
 **/
class AvoidBrandInNamesCheck {

  int aField;

  public void methodWithMYCOMPANY() { // We expect an issue at this line.

  }

  public void methodWithMyCompany() { // We expect an issue at this line.

  }

  public void methodWithMyOtherCompany() {

  }

}
