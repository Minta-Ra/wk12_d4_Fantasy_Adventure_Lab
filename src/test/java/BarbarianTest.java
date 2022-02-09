import player.Barbarian;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BarbarianTest {

    Barbarian barbarian;

    @Before
    public void before(){
        barbarian = new Barbarian("Fredrick", 10);
    }

    @Test
    public void hasName(){
        assertEquals("Fredrick", barbarian.getName());
    }

    @Test
    public void hasHealth(){
        assertEquals(10, barbarian.getHealthPoints());
    }



}
