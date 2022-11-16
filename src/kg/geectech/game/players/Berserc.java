package kg.geectech.game.players;

import kg.geectech.game.general.RPG_GAME;

public class Berserc extends Hero {
    public Berserc(int health, int damage) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    public void applySuperPower(Boss boss, Hero[] heroes) {
        int saveDamageAndRevert = RPG_GAME.random.nextInt(50) + 1;
        this.setHealth(this.getHealth() + saveDamageAndRevert);
        boss.setHealth(boss.getHealth() - saveDamageAndRevert);
        System.out.println("Berserk engulfed: [" + saveDamageAndRevert + "] damage");

}
}
