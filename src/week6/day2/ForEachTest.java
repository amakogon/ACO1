package week6.day2;


import week3.day1.IStack;
import week3.day1.MyStack;
import week5.day1.MyList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEachTest {
  public static void main(String[] args) {
    int[] mas = {4, 2, 1, 86, 5};

    for(int i : mas){
      System.out.print(i + " ");
    }
    List<Integer> list = new ArrayList<Integer>();
    list.add(1);
    list.add(14);
    list.add(54);
    System.out.println("~~~~~~~~~~`");
    for(Integer integer : list) {
      System.out.print(integer + " ");
    }


    IStack<Integer> stack = new MyStack<Integer>();
    stack.push(1);
    stack.push(14);
    stack.push(54);
    System.out.println();
    for(Integer i : stack) {
      System.out.println(i);
    }
    Iterator<Integer> iterator = stack.iterator();

    while(iterator.hasNext()) {
      System.out.println(iterator.next());
    }

  }
}
