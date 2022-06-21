import Transaction.Customer;
import Transaction.Dealership;
import Vehicles.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    Car car;
    Motorbike motorbike;
    Van van;
    Engine engine;
    Tyres tyres;
    ArrayList stock;
    Vehicle vehicle;
    Customer customer;
    ArrayList ownedVehicles;

    @Before
    public void before(){
        car = new Car("Hyundai",60000,"Pink",2600,engine,tyres,5);
        motorbike = new Motorbike("Yamaha", 70000, "White", 200, engine, tyres, BikeClassification.SCOOTER);
        van = new Van("Caddy Maxi",65000,"White",7000,engine,tyres,"Long Wheel Base",4 );
        customer = new Customer(10000,ownedVehicles);
        stock  = new ArrayList<>();

        engine = new Engine("Electric",160);
        tyres = new Tyres(5,"Dunlop");

        dealership = new Dealership(1000.00, stock);
    }

    @Test
    public void hasTill(){
        assertEquals(1000.00,dealership.getTill(),0.00);
    }

    @Test
    public void hasStock(){
        dealership.addToStock(van);
        assertEquals(1,dealership.getStockLevel());
    }

    @Test
    public void dealershipCanBuyVehicle(){
        dealership.buyAVehicle(motorbike);
        assertEquals(800,dealership.getTill(),0.00);
        assertEquals(1,dealership.getStockLevel());
    }

    @Test
    public void canSellToCustomer(){
        dealership.addToStock(van);
        dealership.addToStock(car);
        dealership.addToStock(motorbike);
        dealership.sellAVehicle(car);
        assertEquals(2,dealership.getStockLevel());
        assertEquals(3600,dealership.getTill(),0.00);
    }
}
