import static org.junit.Assert.*;
import org.junit.*;
import wizard_management.beasts.Dragon;
import wizard_management.carpets.MagicCarpet;
import wizard_management.cleaning.Broomstick;
import wizard_management.people.Wizard;
import wizard_management.*;


public class WizardTest {

    Wizard wizard;
    Broomstick broomstick;

    @Before
    public void before() {
        broomstick = new Broomstick("Nimbus", 10);
        wizard = new Wizard("Toby", broomstick);
    }

    @Test
    public void hasName() {
        assertEquals("Toby", wizard.getName());
    }

    @Test
    public void hasBroomstick() {
        Broomstick ride = (Broomstick) wizard.getRide();
        assertEquals("Nimbus", ride.getBrand());
    }

    @Test
    public void canFly() {
        assertEquals(wizard.fly(), "mounting broom, running, skipping, flying!");
    }

    @Test
    public void canFlyDragon() {
        Dragon dragon = new Dragon("Dragonite");
        wizard = new Wizard("Toby", dragon);
        {
            assertEquals("Standing up tall, beating wings, lift off!", wizard.fly());
        }
    }

    @Test
    public void canFlyMagicCarpet() {
        MagicCarpet magicCarpet = new MagicCarpet("Purple");
        wizard = new Wizard("Big John", magicCarpet);
        {
            assertEquals("Hovering up, straightening out, flying off!", wizard.fly());
        }
    }

    @Test
    public void canSetRide(){
        Dragon dragon = new Dragon("Eric");
        wizard.setRide(dragon);
        assertEquals("Standing up tall, beating wings, lift off!", wizard.fly());
    }
}
