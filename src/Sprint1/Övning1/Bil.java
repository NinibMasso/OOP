package Sprint1.Övning1;

public class Bil {
    private String regNr;
    private String modell;
    private String märke;

    Bilägare ägare;

    public Bil(String regNr, String modell, String märke){
        this.regNr = regNr;
        this.modell = modell;
        this.märke = märke;
    }
    public void ägsAv(Bilägare ägare){
        this.ägare = ägare;
    }
    public Bilägare getÄgare() {
        return ägare;
    }
    public void såld(){
        this.ägare = null;
    }
    public String getRegNr() {
        return regNr;
    }
    public String getModell() {
        return modell;
    }
    public String getMärke() {
        return märke;
    }
}
