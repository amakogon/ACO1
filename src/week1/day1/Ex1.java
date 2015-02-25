package week1.day1;

public class Ex1 {
  public static void main(String[] args) {
    int[] mas1 = {1, 2, 3, 4, 5};
    int[] mas2 = mas1;

    System.out.println("Array 1");
    for (int i = 0; i < mas1.length; i++) {
      System.out.print(mas1[i] + " ");
    }
    System.out.println("\nArray 2");
    for (int i = 0; i < mas2.length; i++) {
      System.out.print(mas2[i] + " ");
    }

    mas2[0] = 100;
    System.out.println("\nArray 1 after");
    for (int i = 0; i < mas1.length; i++) {
      System.out.print(mas1[i] + " ");
    }
    System.out.println("\nArray 2 after");
    for (int i = 0; i < mas2.length; i++) {
      System.out.print(mas2[i] + " ");
    }

    String s = "";

  }
}
