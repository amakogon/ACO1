package week2.day1.geometry;

/**
 * Created by amakogon on 04.03.15.
 */
public class Triangle extends Figure{

  private int side;
  private int height;

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }

  public int getSide() {
    return side;
  }

  public void setSide(int side) {
    this.side = side;
  }

  public double square() {
    return side * height * 0.5;
  }


}
