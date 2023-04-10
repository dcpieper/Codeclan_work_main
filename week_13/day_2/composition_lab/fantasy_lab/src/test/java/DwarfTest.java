import org.junit.Before;
import org.junit.Test;
import players.Dwarf;
import weapons.Club;

import static org.junit.Assert.assertEquals;

public class DwarfTest {
    Dwarf dwarf;
    Club club;

    @Before
    public void before(){
        club = new Club();
        dwarf = new Dwarf("Steve", 100, club);
    }

    @Test
    public void hasAttack(){
        assertEquals("Smashy smash!", club.attack());

    }

    @Test
    public void doesDamage(){
        assertEquals(10, club.damage());
    }
}
