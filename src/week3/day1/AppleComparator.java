package week3.day1;

import java.util.Comparator;

/**
 * Created by amakogon on 12.03.15.
 */
public class AppleComparator implements Comparator<Apple> {


  @Override
  public int compare(Apple o1, Apple o2) {
    if (o1.getPrice() > o2.getPrice()) {
      return 1;
    }
    if (o1.getPrice() < o2.getPrice()) {
      return -1;
    }
    return 0;
  }
}
