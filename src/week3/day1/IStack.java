package week3.day1;

/**
 * Created by amakogon on 12.03.15.
 */
public interface IStack<T> extends Iterable<T> {

  T pop();

  boolean push(T o);

  boolean remove(T o);

  boolean contains(T o);

}
