package week1.day2;

import java.util.Scanner;

/**
 * Created by amakogon on 26.02.15.
 */
public class TestGroup {

  public static void main(String[] args) {
    Group group = new Group("AA11", 20);

    System.out.println(group.getGroupName());
    Student[] g1 = group.getStudents();
    System.out.println(g1.length);

    Student student = new Student("Anton", "AA11");

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter student name");
    String studentName = sc.next();
    System.out.println("Enter group name");
    String groupName = sc.next();

    Student student1 = new Student(studentName, groupName);


//before add method
    Student[] temp = group.getStudents();
//    temp[0] = student;

//    group.getStudents()[0].showInfo();
//after addStudent method

    group.addStudent(student);
    group.addStudent(student1);
    group.showStudents();

  }

}
