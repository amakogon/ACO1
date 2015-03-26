package helper;


public class ArrayHelper {


  public static int binarySearch(int[] array, int target) {
    int start = 0;
    int end = array.length - 1;
    while (start <= end) {
      int mid = (start + end) / 2;

      if (target == array[mid]) {
        return mid;
      }
      if (array[mid] > target) {
        end = mid - 1;
      } else if (array[mid] < target) {
        start = mid + 1;
      }
    }

    return -1;

  }

}
