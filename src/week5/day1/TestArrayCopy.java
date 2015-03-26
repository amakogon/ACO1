package week5.day1;

import java.util.Arrays;

/**
 * Created by amakogon on 25.03.15.
 */
public class TestArrayCopy {

  public static void main(String[] args) {
    int[] arr1 = {1,2,3,4};
    int[] arr2 = new int[10];

    System.arraycopy(arr1, 2, arr2, 5, 2);

    System.out.println(Arrays.toString(arr2));

    System.arraycopy(arr1, 0, arr1, 1, 2);
    System.out.println(Arrays.toString(arr1));
  }
}
