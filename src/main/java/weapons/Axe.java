package weapons;

import enemy.Enemy;

public class Axe implements IWeapon {

    private IWeapon weapon;
    private int damage;

    public Axe(IWeapon weapon, int damage){

        this.weapon = weapon;
        this.damage = damage;
    }


    @Override
    public void attack(Enemy enemy) {
        enemy.takeDamage(damage);
    }
}
