package week3.day2.immutable;

/**
 * Created by amakogon on 13.03.15.
 */
public class AutoBox {
  public static void main(String[] args) {
    Integer i = new Integer(5);

    Integer i2 = Integer.parseInt("10");

    Integer a = 5;
    Integer b = Integer.valueOf(5);


    int c = 10;

    Integer qwe = c;

    Long l = 123L;

    long primL = l;


    Integer integer = 1;
    int asd =1;

    System.out.println(System.currentTimeMillis());
    for (int j = 0; j < 1000000000; j++) {
      integer = j;
//      asd = j;

    }
    System.out.println(integer);
    System.out.println(asd);
    System.out.println(System.currentTimeMillis());
  }

}
