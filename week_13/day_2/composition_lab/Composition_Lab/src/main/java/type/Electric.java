package type;

import behaviours.IDrive;
import components.Engine;
import components.Tyres;

public class Electric extends Vehicle implements IDrive {

    Vehicle vehicle;
    public Electric(Engine engine, Tyres tyres, String colour, double price) {
        super(engine, tyres, colour, price);
    }

    public String drive() {
        return "I literally sniff my own farts.";
    }
}
