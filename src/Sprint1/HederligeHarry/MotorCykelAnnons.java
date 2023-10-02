package Sprint1.HederligeHarry;

public class MotorCykelAnnons extends FordonsAnnons{
    int motorVolym;

    public MotorCykelAnnons(int pris, String rubrik, String beskrivning, int årsmodell, int antalMil) {
        super(pris, rubrik, beskrivning, årsmodell, antalMil);
    }
    @Override
    public void GetAnnonsText(){
        System.out.println("En grym " + rubrik + " Årsmodell: " + årsmodell + " Antal mil: " + antalMil +
                "Motor volym: " + motorVolym + " cm3 " + "Pris: " + pris );
    }
}
