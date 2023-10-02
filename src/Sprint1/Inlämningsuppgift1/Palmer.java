package Sprint1.Inlämningsuppgift1;

public class Palmer extends Växter implements LiquidPerDay {

    public Palmer(String namn, double längd) {
        super(namn, längd);
        mängdVätska = 0.5;
        sortsVätska = Vätskesort.KRANVATTEN.vätskeSort;
        sortsVäxt = Växttyp.PALM.växtTyp;

    }

    @Override
    public double calculateLiquidPerDay(double längd) { //polymorfism
        mängdVätska = mängdVätska * längd;
        return mängdVätska;
    }
}
