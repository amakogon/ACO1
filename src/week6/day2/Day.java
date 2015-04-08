package week6.day2;

import java.util.Calendar;

public enum Day implements Comparable<Day>{
  FRIDAY(5),MONDAY(17), TUESDAY(2), WEDNESDAY(3), THURSDAY(4),
   SATURDAY(6), SUNDAY(7);

  private int number;

  private Day(int number) {
    this.number = number;
  }

  public int getNumber() {
    return number;
  }

}
