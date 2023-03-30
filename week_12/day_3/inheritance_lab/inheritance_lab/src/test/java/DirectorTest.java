import management.Director;
import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Bob", "JT8934792B", 30000, "HR", 100000000);
    }

    @Test
    public void hasName(){
        assertEquals("Bob", director.getName());
    }

    @Test
    public void hasNI(){
        assertEquals("JT8934792B", director.getNi());
    }

    @Test
    public void hasSalary(){
        assertEquals(30000, director.getSalary(), 0.1);
    }

    @Test
    public void hasDeptName(){
        assertEquals("HR", director.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        director.raiseSalary();
        assertEquals(30100, director.getSalary(), 0.1);
    }

    @Test
    public void canPayBonus(){
        assertEquals(300, director.payBonus(), 0.1);
    }

    @Test
    public void hasBudget(){
        assertEquals(100000000, director.getBudget(),0.1);
    }
}
