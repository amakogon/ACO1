package week8.day1;

public class Test {
  public static void main(String[] args) {
//    Integer a = 5;
//    addSeven(a);
//    Value v = new Value(5);
////    System.out.println(a);
//    System.out.println(v);

    Integer a = 1;
    Integer b = 2;

    swap(a,b);
    System.out.println("A = " + a);
    System.out.println("B = " + b);

  }

  private static void swap(Integer a, Integer b) {
    Integer temp = a;
    a = b;
    b = temp;
  }


  public static void addSeven(Value x){
    x.setValue(x.getValue() + 7);
  }

  public static class Value {
    private int value;

    public Value(int value) {
      this.value = value;
    }

    public int getValue() {
      return value;
    }

    public void setValue(int value) {
      this.value = value;
    }
  }
}
