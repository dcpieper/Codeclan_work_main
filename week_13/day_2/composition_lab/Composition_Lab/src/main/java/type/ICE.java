package type;

import behaviours.IDrive;
import components.Engine;
import components.Tyres;

public class ICE extends Vehicle implements IDrive {
    public ICE(Engine engine, Tyres tyres, String colour, double price) {
        super(engine, tyres, colour, price);
    }
    public String drive() {
        return "Vroom vroom dirty fossil fuels.";
    }
}
