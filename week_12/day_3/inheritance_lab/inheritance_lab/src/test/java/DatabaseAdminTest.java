import management.Manager;
import org.junit.Before;
import org.junit.Test;
import techstaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Bob", "JT8934792B", 30000);
    }

    @Test
    public void hasName(){
        assertEquals("Bob", databaseAdmin.getName());
    }

    @Test
    public void hasNI(){
        assertEquals("JT8934792B", databaseAdmin.getNi());
    }

    @Test
    public void hasSalary(){
        assertEquals(30000, databaseAdmin.getSalary(), 0.1);
    }

    @Test
    public void canRaiseSalary(){
        databaseAdmin.raiseSalary();
        assertEquals(30100, databaseAdmin.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus(){
        assertEquals(300, databaseAdmin.payBonus(), 0.1);
    }
}
