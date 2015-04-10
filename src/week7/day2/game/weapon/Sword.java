package week7.day2.game.weapon;

public class Sword extends Weapon implements MeeleWeapon{

  public Sword(int damage, String name) {
    super(damage, name);
  }

  @Override
  public int doDamage() {
    return damage;
  }
}
