package week6.day2;

public class MySingletone{

  private static MySingletone instance = null;

  private static int someField;

  private MySingletone(){
    System.out.println("in constructor");
  }

  public static MySingletone getInstance() {
    if (instance == null) {
      instance = new MySingletone();
    }
    return instance;
  }

  public static int getSomeField() {
    return someField;
  }
}
