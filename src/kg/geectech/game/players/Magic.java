package kg.geectech.game.players;

import kg.geectech.game.general.RPG_GAME;

public class Magic extends Hero{
    public Magic(int health, int damage) {
        super(health, damage, SuperAbility.BOOST);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
            int boost = RPG_GAME.random.nextInt(50) + 1;
            this.setHealth(this.getHealth() + boost);
            boss.setHealth(boss.getHealth() - boost);
            System.out.println("The mage increased his attack [" + boost + "]");
        }
        }