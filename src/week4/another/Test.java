package week4.another;

import week4.day1.Animal;

/**
 * Created by amakogon on 18.03.15.
 */
public class Test {
  public static void main(String[] args) {
    Animal animal = new Animal();
    Cat cat = new Cat();


//    System.out.println(animal.defautField);
//    System.out.println(animal.protectedField);
    System.out.println(animal.publicField);
    System.out.println(animal.publicField);

    cat.method();
  }

}
