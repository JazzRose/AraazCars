import Transaction.Customer;
import Vehicles.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    Car car;
    Motorbike motorbike;
    Van van;
    Engine engine;
    Tyres tyres;
    ArrayList ownedVehicles;
    Vehicle vehicle;

    @Before
    public void before(){
        car = new Car("Hyundai",60000,"Pink",2600,engine,tyres,5);
        motorbike = new Motorbike("Yamaha", 70000, "White", 200, engine, tyres, BikeClassification.SCOOTER);
        van = new Van("Caddy Maxi",65000,"White",7000,engine,tyres,"Long Wheel Base",4 );

        ownedVehicles  = new ArrayList<>();

        engine = new Engine("Electric",160);
        tyres = new Tyres(5,"Dunlop");

        customer = new Customer(10000, ownedVehicles);
    }

    @Test
    public void hasMoneyInWallet(){
        assertEquals(10000,customer.getWallet());
    }

    @Test
    public void hasStock(){
        customer.addToOwned(van);
        assertEquals(1,customer.getOwnedVehiclesAmount());

    }

    @Test
    public void customerCanBuyVehicle(){
        customer.buyAVehicle(van);
        assertEquals(3000,customer.getWallet());
        assertEquals(1,customer.getOwnedVehiclesAmount());
    }
}
