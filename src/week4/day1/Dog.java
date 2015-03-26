package week4.day1;

import week1.day2.Address;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by amakogon on 18.03.15.
 */
public class Dog implements Cloneable, Serializable{

  private transient String name;
  private int age;
//  private Address address = new Address();
  private Date birthday;

  public Dog(String name) {
    this.name = name;
    birthday = new Date();
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public void bark(int count) throws MyException {
    if(count < 2) {
      throw new MyException();
    }

    for (int i = 0; i < count; i++) {
      System.out.print("Gav ");
    }
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    Dog dog = (Dog) super.clone();
    dog.name = name + "";
    dog.birthday = (Date) birthday.clone();
    return dog;
  }

  public void setBirthday(Date birthday) {
    this.birthday = birthday;
  }

  @Override
  public String toString() {
    return String.format("Name %s, age %d, day of birth %s", name, age, birthday);
  }
}
