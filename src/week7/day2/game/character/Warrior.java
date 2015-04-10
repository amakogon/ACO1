package week7.day2.game.character;

import week7.day2.game.weapon.MeeleWeapon;

public class Warrior extends AbstractCharacter {
  private MeeleWeapon weapon;

  public Warrior(String name) {
    super(name);
  }

  @Override
  public boolean attack(AbstractCharacter enemy) {
    System.out.println(this + " attacks " + enemy);
    enemy.setHealth(enemy.getHealth() - weapon.doDamage());
    return true;
  }

  public MeeleWeapon getWeapon() {
    return weapon;
  }

  public void setWeapon(MeeleWeapon weapon) {

    this.weapon = weapon;
  }

  @Override
  public String toString() {
    return "Warrior" + super.toString();
  }
}
