package week4.day1;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by amakogon on 18.03.15.
 */
public class TestLine {

  public static void main(String[] args) {
    Line[] lines = new Line[3];
    lines[0] = new Line(5);
    lines[1] = new Line(3);
    lines[2] = new Line(1);

    Arrays.sort(lines, new Comparator<Line>(){
      @Override
      public int compare(Line o1, Line o2) {
        if(o1.getLength() > o2.getLength()) {
          return 1;
        }
        if(o1.getLength() < o2.getLength()) {
          return -1;
        }
        return 0;
      }

    });

  }


}
