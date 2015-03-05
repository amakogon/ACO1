package week2.day1.company;

/**
 * Created by amakogon on 04.03.15.
 */
public abstract class ITSpecialist {

  public String name;
  public int age;
  public int salary;

  public ITSpecialist() {
  }

  public ITSpecialist(String name, int age, int salary) {
    this.name = name;
    this.age = age;
    this.salary = salary;
  }

  public abstract void work();
}
