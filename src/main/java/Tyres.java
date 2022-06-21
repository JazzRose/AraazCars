public class Tyres extends Components{

    private int tread;
    private String make;

    public Tyres(int costOfPart, double damage, int tread, String make) {
        super(costOfPart, damage);
        this.tread = tread;
        this.make = make;
    }

    public Tyres(int costOfPart, double damage) {
        super(costOfPart, damage);

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
