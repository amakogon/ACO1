package week5.day2;

import java.io.File;
import java.io.IOException;

/**
 * Created by amakogon on 26.03.15.
 */
public class TestCreateFile {
  public static void main(String[] args) throws IOException {
    File file = new File("/home/amakogon/TestCreate");
    file.setReadable(true);
    boolean result = file.createNewFile();


    System.out.println(result);

  }
}
