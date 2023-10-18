package Sprint2.Serialisering;

public class Tåg extends Fordon implements Printable {
    private int antalVagnar;

    public Tåg(double hastighet, double vikt, int antalVagnar) {
        super(hastighet, vikt);
        this.antalVagnar = antalVagnar;
    }

    public Tåg(int antalVagnar) {}

    public int kopplaVagn(int antalVagnar){
        this.antalVagnar = antalVagnar + 1;
        return this.antalVagnar;
    }
    public void printMe(){
        System.out.println("Tåg med Hastighet: " + getHastighet() + "\tVikt: " + getVikt() + "\tAntalvagnar: " + antalVagnar);
    }
}
