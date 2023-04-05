import components.Engine;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;
import type.ICE;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    ICE vehicle;
    Engine engine;
    Tyres tyres;

    @Before
    public void before(){
        customer = new Customer("Bob", 50);
        engine = new Engine("Mazda", 2.0, "Electric");
        tyres = new Tyres(18, "Winter", "Hankook");
        vehicle = new ICE(engine, tyres, "Red", 10);
        customer.addICE(vehicle);
    }

    @Test
    public void hasName(){
        assertEquals("Bob", customer.getName());
    }

    @Test
    public void hasVehicle(){
        assertEquals(1, customer.getVehicles());
    }

    @Test
    public void hasCash(){
        assertEquals(50, customer.getCash(), 0.5);
    }

    @Test
    public void canBuyCar(){
        customer.buyCar(vehicle);
        assertEquals(40, customer.getCash(), 0.5);
        assertEquals(2, customer.getVehicles());
    }
}
