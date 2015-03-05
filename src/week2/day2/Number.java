package week2.day2;

/**
 * Created by amakogon on 05.03.15.
 */
public class Number {

  private double value;

  public Number(double value) {
    this.value = value;
  }

  public double getValue() {
    return value;
  }

  public void setValue(double value) {
    this.value = value;
  }



  public Number addNumber(Number number){
//    int resultValue = this.value + number.getValue();
//    Number result = new Number(resultValue);
//    return result;
   return new Number(this.value + number.getValue());
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == null) {
      return false;
    }

    if (obj == this) {
      return true;
    }

    if(!(obj instanceof Number)) {
      return false;
    }

    Number other = (Number) obj;
    return other.getValue() == this.value;

  }

  public String toString(){
    return String.valueOf(value);
  }





}
