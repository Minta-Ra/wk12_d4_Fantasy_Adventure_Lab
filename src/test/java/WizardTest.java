import enemy.Enemy;
import enemy.Orc;
import magic.Fireball;
import magic.ISpell;
import org.junit.Before;
import org.junit.Test;
import player.Wizard;

import static org.junit.Assert.assertEquals;


public class WizardTest {

    Wizard wizard;
    Enemy enemy;
    ISpell spell;

    @Before
    public void before(){
        spell = new Fireball();
        enemy = new Orc(10);
        wizard = new Wizard("Harry", 10, spell);
    }

    @Test
    public void canCast(){
        wizard.cast(enemy);
        assertEquals(7, enemy.getHealthPoints());
    }

}
