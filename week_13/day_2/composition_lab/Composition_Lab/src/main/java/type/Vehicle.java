package type;

import components.Engine;
import components.Tyres;

public abstract class Vehicle {

    Engine engine;
    Tyres tyres;

    private String colour;
    private static double price;

    public Vehicle(Engine engine, Tyres tyres, String colour, double price){
        this.engine = engine;
        this.tyres = tyres;
        this.colour = colour;
        this.price = price;
    }

    public static double getPrice() {
        return price;
    }
}
