package week6.day1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by amakogon on 01.04.15.
 */
public class Ex1 {

  public static void main(String[] args) throws FileNotFoundException {
    File file = new File("/home/amakogon/TempFile");
    String message = "Some line";
    FileWriter fileWriter = null;
    try {
      fileWriter = new FileWriter(file);
      fileWriter.write(message + "1\n");
      fileWriter.write(message + "2\n");
//      fileWriter.flush();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (fileWriter != null) {
        try {
          fileWriter.close();
        } catch (IOException ignored) {
        }
      }
    }

    PrintWriter printWriter =
      new PrintWriter(new FileOutputStream(file, true), false);
    try {
//      printWriter.write("message");
      printWriter.append("message");
    } finally {
      printWriter.close();
    }
  }
}
