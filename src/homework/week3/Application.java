package homework.week3;

import homework.week3.employees.Director;
import homework.week3.employees.Employee;
import week3.day1.IStack;
import week3.day1.MyStack;

import java.util.Scanner;

/**
 * Created by amakogon on 15.03.15.
 */
public class Application {

  private static Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    IStack stack = new MyStack();
    stack.push("director");
    stack.push("administrator");

    while (true) {
      System.out.println("1. Enter login");
      System.out.println("2. Exit");
      String login = scanner.next();
      if (!login.equals("2") && !stack.contains(login)) {
        System.out.println("wrong login");
      } else {
        showTerminal(login);
      }
      if(login.equals("2")) {
        break;
      }
    }
  }

  private static void showTerminal(String login) {
    ServiceCenter serviceCenter = new ServiceCenter("hospital");
    Director serviceCenterDirector = new Director("Boss", 6000);
    serviceCenterDirector.setCompany(serviceCenter);

    if ("director".equals(login)) {
      directorTerminal(serviceCenterDirector);
    }
  }

  private static void directorTerminal(Director director) {
    while (true) {
      System.out.println("1. нанять сотрудника");
      System.out.println("2. уволить сотрудника");
      System.out.println("3. посмотреть всех сотрудников");
      System.out.println("4. exit");
      int item = scanner.nextInt();
      if (item == 1) {
        Employee newEmployee = createEmployee();
        director.hireEmployee(newEmployee);
      } else if (item == 2) {
        System.out.println("Enter employee id");
        int id = scanner.nextInt();
        director.fireEmployee(id);
      } else if (item == 3) {
        director.showEmployees();
      } else if (item == 4) {
        break;
      }
    }
  }

  private static Employee createEmployee() {
    System.out.println("Enter name");
    String employeeName = scanner.next();
    System.out.println("Enter salary");
    int employeeSalary = scanner.nextInt();

    return new Employee(employeeName, employeeSalary);
  }
}
