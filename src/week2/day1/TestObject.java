package week2.day1;

import week2.day1.company.Developer;

/**
 * Created by amakogon on 04.03.15.
 */
public class TestObject {

  public static void main(String[] args) {

    Object o = new Object();
    Developer developer = new Developer();

    String s = developer.toString();

    Developer developer1 = new Developer();

    System.out.println(developer.equals(developer1));
    System.out.println(s);
  }
}
