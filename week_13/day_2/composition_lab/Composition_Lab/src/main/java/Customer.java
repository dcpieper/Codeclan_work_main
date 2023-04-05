import type.Electric;
import type.Hybrid;
import type.ICE;
import type.Vehicle;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Customer {

    private String name;
    private double cash;
    private ArrayList<Vehicle> vehicles;

    public Customer(String name, double cash){
        this.name = name;
        this.cash = cash;
        this.vehicles = new ArrayList<Vehicle>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public void addICE(ICE vehicle) { this.vehicles.add(vehicle);

    }
    public void addHybrid(Hybrid vehicle) { this.vehicles.add(vehicle);

    }
    public void addElectric(Electric vehicle) { this.vehicles.add(vehicle);

    }

    public int getVehicles() {
        return this.vehicles.size();
    }

    public void buyCar(Vehicle vehicle) {
        this.vehicles.add(vehicle);
        this.cash -= Vehicle.getPrice();
    }
}
