package Sprint1.HederligeHarry;

public class BilAnnons extends FordonsAnnons{

    String färg;
    String sommarDäck = "J";
    String vinterDäck = "N";


    public BilAnnons(int pris, String rubrik, String beskrivning, int årsmodell, int antalMil) {
        super(pris, rubrik, beskrivning, årsmodell, antalMil);
    }
    @Override
    public void GetAnnonsText(){
        System.out.println("En grym " + rubrik + " Årsmodell: " + årsmodell + " Antal mil: " + antalMil +
                "Färg: " + färg + "Sommardäck(J/N): " + sommarDäck + "Vinterdäck(J/N): " + vinterDäck +
                "Pris: " + pris );
    }
}
