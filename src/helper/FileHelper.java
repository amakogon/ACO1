package helper;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * Created by amakogon on 01.04.15.
 */
public class FileHelper {

  public static boolean writeToFile(String filePath, String message) throws IOException {
    return writeToFile(new File(filePath), message);
  }

  public static boolean writeToFile(File file, String message) throws IOException {
    BufferedWriter writer =
      new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true)));
    try {
      writer.newLine();
      writer.write(message);
    } finally {
      writer.close();
    }
    return true;
  }
}
