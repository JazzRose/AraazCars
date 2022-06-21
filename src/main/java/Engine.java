public class Engine extends Components{

    private String type;
    private int horsePower;


    public Engine(int costOfPart, double damage, String type, int horsePower) {
        super(costOfPart, damage);
        this.type = type;
        this.horsePower = horsePower;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }
}
