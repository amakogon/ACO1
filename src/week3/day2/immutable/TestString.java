package week3.day2.immutable;

/**
 * Created by amakogon on 13.03.15.
 */
public class TestString {

  public static void main(String[] args) {
    int a = 5;

    System.out.println("A = " + 5);

    String s = "";

//    Do not do that!!!!
//    for (int i = 0; i < 1000000; i++) {
//      s += i;
//    }
    System.out.println(s);


    StringBuilder stringBuilder = new StringBuilder();

//    for (int i = 0; i < 10000000; i++) {
//      stringBuilder.append(i);
//    }

    String result = stringBuilder.toString();

    System.out.println(result);

    String name = "Vova";
    int age = 26;
    System.out.println("My name is " + name + ", age " + age);

    System.out.println(String.format("My name is %s, age %d, PI = %.2f", name, age, Math.PI));

    int q = 5;
    int w = 7;

    String res = "" + q + w ;

    System.out.println(res);

  }
}
