package player;

import enemy.Enemy;
import magic.ISpell;

public abstract class Mage extends Player{

    private ISpell spell;

    public Mage(String name, int healthPoints, ISpell spell) {
        super(name, healthPoints);
        this.spell = spell;
    }

    public void cast(Enemy enemy){
        this.spell.cast(enemy);
    }

    public ISpell getSpell() {
        return spell;
    }
}
