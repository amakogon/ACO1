package week1.day2;

public class Group {
  private String groupName;
  private Student[] students = new Student[10];
  private int counter;

  public Group(String groupName) {
    this.groupName = groupName;
  }

  public Group(String groupName, int groupSize) {
    this.groupName = groupName;
    this.students = new Student[groupSize];
  }


  public String getGroupName() {
    return groupName;
  }

  public void setGroupName(String groupName) {
    this.groupName = groupName;
  }

  public Student[] getStudents() {
    return students;
  }

  public boolean addStudent(Student student) {
    boolean added = false;
    if (counter < students.length) {
      students[counter] = student;
      counter++;
      added = true;
    }
    return added;
  }

  public void showStudents() {
    for (int i = 0; i < counter; i++) {
      students[i].showInfo();
    }
  }

}
