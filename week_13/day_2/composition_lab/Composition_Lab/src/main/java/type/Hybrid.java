package type;

import behaviours.IDrive;
import components.Engine;
import components.Tyres;

public class Hybrid extends Vehicle implements IDrive {
    public Hybrid(Engine engine, Tyres tyres, String colour, double price) {
        super(engine, tyres, colour, price);
    }
    public String drive() {
        return "Doing my bit for the environment.";
    }
}
