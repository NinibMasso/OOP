package Sprint1.HederligeHarry;

public class HusvagnsAnnons extends FordonsAnnons{

    String dusch = "J";
    int antalBäddar;

    public HusvagnsAnnons(int pris, String rubrik, String beskrivning, int årsmodell, int antalMil) {
        super(pris, rubrik, beskrivning, årsmodell, antalMil);
    }
    @Override
    public void GetAnnonsText(){
        System.out.println("En grym " + rubrik + " Årsmodell: " + årsmodell + " Antal mil: " + antalMil +
                "Antalbäddar: " + antalBäddar + "Dusch: " + dusch + "Vinterdäck(J/N): " + "Pris: " + pris );
    }
}
