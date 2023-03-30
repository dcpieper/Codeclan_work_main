import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class PersonTest {

    Person person;

    @Before
    public void before(){
        person = new Person("Ash", "G35");
    }

    @Test
    public void hasName(){
        assertEquals("Ash", person.getName());
    }

    @Test
    public void hasCohort(){
        person.setCohort("G35");
        assertEquals("G35", person.getCohort());
    }

    @Test
    public void canChangeName(){
        person.setName("Ashley");
        assertEquals("Ashley", person.getName());
    }

    @Test
    public void canChangeCohort(){
        person.setCohort("G69");
        assertEquals("G69", person.getCohort());
    }

    @Test
    public void canTalk(){
        assertEquals("I love Java", person


                .talk("Java"));
    }
}
