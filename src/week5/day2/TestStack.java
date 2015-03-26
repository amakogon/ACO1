package week5.day2;

import week3.day1.IStack;

/**
 * Created by amakogon on 26.03.15.
 */
public class TestStack {
  public static void main(String[] args) {
    IStack stack = new MyLinkedStack();

    stack.push(1);
    stack.push(2);
    stack.push(3);

    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());
  }
}
