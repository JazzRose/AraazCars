package Vehicles;

public class Van extends Vehicle{

    private String wheelbase;
    private int storageCapacity;

    public Van(String model, int mileage, String colour, int price, Engine engine, Tyres tyres, String wheelbase, int storageCapacity) {
        super(model, mileage, colour, price, engine, tyres);
        this.wheelbase = wheelbase;
        this.storageCapacity = storageCapacity;
    }

    public String getWheelbase() {
        return wheelbase;
    }

    public void setWheelbase(String wheelbase) {
        this.wheelbase = wheelbase;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }
}
