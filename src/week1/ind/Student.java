package week1.ind;

public class Student {

  private String name;
  private long id;

  public void setName(String name1) {
    name = name1;
  }


  public void setId(long id1) {
    id = id1;
  }

  public String getName() {
    return name;
  }

  public long getId() {
    return id;
  }

  public void hello() {
    System.out.println("Hello! My name is " + name + ", id = " + id);
  }


}
