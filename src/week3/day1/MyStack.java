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
    if(index == 0) {
      return new Object();
    }

    Object top = elements[--index];
    //elements[index] = null;
    return top;
  }

  @Override
  public boolean push(Object o) {
    if(index >= elements.length) {
      return false;
    }
    elements[index] = o;
    index++;
    return true;
  }
}
