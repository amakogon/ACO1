package week7.day2.game;

import week7.day2.game.character.Warrior;
import week7.day2.game.weapon.Bow;
import week7.day2.game.weapon.Sword;

public class TestGame {
  public static void main(String[] args) {
    Warrior maximus = new Warrior("Maximus");
    Sword swordOfDestiny = new Sword(40, "SwordOfDesteny");

    maximus.setWeapon(swordOfDestiny);

    Warrior badWarrior = new Warrior("Drago");
    badWarrior.setWeapon(swordOfDestiny);

    maximus.attack(badWarrior);

    System.out.println(badWarrior);
    System.out.println(maximus);

//    maximus.setWeapon(new Bow(15, "Bow"));

    maximus.attack(badWarrior);

    System.out.println(badWarrior);
    System.out.println(maximus);


  }
}
