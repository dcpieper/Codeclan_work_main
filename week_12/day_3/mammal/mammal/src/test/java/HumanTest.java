import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HumanTest {

    Human human;

    @Before
    public void before(){human = new Human();}

    @Test
    public void canBreathe(){
        assertEquals("Breathes", human.breathe());
    }

    @Test
    public void canEat(){
        assertEquals("Eats", human.eat());
    }

    @Test
    public void canTalk() {
        assertEquals("Alright mate you got any crack?", human.talk());
    }

    @Test
    public void canWalk(){
        assertEquals("I'm walkin here!", human.walk());
    }
}
