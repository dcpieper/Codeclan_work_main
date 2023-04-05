import components.Engine;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;
import type.ICE;

import static org.junit.Assert.assertEquals;

public class ICETest {

    ICE ice;
    Engine engine;
    Tyres tyres;

    @Before
    public void before(){
        engine = new Engine("Toyota", 3.0, "Diesel");
        tyres = new Tyres(17, "All-Season", "Pirelli");
        ice = new ICE(engine, tyres, "Red", 10);
    }

    @Test
    public void canDrive(){
        assertEquals("Vroom vroom dirty fossil fuels.", ice.drive());
    }
}
