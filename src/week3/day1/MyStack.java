package week3.day1;

/**
 * Created by amakogon on 12.03.15.
 */
public class MyStack implements IStack {

  private static final int DEFAULT_SIZE = 16;

  private Object[] elements;
  private int index;

  public MyStack() {
//    elements = new Object[DEFAULT_SIZE];
    this(DEFAULT_SIZE);
  }

  public MyStack(int size) {
    elements = new Object[size];
  }

  @Override
  public Object pop() {
    if (index == 0) {
      return null;
    }

    Object top = elements[--index];
    //elements[index] = null;
    return top;
  }

  @Override
  public boolean push(Object o) {
    if (index >= elements.length) {
      return false;
    }
    elements[index] = o;
    index++;
    return true;
  }

  @Override
  public boolean remove(Object o) {
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
  public boolean contains(Object o) {
    for (int i = 0; i < index; i++) {
      if (elements[i].equals(o)) {
        return true;
      }
    }
    return false;
  }
}
