package week1.day2;

public class Student {
  private String name;
  private long studentId;
  private String group;
  private String university;

  private Address address;

  public Student() {
    
  }

  public Student(String name, String group) {
    this.name = name;
    this.group = group;
  }

  public Student(String name, long studentId) {
    this.name = name;
    this.studentId = studentId;
  }



  public void setName(String name){
    this.name = name;
  }

  public void setStudentId(long id) {
    studentId = id;
  }

  public String getName() {
    return name;
  }

  public long getStudentId() {
    return studentId;
  }

  public void setGroup(String group) {
    this.group = group;
  }

  public String getGroup() {
    return group;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public void showInfo() {
    System.out.println("Name = " + name
                         + ", Id = " + studentId
                         + ", Group = " + group);
  }

}
