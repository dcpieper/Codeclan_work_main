import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {
    private BusStop busstop;
    private Person person;

    @Before
    public void before(){
        busstop = new BusStop();
        person = new Person();
    }

    @Test
    public void canAddPerson(){
        busstop.addPerson(person);
        assertEquals(1, busstop.queueCount());
    }

    @Test
    public void canGetPerson(){
        busstop.addPerson(person);
        busstop.removePerson();
        assertEquals(0, busstop.queueCount());

    }

}
