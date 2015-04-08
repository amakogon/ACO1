package week6.day2;

import java.util.Comparator;

/**
 * Created by amakogon on 02.04.15.
 */
public class TestDay {
  public static void main(String[] args) {
    Day monday = Day.MONDAY;
    System.out.println(monday);
    System.out.println(Day.FRIDAY);

    System.out.println(Day.SATURDAY.getNumber());


    System.out.println("all values:");
    for(int i = 0; i < Day.values().length; i++) {
      System.out.println(Day.values()[i]);
    }
    System.out.println();
    System.out.println();
    System.out.println();
    Day day = Day.valueOf("MONDAY");
    System.out.println("ValueOfDay = " + day);

    System.out.println(Day.FRIDAY.compareTo(Day.MONDAY) > 0);

//    System.out.println(Day.valueOf("asdsadsa"));
    System.out.println(Day.values()[0]);

  }
}
