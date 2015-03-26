package week4.day2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by amakogon on 19.03.15.
 */
public class TestCheckedException {

  public static void main(String[] args) throws ParseException {


    SimpleDateFormat format = new SimpleDateFormat();
    System.out.println(new Date());
    String time = "Thu Mar 7 21:21:12 EET 2015";
    format.applyPattern("EEE MMM dd HH:mm:ss zzz yyyy");

    Date parseDate = null;
    try {
      parseDate = format.parse(time);

      System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa");
    } catch (ParseException e) {
    }

    String time2 = "Thu Mar 7 21:21:12 EET 2015";

    parseDate = format.parse(time2);
    System.out.println(parseDate);

    int a = 0;

    //not necessary tot wrap into try-catch block/ just for learn purpose
    try {
      a = Integer.parseInt("4sdf");
    } catch (NumberFormatException e) {
      System.out.println("wrong string");
    } catch (Exception e) {

    }
    System.out.println(a);

  }
}
