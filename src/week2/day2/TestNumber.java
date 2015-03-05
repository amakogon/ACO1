package week2.day2;

/**
 * Created by amakogon on 05.03.15.
 */
public class TestNumber {

  public static void main(String[] args) {
    Number n1 = new Number(5);
    Number n2 = new Number(5);
    boolean qwe = n1.equals(n2);
    System.out.println(n1.equals(n2));

    Number result = n1.addNumber(n2);

    System.out.println(n1.getValue());
    System.out.println(result.getValue());


    System.out.println(result.toString());

    String s = new String("test");
    String s2 = "test";

    System.out.println(s == s2);


    Integer i = 5;

    Integer i2 = 5;

    System.out.println(i == i2);




  }
}
