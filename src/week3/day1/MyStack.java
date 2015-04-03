package week3.day1;

import java.util.Iterator;

/**
 * Created by amakogon on 12.03.15.
 */
public class MyStack<T> implements IStack<T> {

  private static final int DEFAULT_SIZE = 16;

  private T[] elements;
  private int index;

  public MyStack() {
//    elements = new Object[DEFAULT_SIZE];
    this(DEFAULT_SIZE);
  }

  public MyStack(int size) {
    elements = (T[]) new Object[size];
  }

  @Override
  public T pop() {
    if (index == 0) {
      return null;
    }

    T top = elements[--index];
    //elements[index] = null;
    return top;
  }

  @Override
  public boolean push(T o) {
    if (index >= elements.length) {
      return false;
    }
    elements[index] = o;
    index++;
    return true;
  }

  @Override
  public boolean remove(T o) {
    for (int i = 0; i < index; i++) {
      if (elements[i].equals(o)) {
        System.arraycopy(elements, i + 1, elements, i, index - i);
        index--;
        return true;
      }
    }
    return false;
  }

  @Override
  public boolean contains(T o) {
    for (int i = 0; i < index; i++) {
      if (elements[i].equals(o)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Iterator<T> iterator() {
    return new MyItarator<T>();
  }

  private class MyItarator<E> implements Iterator<E> {
    int iteratorIndex = index - 1;
    @Override
    public boolean hasNext() {
      if(iteratorIndex < 0){
        return false;
      }
      return elements[iteratorIndex] != null;
    }

    @Override
    public E next() {
      return (E) elements[iteratorIndex--];
    }

    @Override
    public void remove() {
      throw new UnsupportedOperationException();
    }
  }
}
