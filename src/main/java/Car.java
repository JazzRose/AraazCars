public class Car extends Vehicle{

    private int numberOfDoors;

    protected Car(String model, int mileage, String colour, int price, Engine engine, Tyres tyres, int numberOfDoors) {
        super(model, mileage, colour, price, engine, tyres);
        this.numberOfDoors = numberOfDoors;
    }


    public int getNumberOfDoors() {
        return numberOfDoors;
    }

}
