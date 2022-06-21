package Vehicles;

public class Motorbike extends Vehicle {

    private BikeClassification bikeClassification;

    public Motorbike(String model, int mileage, String colour, int price, Engine engine, Tyres tyres, BikeClassification bikeClassification) {
        super(model, mileage, colour, price, engine, tyres);
        this.bikeClassification = bikeClassification;
    }

    public BikeClassification getBikeClassification() {
        return bikeClassification;
    }

    public void setBikeClassification(BikeClassification bikeClassification) {
        this.bikeClassification = bikeClassification;
    }
}
