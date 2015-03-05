package week2.day1.geometry;

/**
 * Created by amakogon on 04.03.15.
 */
public class Circle extends Figure{

  private int radius;

  public int getRadius() {
    return radius;
  }

  public void setRadius(int radius) {
    this.radius = radius;
  }

  public double square() {
    return Math.PI * Math.pow(radius, 2);
  }
}
