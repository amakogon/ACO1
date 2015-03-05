package week2.day2;

/**
 * Created by amakogon on 05.03.15.
 */
public class TestEquals {

  public static void main(String[] args) {
    Number n1 = new Number(5);
    Number n2 = new Number(5);
    Number n3 = n2;
    System.out.println(n1.equals(n2));
    System.out.println(n2.equals(n1));
    System.out.println(n2.equals(null));
    System.out.println(n2.equals(new Child()));
    System.out.println(n2.equals(n2));
    System.out.println(n2.equals(n3));
  }
}
