import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;
    private BusStop busstop;

    @Before
    public void before(){
        bus = new Bus("Yoker", 50);
        person = new Person();
        busstop = new BusStop();
        busstop.addPerson(person);
    }
    @Test
    public void busStartsEmpty(){
        assertEquals(0, bus.personCount());
    }
    @Test public void canAddPerson(){
        bus = new Bus("Yoker", 3);
        bus.collectPersonFromBusStop(busstop);
        assertEquals(0, busstop.queueCount());
    }
    @Test public void canRemovePerson(){
        bus.pickUpPerson(person);
        bus.dropOffPerson(person);
        assertEquals(0, bus.personCount());
    }

}
