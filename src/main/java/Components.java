public abstract class Components {

    private int costOfPart;
    private double damage;

    public Components(int costOfPart, double damage) {
        this.costOfPart = costOfPart;
        this.damage = damage;
    }

    public int getCostOfPart() {
        return costOfPart;
    }

    public void setCostOfPart(int costOfPart) {
        this.costOfPart = costOfPart;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }
}
