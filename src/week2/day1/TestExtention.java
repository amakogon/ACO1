package week2.day1;

import week2.day1.company.Developer;
import week2.day1.company.HR;
import week2.day1.company.ITSpecialist;
import week2.day1.company.Tester;

/**
 * Created by amakogon on 04.03.15.
 */
public class TestExtention {
  public static void main(String[] args) {

    Developer developer = new Developer();
    developer.setNumberOfLanguages(2);
    developer.salary = 2;

    Tester tester = new Tester();

    tester.name = "Vasia";

    HR hr = new HR();

    hr.work();

    ITSpecialist specialist = new Developer();
    specialist.work();

    developer.work();
    developer.work();


  }

}
