package week2.day1.geometry;

/**
 * Created by amakogon on 04.03.15.
 */
public class Square extends Figure {

  private int side;

  public int getSide() {
    return side;
  }

  public void setSide(int side) {
    this.side = side;
  }

  public double square() {
    return side * side;
  }
}
