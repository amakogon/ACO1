package week7.day2.game.character;

public abstract class AbstractCharacter {

  private int health = 100;
  private int armor;
  private String name;

  protected AbstractCharacter(String name) {
    this.name = name;
  }

  public int getHealth() {
    return health;
  }

  public void setHealth(int health) {
    this.health = health;
  }

  public abstract boolean attack(AbstractCharacter enemy);

  @Override
  public String toString() {
    return "{" +
      "health=" + health +
      ", name='" + name + '\'' +
      '}';
  }
}
