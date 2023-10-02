package Sprint1.Inlämningsuppgift1;

public abstract class Växter implements LiquidPerDay {

    private final String namn; //inkapsulering
    private final double längd; //inkapsulering
    protected String sortsVätska; //inkapsulering
    protected double mängdVätska; //inkapsulering
    protected String sortsVäxt; //inkapsulering

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

    public String getSortsVäxt() {
        return sortsVäxt;
    }
    public double calculateLiquidPerDay(double längd) { //Polymorfism
        return 0;
    }
}
