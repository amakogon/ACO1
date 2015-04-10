package week7.day2.game.weapon;

public abstract class Weapon implements IWeapon{
  protected int damage;
  private String name;

  public void setDamage(int damage) {
    this.damage = damage;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Weapon(int damage, String name) {
    this.damage = damage;
    this.name = name;
  }
}
