package week6.day2;

/**
 * Created by amakogon on 02.04.15.
 */
public class TestSingleton {
  public static void main(String[] args) {
    MySingletone singletone = MySingletone.getInstance();
    MySingletone singletone1 = MySingletone.getInstance();
    MySingletone.getSomeField();
  }
}
