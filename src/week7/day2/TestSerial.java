package week7.day2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestSerial {
  public static void main(String[] args) throws IOException, ClassNotFoundException {
    Human human = new Human("Oleg");
    human.setAge(15);

    File file = new File("/home/amakogon/TestHuman");
    file.createNewFile();

    FileOutputStream fileOutputStream = new FileOutputStream(file);
    ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);

    try {
//      outputStream.writeObject(human);
    } finally {
      outputStream.close();
    }


    FileInputStream fis = new FileInputStream(file);
    ObjectInputStream ois = new ObjectInputStream(fis);

    Human human2 = null;
    try {
      human2 = (Human)ois.readObject();
    } finally {
      ois.close();
    }

    System.out.println(human2);




  }
}
