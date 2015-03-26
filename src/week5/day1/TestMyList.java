package week5.day1;

import java.util.List;

/**
 * Created by amakogon on 25.03.15.
 */
public class TestMyList {

  public static void main(String[] args) {
    List myList = new MyList();

    myList.add(1);
    myList.add(14, 3);

    System.out.println(myList.get(0));

  }
}
