package week8.day2;

public class TestSalad {
  public static void main(String[] args) {
    Salad mySalad = Salad.builder(4, 1).cucumbers(2).onion(1).tomat(2).salt(5).build();
  }
}
