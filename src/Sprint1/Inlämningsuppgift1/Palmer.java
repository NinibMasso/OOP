package Sprint1.Inlämningsuppgift1;

public class Palmer extends Växter implements LiquidPerDay {

    public Palmer(String namn, double längd) {
        super(namn, längd);
        mängdVätska = 0.5;
        sortsVätska = "kranvatten";
    }
    public double calculateLiquidPerDay(double längd) { //polymorfism
        double vatten = mängdVätska * längd;
        return vatten;
    }

    public String getSortsVätska() {
        return sortsVätska;
    }


}
