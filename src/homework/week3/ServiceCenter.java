package homework.week3;

import homework.week3.employees.Employee;
import week1.day2.Address;

/**
 * Created by amakogon on 15.03.15.
 */
public class ServiceCenter {

  private Address address;
  private String companyName;
  private long money;

  private Employee[] employees;
  private int count;


  public ServiceCenter(String companyName) {
    this.companyName = companyName;
    this.employees = new Employee[16];
  }

  public boolean addEmployee(Employee employee) {
    if (count >= employees.length) {
      return false;
    }
    employees[count++] = employee;
    return true;
  }

  public boolean fireEmployee(Employee employee) {
    for (int i = 0; i < count; i++) {
      if (employees[i].equals(employee)) {
        System.arraycopy(employees, i + 1, employees, i, count - i);
        count--;
        return true;
      }
    }
    return false;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public Employee[] getEmployees() {
    Employee[] slaves = new Employee[count];
    for (int i = 0; i < count; i++) {
      slaves[i] = employees[i];
    }
    return slaves;
  }

  public Employee getEmployee(int id) {
    for (int i = 0; i < count; i++) {
      if (employees[i].getId() == id) {
        return employees[i];
      }
    }
    return null;
  }

  public int countEmployees() {
    return count;
  }

  public long getMoney() {
    return money;
  }

  public void setMoney(long money) {
    this.money = money;
  }
}
