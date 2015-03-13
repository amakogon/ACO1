package week3.day1;

import helper.VarHelper;
import week1.day2.Student;

import java.util.Arrays;

/**
 * Created by amakogon on 12.03.15.
 */
public class TestApple {

  public static void main(String[] args) {
//    Apple apple1 = new Apple("Gold", 12);
//    Apple apple2 = new Apple("Gold", 10);

//    System.out.println( apple1.compareTo(apple2));

    Apple[] apples = new Apple[5];
    for (int i = 0; i < apples.length; i++) {
      apples[i] = new Apple("Gold", VarHelper.random(5));
    }
    System.out.println(Arrays.toString(apples));


//    for (int i = 0; i < apples.length; i++) {
//      for (int j = 0; j < apples.length - i - 1; j++) {
//         if (apples[j].compareTo(apples[j + 1]) > 0) {
//           Apple temp = apples[j];
//           apples[j] = apples[j + 1];
//           apples[j + 1] = temp;
//         }
//      }
//    }

    sort(apples);

    System.out.println(Arrays.toString(apples));
  }

  public static void sort(Comparable[] objects){
    for (int i = 0; i < objects.length; i++) {
      for (int j = 0; j < objects.length - i - 1; j++) {
        if (objects[j].compareTo(objects[j + 1]) > 0) {
          Comparable temp = objects[j];
          objects[j] = objects[j + 1];
          objects[j + 1] = temp;
        }
      }
    }
  }
}
