package week2.day1.company;

/**
 * Created by amakogon on 04.03.15.
 */
public class Tester extends ITSpecialist {

  private String type;

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public void work() {
    System.out.println("Testing code");
  }
}
