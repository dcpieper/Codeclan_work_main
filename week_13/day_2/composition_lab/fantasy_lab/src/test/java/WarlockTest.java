import Spells.Curse;
import behaviours.IDefend;
import org.junit.Before;
import players.Warlock;

public class WarlockTest {

    Warlock warlock;
    Curse curse;

    @Before
    public void before(){
        curse = new Curse();
        warlock = new Warlock("Steve", 50, , curse);
    }
}
