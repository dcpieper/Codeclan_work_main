import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberListTest {
    private NumberList myNumbers;

    @Before
    public void before(){
        myNumbers = new NumberList();
    }

    @Test
    public void hasNumberOfEntries(){
        assertEquals(0, myNumbers.getNumberCount());
    }

    @Test
    public void canGetFirstNumber(){
        myNumbers.addNumber(100);
        assertEquals(100, myNumbers.getNumberAtIndex(0));
    }

    @Test
    public void canGetTotal(){
        myNumbers.addNumber(1);
        myNumbers.addNumber(2);
        myNumbers.addNumber(3);
        myNumbers.addNumber(4);
        assertEquals(10, myNumbers.getTotal());
    }
}
