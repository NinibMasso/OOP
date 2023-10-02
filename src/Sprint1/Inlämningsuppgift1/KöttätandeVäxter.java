package Sprint1.Inlämningsuppgift1;

public class KöttätandeVäxter extends Växter implements LiquidPerDay {

    public KöttätandeVäxter(String namn, double längd) {
        super(namn, längd);
        mängdVätska = 0.1;
        sortsVätska = "proteinvatten";
    }
    public double calculateLiquidPerDay(double längd) { //polymorfism
        mängdVätska = mängdVätska + (0.2 * längd);
        return mängdVätska;
    }

    /*public String getSortsVätska() {
        return sortsVätska;
    }

     */


}
