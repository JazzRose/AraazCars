package Transaction;

import Vehicles.Car;
import Vehicles.Motorbike;
import Vehicles.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private ArrayList<Vehicle> stock;
    private double till;

    public Dealership(double till, ArrayList stock) {
        this.stock = new ArrayList<>();
        this.till = till;
    }


    public ArrayList<Vehicle> getStock() {
        return stock;
    }

    public void addToStock(Vehicle vehicle) {
        stock.add(vehicle);
    }

    public void removeFromStock(Vehicle vehicle) {
        stock.remove(vehicle);
    }

    public double getTill() {
        return till;
    }

    public void setTill(double till) {
        this.till = till;
    }


    public int getStockLevel() {
        return this.stock.size();
    }

    public void buyAVehicle(Vehicle vehicle) {
        if (till> vehicle.getPrice())
            till -= vehicle.getPrice();
            stock.add(vehicle);
    }

    public void addToTill(Vehicle vehicle){
        till += vehicle.getPrice();
    }

    public void sellAVehicle(Vehicle vehicle) {
        removeFromStock(vehicle);
        addToTill(vehicle);
    }
}
