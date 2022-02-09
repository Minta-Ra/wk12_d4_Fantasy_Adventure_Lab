package weapons;

import enemy.Enemy;

public class Axe implements IWeapon {

    private int damage;

    public Axe () {


        this.damage = 5;
    }


    @Override
    public void attack(Enemy enemy) {
        enemy.takeDamage(damage);
    }
}
