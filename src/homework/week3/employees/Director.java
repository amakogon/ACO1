package homework.week3.employees;

import homework.week3.ServiceCenter;

/**
 * Created by amakogon on 15.03.15.
 */
public class Director extends Employee implements IDirector {

  private ServiceCenter serviceCenter;

  public Director(String name, int salary) {
    super(name, salary);
  }

  @Override
  public boolean hireEmployee(Employee employee) {
    return serviceCenter.addEmployee(employee);
  }

  @Override
  public boolean fireEmployee(Employee employee) {
    return serviceCenter.fireEmployee(employee);
  }

  public boolean fireEmployee(int employeeId) {
    Employee looser = serviceCenter.getEmployee(employeeId);
    return serviceCenter.fireEmployee(looser);
  }

  @Override
  public Employee[] getEmployees() {
    return serviceCenter.getEmployees();
  }

  public void setCompany(ServiceCenter serviceCenter) {
    this.serviceCenter = serviceCenter;
  }

  public void showEmployees() {
    for (int i = 0; i < getEmployees().length; i++) {
      System.out.println(getEmployees()[i]);
    }
  }

  public void paySalary() {
    for (int i = 0; i < getEmployees().length; i++) {
      long money = serviceCenter.getMoney();
      serviceCenter.setMoney(money - getEmployees()[i].getSalary());
    }
  }

}
