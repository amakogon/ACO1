package week1.day1;


public class TestMan {
  public static void main(String[] args) {
    Man man = new Man();
    man.setName("Artem");
//    man.name = "Artem";
    man.setAge(-1);

    System.out.println("Age = " + man.getAge());

//    System.out.println("Age = " + man.age +
//                         ", name = " + man.name);
    man.hello();

    Man m1 = new Man();
//    m1.name = "Katia";
//    m1.age = -10;
//    m1.sex = "dog";



    m1.hello();
  }
}
