package week7.day1;

import java.util.List;

public class TestList {
  public static void main(String[] args) {
    List<Integer> list = new MyLinkedList<Integer>();
    list.add(2);
    list.add(1);
    list.add(5);

    System.out.println(list.get(0));
    System.out.println(list.get(1));
    System.out.println(list.get(2));
    System.out.println(list.get(15));
  }
}
