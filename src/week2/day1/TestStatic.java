package week2.day1;

import com.sun.org.apache.xpath.internal.SourceTree;

public class TestStatic {

  public static void main(String[] args) {

    System.out.println(Example.counter);

    Example ex1 = new Example();

    System.out.println(Example.counter);
  }
}
