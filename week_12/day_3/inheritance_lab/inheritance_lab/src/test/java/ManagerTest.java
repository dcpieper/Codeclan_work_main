import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Bob", "JT8934792B", 30000, "HR");
    }

    @Test
    public void hasName(){
        assertEquals("Bob", manager.getName());
    }

    @Test
    public void hasNI(){
        assertEquals("JT8934792B", manager.getNi());
    }

    @Test
    public void hasSalary(){
        assertEquals(30000, manager.getSalary(), 0.1);
    }

    @Test
    public void hasDeptName(){
        assertEquals("HR", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary();
        assertEquals(30100, manager.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus(){
        assertEquals(300, manager.payBonus(), 0.1);
    }


}
