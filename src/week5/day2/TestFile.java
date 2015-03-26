package week5.day2;

import week4.day1.Dog;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/**
 * Created by amakogon on 26.03.15.
 */
public class TestFile {
  public static void main(String[] args) {
    File file = new File("/home/amakogon/TestIO");
    String hello = "Hello world";

    Dog dog = new Dog("Friend");

    Dog readedDog = null;
    String readed = "";
    ObjectOutputStream oos = null;
    try {
      OutputStream outputStream = new FileOutputStream(file);
      oos = new ObjectOutputStream(outputStream);
//      oos.writeObject(hello);
      oos.writeObject(dog);
      oos.flush();

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (oos != null) {
        try {
          oos.close();
        } catch (IOException e) {
          e.printStackTrace();
        }
      }
    }
    ObjectInputStream ois = null;
    try {
      InputStream inputStream = new FileInputStream(file);
       ois = new ObjectInputStream(inputStream);
//      readed = (String) ois.readObject();
        readedDog = (Dog) ois.readObject();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }finally {
      try {
        ois.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
    System.out.println(readed);
    System.out.println(readedDog);

  }
}
