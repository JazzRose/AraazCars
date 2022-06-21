package Transaction;

import Vehicles.Van;
import Vehicles.Vehicle;

import java.util.ArrayList;

public class Customer {

    private int wallet;
    private ArrayList<Vehicle>ownedVehicles;

    public Customer(int wallet, ArrayList<Vehicle> ownedVehicles) {
        this.wallet = wallet;
        this.ownedVehicles = ownedVehicles;
    }

    public int getWallet() {
        return wallet;
    }

    public void addToOwned(Vehicle vehicle) {
        ownedVehicles.add(vehicle);
    }

    public int getOwnedVehiclesAmount() {
        return ownedVehicles.size();
    }

    public void buyAVehicle(Vehicle vehicle){
        if (wallet> vehicle.getPrice())
            wallet -= vehicle.getPrice();
            ownedVehicles.add(vehicle);


    }
}
