package week3.day1;

import helper.VarHelper;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by amakogon on 12.03.15.
 */
public class TestSort {

  public static void main(String[] args) {
    Apple[] apples = new Apple[5];
    for (int i = 0; i < apples.length; i++) {
      apples[i] = new Apple("Gold", VarHelper.random(5));
      apples[i].setPrice(VarHelper.random(10));
    }
    System.out.println(Arrays.toString(apples));
    Arrays.sort(apples, new AppleComparator());
    System.out.println(Arrays.toString(apples));
  }


  public class MyComparator implements Comparator<Apple> {

    @Override
    public int compare(Apple o1, Apple o2) {
      return 0;
    }
  }

}
