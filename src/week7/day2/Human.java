package week7.day2;

import java.io.Serializable;

public class Human implements Serializable {
  private static final long serialVersionUID = 4223423423432L;

  private String name;
  private int age;

  public Human(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Human{" +
      "name='" + name + '\'' +
      ", age=" + age +
      '}';
  }
}
