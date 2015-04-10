package week7.day2.game.weapon;

public class Bow extends Weapon implements RangeWeapon{

  public Bow(int damage, String name) {
    super(damage, name);
  }

  @Override
  public int doDamage() {
    return damage;
  }
}
