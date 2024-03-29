import org.junit.Before;
import org.junit.Test;

import java.beans.beancontext.BeanContextEvent;

import static org.junit.Assert.assertEquals;

public class BearTest {

    Bear bear;

    @Before
    public void before(){
        bear = new Bear("Pablo Escobear", 25, 95.62, 'f');
    }

    @Test
    public void hasName() {
        assertEquals("Pablo Escobear", bear.getName());
    }

    @Test
    public void hasAge(){
        assertEquals(25, bear.getAge());
    }

    @Test
    public void hasWeight() {
                assertEquals(95.62, bear.getWeight(),0.0);
    }

    @Test
    public void readyToHibernateIfGreaterThan80() {
        assertEquals(true, bear.readyToHibernate());
    }

    @Test
    public void notReadyToHibernateIfLessThan80(){
        Bear bear = new Bear("Pablo Escobear", 25, 65.62, 'f');
        assertEquals (false, bear.readyToHibernate());
    }
}
