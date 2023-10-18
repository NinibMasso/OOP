package Sprint2.Serialisering;

  abstract class Fordon {

    private double hastighet;
    private double vikt;

    public Fordon(double hastighet, double vikt) {
        this.hastighet = hastighet;
        this.vikt = vikt;
    }
    public Fordon(){}

    public void setHastighet(double hastighet) {
        this.hastighet = hastighet;
    }

    public double getHastighet() {
        return hastighet;
    }

    public double getVikt() {
        return vikt;
    }
    abstract public void printMe();
}
