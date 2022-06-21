package Vehicles;

public class Tyres{

    private int tread;
    private String make;

    public Tyres(int tread, String make) {

        this.tread = tread;
        this.make = make;
    }

    public int getTread() {
        return tread;
    }

    public void setTread(int tread) {
        this.tread = tread;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
}
