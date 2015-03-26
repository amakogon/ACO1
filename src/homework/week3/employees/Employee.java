package homework.week3.employees;

/**
 * Created by amakogon on 15.03.15.
 */
public class Employee {

  private String name;
  private int salary;
  private long id;

  private static long idGenerator = 1;

  public Employee(String name, int salary) {
    this.name = name;
    this.salary = salary;
    id = idGenerator++;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public long getId() {
    return id;
  }

  @Override
  public String toString() {
    return "Employee{" +
      "name='" + name + '\'' +
      ", salary=" + salary +
      ", id=" + id +
      '}';
  }
}
