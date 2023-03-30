import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalTest {

    Animal animal;

    @Before
    public void before() {animal = new Animal();}

    @Test
    public void canBreathe(){
        assertEquals("Breathes", animal.breathe());
    }
    @Test
    public void canEat(){
        assertEquals("Eats", animal.eat());
    }
}
