package week1.day1;

import helper.VarHelper;

public class Ex2 {
  public static void main(String[] args) {

    int[] mas = new int[1];
    int groupSize = 100;
    Group g1 = new Group();
    Man[] group = new Man[groupSize];

    for (int i = 0; i < groupSize; i++) {
      Man man = new Man();
      man.setName("Man" + i);
      man.setAge(VarHelper.random(30));
      group[i] = man;
    }
    g1.setStudents(group);

    for (int i = 0; i < groupSize; i++) {
      group[i].hello();
    }
  }
}
