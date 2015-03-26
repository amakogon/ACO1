package week5.day1;

import week4.day1.Dog;

import java.util.concurrent.TimeUnit;

/**
 * Created by amakogon on 25.03.15.
 */
public class Test {

  public static void main(String[] args) throws CloneNotSupportedException {

    Test test = new Test();


    try {
      System.out.println("Before clone");
      test.clone();
      System.out.println("after clone");
    } finally {
      System.out.println("in finally");
    }


  }

  public static void methodDoNotThrowException() {

  }





}
