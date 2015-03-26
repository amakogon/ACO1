package homework.week3.employees;

/**
 * Created by amakogon on 15.03.15.
 */
public interface IDirector {

  boolean hireEmployee(Employee employee);
  boolean fireEmployee(Employee employee);
  Employee[] getEmployees();

}
