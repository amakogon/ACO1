package week6.day1;

import helper.FileHelper;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Created by amakogon on 01.04.15.
 */
public class Task1 {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader =
      new BufferedReader(new InputStreamReader(System.in));
    File file = null;
    while (true) {
      System.out.println("Enter path to file");
      String filePath = bufferedReader.readLine();
      file = new File(filePath);
      if (file.exists()) {
        break;
      }
    }
    System.out.println("Enter text");

    String line = bufferedReader.readLine();
    StringBuilder builder = new StringBuilder();
    while (!line.isEmpty()) {
      builder.append(line);
      line = bufferedReader.readLine();
    }

    FileHelper.writeToFile(file, builder.toString());
  }
}
