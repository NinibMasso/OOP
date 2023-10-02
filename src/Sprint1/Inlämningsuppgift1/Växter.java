package Sprint1.Inlämningsuppgift1;

public class Växter implements LiquidPerDay{

    private String namn; //inkapsulering
    private double längd; //inkapsulering
    protected String sortsVätska; //inkapsulering
    protected double mängdVätska; //inkapsulering

    public Växter(String namn, double längd) {
        this.namn = namn;
        this.längd = längd;
    }
    public String getNamn() {
        return namn;
    }
    public double getLängd() {
        return längd;
    }
    public String getSortsVätska() {
        return sortsVätska;
    }
    public double calculateLiquidPerDay(double längd) { //Polymorfism
        return 0;
    }
}
