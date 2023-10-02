package Sprint1.Inlämningsuppgift1;

public class Palmer extends Växter implements LiquidPerDay {

    public Palmer(String namn, double längd) {
        super(namn, längd);
        mängdVätska = 0.5;
        sortsVätska = "kranvatten";
    }
    public double calculateLiquidPerDay(double längd) { //polymorfism
        mängdVätska = mängdVätska * längd;
        return mängdVätska;
    }

    /*public String getSortsVätska() {
        return sortsVätska;
    }

     */


}
