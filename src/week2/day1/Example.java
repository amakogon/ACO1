package week2.day1;

public class Example {

  public static int counter;
  private int number;

  public Example() {
    counter++;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public int getNumber() {
    return number;
  }

  public int getCounter() {

    return counter;
  }

  public static int getStaticCounter() {
    return counter;
  }

}
