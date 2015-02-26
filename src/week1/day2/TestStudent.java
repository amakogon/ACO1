package week1.day2;

public class TestStudent {

  public static void main(String[] args) {
    Student student = new Student("Artem", "AC-1");
    student.showInfo();

    student.setName("Vasia");
    student.setStudentId(1);
    student.setGroup("AC-1");

    student.showInfo();

    Student student1 = new Student();
    student1.setName("Artem");
    student1.setGroup("AC-1");








  }
}
