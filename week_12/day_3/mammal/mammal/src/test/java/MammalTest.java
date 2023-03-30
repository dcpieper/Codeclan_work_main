import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MammalTest {

    Mammal mammal;

    @Before
    public void before() {mammal = new Mammal();}

    @Test
    public void canBreathe(){
        assertEquals("Breathes", mammal.breathe());
    }

    @Test
    public void canEat(){
        assertEquals("Eats", mammal.eat());
    }

    @Test
    public void canTalk() {
        assertEquals("Alright mate you got any crack?", mammal.talk());
    }
}
