package week5.day2;

import week3.day1.IStack;

import java.util.EmptyStackException;
import java.util.Iterator;

public class MyLinkedStack<T> implements IStack<T>{

  private Node top;
  private int size;

  @Override
  public boolean push(T o) {
    Node node = new Node(o, top);
    top = node;
    size++;
    return true;
  }

  @Override
  public T pop() {
    if(top == null) {
      throw new EmptyStackException();
    }
    T value = (T) top.value;
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

  @Override
  public Iterator iterator() {
    return null;
  }

  private static class Node<T> {
    T value;
    Node next;

    private Node(T value, Node next) {
      this.value = value;
      this.next = next;

    }

  }
}
