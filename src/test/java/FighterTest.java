import player.Fighter;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FighterTest {

    Fighter fighter;

    @Before
    public void before(){
        fighter = new Fighter("Fredrick", 10);
    }

    @Test
    public void hasName(){
        assertEquals("Fredrick", fighter.getName());
    }

    @Test
    public void hasHealth(){
        assertEquals(10,fighter.getHealthPoints());
    }



}
