package week1.day2;

/**
 * Created by amakogon on 26.02.15.
 */
public class TestAddress {

  public static void main(String[] args) {
    Address address = new Address();
    address.setCity("Kiev");
    address.setStreet("OldKievskaya");
    address.setHouse(10);
    address.setFlat(214);
    
    Student s = new Student();
    s.setAddress(address);
  }

}
