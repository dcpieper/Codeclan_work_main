import org.junit.Before;
import org.junit.Test;
import techstaff.DatabaseAdmin;
import techstaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Bob", "JT8934792B", 30000);
    }

    @Test
    public void hasName(){
        assertEquals("Bob", developer.getName());
    }

    @Test
    public void hasNI(){
        assertEquals("JT8934792B", developer.getNi());
    }

    @Test
    public void hasSalary(){
        assertEquals(30000, developer.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary(){
        developer.raiseSalary();
        assertEquals(30100, developer.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus(){
        assertEquals(300, developer.payBonus(), 0.1);
    }
}
