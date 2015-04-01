package week6.day1;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by amakogon on 01.04.15.
 */
public class Ex3 {
  public static void main(String[] args) throws IOException {
    Scanner sc = new Scanner(System.in);

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.valueOf(reader.readLine());
    System.out.println(a);

  }
}
