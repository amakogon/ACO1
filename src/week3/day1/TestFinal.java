package week3.day1;

import week2.day2.*;
import week2.day2.Number;

/**
 * Created by amakogon on 12.03.15.
 */
public class TestFinal {

  public static final int TEST = 4;

  public static void main(String[] args) {
    final int a = 5;

    final week2.day2.Number number = new Number(5);

    number.setValue(13);

    System.out.println(number);
    System.out.println(TEST);
  }
}
