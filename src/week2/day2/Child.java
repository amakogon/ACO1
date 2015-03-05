package week2.day2;

/**
 * Created by amakogon on 05.03.15.
 */
public class Child extends Parent{

  int childField;

  public Child() {
    super();
    System.out.println("In child constructor");
  }


  public void childMethod() {
    super.parentMethod();
  }
}
