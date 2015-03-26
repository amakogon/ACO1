package week3.day1;

/**
 * Created by amakogon on 12.03.15.
 */
public class TestStack {

  public static void main(String[] args) {
    IStack stack = new MyStack();

    Integer i = 5;
    Integer i1 = new Integer(5);


    stack.push(1);
    stack.push(2);
    stack.push(3);


    stack.remove(2);
    System.out.println(stack.pop());
    System.out.println(stack.pop());
    System.out.println(stack.pop());

  }
}
