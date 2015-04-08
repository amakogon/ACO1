package week7.day1;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyLinkedList<E> implements List<E> {
  private Node<E> first;
  private Node<E> last;
  private int size;

  @Override
  public boolean add(E e) {
    addLast(e);
    return true;
  }

  public boolean addLast(E e) {
    if (isEmpty()) {
      first = new Node<E>(e, null, null);
      last = first;
    } else {
      Node<E> newNode = new Node<E>(e, last, null);
      last.next = newNode;
      last = newNode;
    }
    size++;
    return true;
  }

  @Override
  public int size() {
    return size;
  }

  @Override
  public boolean isEmpty() {
    return size == 0;
  }

  @Override
  public E get(int index) {
    checkIndex(index);
    Node<E> node = first;
    if(index < (size / 2)) {
      for (int i = 0; i < index; i++) {
        node = node.next;
      }
    } else {
      node = last;
      for (int i = size -1 ; i > index; i--) {
        node = node.prev;
      }
    }
    return node.value;
  }

  private void checkIndex(int index) {
    if(index < 0 || index > size -1){
      throw new IndexOutOfBoundsException(String.valueOf(index));
    }
  }
   //TODO: implement
  @Override
  public boolean contains(Object o) {
    return false;
  }

  //TODO: implement
  @Override
  public Iterator<E> iterator() {
    return null;
  }

  @Override
  public Object[] toArray() {
    return new Object[0];
  }

  @Override
  public <T> T[] toArray(T[] a) {
    return null;
  }
  //TODO: implement
  @Override
  public boolean remove(Object o) {
    return false;
  }

  @Override
  public boolean containsAll(Collection<?> c) {
    return false;
  }

  @Override
  public boolean addAll(Collection<? extends E> c) {
    return false;
  }

  @Override
  public boolean addAll(int index, Collection<? extends E> c) {
    return false;
  }

  @Override
  public boolean removeAll(Collection<?> c) {
    return false;
  }

  @Override
  public boolean retainAll(Collection<?> c) {
    return false;
  }
  //TODO: implement
  @Override
  public void clear() {

  }
  //TODO: implement
  @Override
  public E set(int index, E element) {
    return null;
  }
  //TODO: implement
  @Override
  public void add(int index, E element) {

  }
  //TODO: implement
  @Override
  public E remove(int index) {
    return null;
  }
  //TODO: implement
  @Override
  public int indexOf(Object o) {
    return 0;
  }

  @Override
  public int lastIndexOf(Object o) {
    return 0;
  }

  @Override
  public ListIterator<E> listIterator() {
    return null;
  }

  @Override
  public ListIterator<E> listIterator(int index) {
    return null;
  }

  @Override
  public List<E> subList(int fromIndex, int toIndex) {
    return null;
  }

  private static class Node<E> {
    E value;
    Node<E> prev;
    Node<E> next;

    private Node(E value, Node<E> prev, Node<E> next) {
      this.value = value;
      this.prev = prev;
      this.next = next;
    }
  }
}
