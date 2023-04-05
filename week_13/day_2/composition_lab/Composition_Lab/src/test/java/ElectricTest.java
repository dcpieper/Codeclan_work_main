import components.Engine;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;
import type.Electric;
import type.Hybrid;

import static org.junit.Assert.assertEquals;

public class ElectricTest {

    Electric electric;
    Engine engine;
    Tyres tyres;

    @Before
    public void before(){
        engine = new Engine("Mazda", 2.0, "Electric");
        tyres = new Tyres(18, "Winter", "Hankook");
        electric = new Electric(engine, tyres, "Yellow", 10);
    }

    @Test
    public void canDrive(){
        assertEquals("I literally sniff my own farts.", electric.drive());
    }
}
