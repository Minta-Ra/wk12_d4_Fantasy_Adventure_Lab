package weapons;

import enemy.Enemy;

public class Axe implements IWeapon {

    private IWeapon weapon;
    private int damage;

    public Axe(IWeapon weapon){

        this.weapon = weapon;
        this.damage = 5;
    }


    @Override
    public void attack(Enemy enemy) {
        enemy.takeDamage(damage);
    }
}
