package week1.day1;

public class Man {
  private String name;
  private int age;
  private String sex;

  public void setName(String name1) {
    name = name1;
  }

  public String getName() {
    return name;
  }

  public void setAge(int age1) {
    if (age1 > 0) {
      age = age1;
    }
  }

  public int getAge() {
    return age;
  }

  public void setSex(String sex1) {
    sex = sex1;
  }

  public String getSex() {
    return sex;
  }

  public void hello() {
    System.out.println("Hi! My name is = " + name
                         + ", age =" + age + ", sex = " + sex);
  }

}
