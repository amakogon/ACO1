package week3.day1;

import week2.day1.company.Developer;
import week2.day1.company.ITSpecialist;
import week2.day1.company.Tester;

/**
 * Created by amakogon on 12.03.15.
 */
public class TestArtist {

  public static void main(String[] args) {
    ITSpecialist specialist = new Developer();
    Tester tester = new Tester();


    Compositor compositor = new Compositor();
    ISongWriter compositor1 = new Compositor();

    compositor1.writeSong();
  }

}
