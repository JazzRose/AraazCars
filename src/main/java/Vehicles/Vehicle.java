package Vehicles;

public abstract class Vehicle {

    private String model;
    private int mileage;
    private String colour;
    private  int price;
    private Engine engine;
    private Tyres tyres;


    protected Vehicle(String model, int mileage, String colour, int price, Engine engine, Tyres tyres) {
        this.model = model;
        this.mileage = mileage;
        this.colour = colour;
        this.price = price;
        this.engine = engine;
        this.tyres = tyres;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
