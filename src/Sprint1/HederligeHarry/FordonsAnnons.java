package Sprint1.HederligeHarry;

public abstract class FordonsAnnons {

    int pris;
    String rubrik;
    String beskrivning;
    int årsmodell;
    int antalMil;

    public FordonsAnnons(int pris, String rubrik, String beskrivning, int årsmodell, int antalMil) {
        this.pris = pris;
        this.rubrik = rubrik;
        this.beskrivning = beskrivning;
        this.årsmodell = årsmodell;
        this.antalMil = antalMil;
    }
    public void GetAnnonsText(){
        System.out.println("En grym " + rubrik + " Årsmodell: " + årsmodell + " Antal mil: " + antalMil +
                "Pris: " + pris );
    }
}
