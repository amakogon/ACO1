package week5.day2;

import week3.day1.IStack;

import java.util.EmptyStackException;

public class MyLinkedStack implements IStack{

  private Node top;
  private int size;

  @Override
  public boolean push(Object o) {
    Node node = new Node(o, top);
    top = node;
    size++;
    return true;
  }

  @Override
  public Object pop() {
    if(top == null) {
      throw new EmptyStackException();
    }
    Object value = top.value;
    top = top.next;
    size--;
    return value;
  }

  @Override
  public boolean remove(Object o) {
    return false;
  }

  @Override
  public boolean contains(Object o) {
    return false;
  }

  private static class Node {
    Object value;
    Node next;

    private Node(Object value, Node next) {
      this.value = value;
      this.next = next;

    }

  }
}
