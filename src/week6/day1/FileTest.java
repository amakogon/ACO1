package week6.day1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by amakogon on 01.04.15.
 */
public class FileTest {
  public static void main(String[] args) {
    File directory = new File("/home/amakogon");
    File myFile = new File("/home/amakogon/TempFile");
//    directory.createNewFile()
//    System.out.println(directory.getAbsolutePath());
//    try {
//      System.out.println(directory.getCanonicalPath());
//    } catch (IOException e) {
//      e.printStackTrace();
//    }
    if(directory.isDirectory()) {
      File[] files = directory.listFiles();
      for (int i = 0; i < files.length; i++) {
//        if (files[i].equals(myFile)) {
//          System.out.println("Founded - " + files[i].getAbsolutePath());
//        }
        if (files[i].getName().equals("TempFile")) {
          System.out.println("Founded - " + files[i].getAbsolutePath());
        }
      }
    }

  }
}
