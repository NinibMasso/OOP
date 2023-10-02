package Sprint1.Inlämningsuppgift1;

public class Kaktusar extends Växter implements LiquidPerDay {

    public Kaktusar(String namn, double längd) {
        super(namn, längd);
        mängdVätska = 0.02;
        sortsVätska = Vätskesort.MINERALVATTEN.vätskeSort;
        sortsVäxt = Växttyp.KAKTUS.växtTyp;
    }

    @Override
    public double calculateLiquidPerDay(double längd) { //polymorfism
        return mängdVätska;
    }
}
