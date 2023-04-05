import components.Engine;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;
import type.ICE;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    ICE vehicle;
    Engine engine;
    Tyres tyres;

    @Before
    public void before(){
        dealership = new Dealership("Bill's Cars", 50);
        engine = new Engine("BMW", 3.0, "Petrol");
        tyres = new Tyres(17, "All-Season", "Dunlop");
        vehicle = new ICE(engine, tyres, "Red", 10);
        dealership.addICE(vehicle);
    }
    @Test
    public void hasName(){
        assertEquals("Bill's Cars", dealership.getName());
    }

    @Test
    public void hasVehicle(){
        assertEquals(1, dealership.getVehicles());
    }

    @Test
    public void hasTill(){
        assertEquals(50, dealership.getTill(), 0.5);
    }
    @Test
    public void canBuyCar(){
        dealership.buyCar(vehicle);
        assertEquals(40, dealership.getTill(), 0.5);
        assertEquals(2, dealership.getVehicles());
    }
}
