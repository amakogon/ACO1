package week3.day2.nested;

/**
 * Created by amakogon on 13.03.15.
 */
public class Test {

  public static void main(String[] args) {


    Outer outer = new Outer();
    Outer.Inner inner = outer.new Inner();

    inner.method(10);

    Outer.Nested nested = new Outer.Nested();
    nested.method();
  }
}
