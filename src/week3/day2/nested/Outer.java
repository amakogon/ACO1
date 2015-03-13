package week3.day2.nested;

public class Outer {
  private int a = 5;

  private static int stat =1123;


  public class Inner {
    private int a = 2;

    public void method(int a){
      System.out.println(a);
      System.out.println(this.a);
      System.out.println(Outer.this.a);
      System.out.println(stat);
    }
  }

  public static class Nested {

    public void method() {
      System.out.println(stat);
    }

  }
}
