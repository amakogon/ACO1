package week4.day2;

/**
 * Created by amakogon on 19.03.15.
 */
public class Rec {

  public static void main(String[] args) {
     fact(5);
    recFail(2);
  }

  public static int fact(int val) {
    if (val < 2) {
      return 1;
    }

    return val * fact(val - 1);
  }

  public static int recFail(int a) {
    return recFail(a);
  }
}
