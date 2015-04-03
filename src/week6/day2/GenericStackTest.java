package week6.day2;

import week3.day1.IStack;
import week3.day1.MyStack;

public class GenericStackTest{


  public static void main(String[] args) {
    IStack<Integer> stack = new MyStack<Integer>();
    stack.push(2);
    stack.push(3);

    System.out.println(stack.pop());
    System.out.println(stack.pop());
  }
}
