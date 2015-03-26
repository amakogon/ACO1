package week4.day2;

import helper.ArrayHelper;

public class TestBinSearch {

  public static void main(String[] args) {
    int[] mas = {7, 11, 23, 54, 76, 100};

    int result = ArrayHelper.binarySearch(mas, 5);
    System.out.println(result);
  }
}
