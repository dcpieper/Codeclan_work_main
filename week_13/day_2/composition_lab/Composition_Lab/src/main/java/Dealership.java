import type.Electric;
import type.Hybrid;
import type.ICE;
import type.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private String name;
    private double till;
    private ArrayList<Vehicle> vehicles;

    public Dealership(String name, double till ){
        this.name = name;
        this.till = till;
        this.vehicles = new ArrayList<Vehicle>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTill() {
        return till;
    }

    public void setTill(double till) {
        this.till = till;
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
        this.till -= Vehicle.getPrice();
    }
}
