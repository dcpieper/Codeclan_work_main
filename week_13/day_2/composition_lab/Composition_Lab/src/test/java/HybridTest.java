import components.Engine;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;
import type.Hybrid;
import type.ICE;

import static org.junit.Assert.assertEquals;

public class HybridTest {

    Hybrid hybrid;
    Engine engine;
    Tyres tyres;

    @Before
    public void before(){
        engine = new Engine("Honda", 2.0, "Petrol");
        tyres = new Tyres(16, "Summer", "Goodyear");
        hybrid = new Hybrid(engine, tyres, "Green", 10);
    }

    @Test
    public void canDrive(){
        assertEquals("Doing my bit for the environment.", hybrid.drive());
    }
}
