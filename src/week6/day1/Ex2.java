package week6.day1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

/**
 * Created by amakogon on 01.04.15.
 */
public class Ex2 {
  public static void main(String[] args) throws IOException{
    FileReader reader = new FileReader("/home/amakogon/TempFile");

    StringBuilder builder = new StringBuilder();
    char[] buff = new char[130];
    int symbol = reader.read(buff);
    while (symbol != -1) {
      for (int i = 0; i < buff.length; i++) {
        builder.append((char) buff[i]);
      }
      symbol = reader.read(buff);
    }
    System.out.println("Readed symbol = " + builder);
    BufferedReader bufferedReader
      = new BufferedReader(new InputStreamReader(new FileInputStream("/home/amakogon/TempFile")));
  }
}
