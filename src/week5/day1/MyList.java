package week5.day1;

import java.util.AbstractList;
import java.util.List;

/**
 * Created by amakogon on 25.03.15.
 */
public class MyList extends AbstractList {

  private static final int DEFAULT_SIZE = 16;

  private Object[] elements;
  private int index;

  public MyList() {
    this(DEFAULT_SIZE);
  }

  public MyList(int size) {
    elements = new Object[size];
  }


  @Override
  public boolean add(Object o) {
    ensureCapacity();

    elements[index++] = o;
    return true;
  }

  @Override
  public void add(int index, Object element) {
    if (index < 0 || index > size()) {
      throw new IndexOutOfBoundsException();
    }
    // code for adding element
  }

  private void ensureCapacity() {
    if (index >= elements.length) {
      Object[] newArray = new Object[elements.length * 2];
      System.arraycopy(elements, 0, newArray, 0, elements.length);
      elements = newArray;
    }
  }

  @Override
  public Object get(int index) {
    return elements[index];
  }

  @Override
  public Object set(int index, Object element) {
    return super.set(index, element);
  }

  @Override
  public Object remove(int index) {
    return super.remove(index);
  }

  @Override
  public int indexOf(Object o) {
    return super.indexOf(o);
  }

  @Override
  public void clear() {
    super.clear();
  }

  @Override
  public List subList(int fromIndex, int toIndex) {
    return super.subList(fromIndex, toIndex);
  }

  @Override
  public boolean isEmpty() {
    return super.isEmpty();
  }

  @Override
  public boolean contains(Object o) {
    return super.contains(o);
  }

  @Override
  public boolean remove(Object o) {
    return super.remove(o);
  }

  @Override
  public Object[] toArray() {
    return super.toArray();
  }

  @Override
  public String toString() {
    return super.toString();
  }

  @Override
  public int size() {
    return index;
  }
}
