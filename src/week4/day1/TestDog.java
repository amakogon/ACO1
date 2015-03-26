package week4.day1;

import java.util.Date;

/**
 * Created by amakogon on 18.03.15.
 */
public class TestDog {

  public static void main(String[] args) {
    Dog dog = new Dog("Friend");

//    Cloneable cloneable = dog;

    dog.setBirthday(new Date(4234324324L));

    Dog clonedDog = null;
//    try {
//      clonedDog = (Dog) dog.clone();
//    } catch (CloneNotSupportedException e) {
//      e.printStackTrace();
//    }
    try {
      clonedDog = (Dog) dog.clone();
    } catch (CloneNotSupportedException e) {

    }


    System.out.println(dog);
    System.out.println(clonedDog);


  }

}
