package week3.day1;


public class Apple implements Comparable<Apple> {
  private String type;
  private int weight;
  private int price;

  public Apple(String type, int weight) {
    this.type = type;
    this.weight = weight;
  }

  @Override
  public int compareTo(Apple apple) {
//     return weight > apple.weight ? 1: weight < apple.weight ? -1 : 0;

    int result = 0;
    if (weight > apple.weight) {
      result = 1;
    }
    if (weight < apple.weight) {
      result = -1;
    }

    return result;
  }

  @Override
  public String toString() {
    return "Apple{" +
      "type='" + type + '\'' +
      ", weight=" + weight +
      ", price=" + price +
      '}';
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }
}
