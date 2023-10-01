package Sprint1.Fordon;

public class Cykel extends Fordon implements Printable, Hjulburen{
    private int antalVäxlar;
    private int växelJustNu;

    private int antalHjul = 2;

    public Cykel(double hastighet, double vikt, int antalVäxlar, int växelJustNu) {
        super(hastighet, vikt);
        this.antalVäxlar = antalVäxlar;
        this.växelJustNu = växelJustNu;
    }

    public Cykel() {
    }

    public void växla(int växelJustNu) {
        this.växelJustNu = växelJustNu;
    }
    public void printMe(){
        System.out.println("Cykel med Hastighet: " + getHastighet() + "\t\tVikt: " + getVikt() + "\tAntalVäxlar: "
        + antalVäxlar + "\tVäxel just nu: " + växelJustNu);
    }
    public int getAntalHjul(){
        return antalHjul;
    }


    public void printHjul(){
        System.out.println("Antal hjul: " + antalHjul);
    }
}
