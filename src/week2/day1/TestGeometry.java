package week2.day1;

import week2.day1.geometry.Circle;
import week2.day1.geometry.Figure;
import week2.day1.geometry.Romb;
import week2.day1.geometry.Square;
import week2.day1.geometry.Triangle;

/**
 * Created by amakogon on 04.03.15.
 */
public class TestGeometry {

  public static void main(String[] args) {

    Square square = new Square();
    square.setSide(5);

    double s = square.square();
    System.out.println(s);

    int a = 4;
    long d = a;

    Circle circle = new Circle();
    circle.setRadius(5);

    Triangle t = new Triangle();
    System.out.println(calculateSqure(circle));

    Romb romb = new Romb();
    System.out.println("Romb square = " + calculateSqure(romb));


  }

  public static double calculateSqure(Square square) {
    return square.square();
  }

  public static double calculateSqure(Figure figure) {
    return figure.square();
  }

}
