package Sprint2.Serialisering;

public class Bil extends Fordon implements Printable, Hjulburen {
    private int antalVäxlar;
    private int växelJustNu;

    private int antalHjul = 4;

    public Bil(double hastighet, double vikt, int antalVäxlar, int växelJustNu) {
        super(hastighet, vikt);
        this.antalVäxlar = antalVäxlar;
        this.växelJustNu = växelJustNu;
    }

    public Bil(){}

    public void växla(int växelJustNu) {
        this.växelJustNu = växelJustNu;
    }
    public void printMe(){
        System.out.println("Bil med Hastighet: " + getHastighet() + "\tVikt: " + getVikt() + "\tAntalväxlar: "
        + antalVäxlar + "\tVäxel just nu: " + växelJustNu);
    }

    public int getAntalHjul(){
        return antalHjul;
    }


}
