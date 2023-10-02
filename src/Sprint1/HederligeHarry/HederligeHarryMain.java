package Sprint1.HederligeHarry;

public class HederligeHarryMain {

    HederligeHarryMain(){
        FordonsAnnons bilAnnons = new BilAnnons(249000, "Grym Volvo XC90", "Mhejabfemoch",
                2019, 1000);
        FordonsAnnons husvagnsAnnons = new HusvagnsAnnons(500000, "Husvagn", "Ren Husvagn till salu",
                2019, 500);
        FordonsAnnons motorCykelAnnons = new MotorCykelAnnons(150000, "Motorcykel till salu",
                "Harley Davidson", 2023, 4000);
        bilAnnons.GetAnnonsText();
        System.out.println();
        husvagnsAnnons.GetAnnonsText();
        System.out.println();
        motorCykelAnnons.GetAnnonsText();
    }





    public static void main(String[] args) {
        HederligeHarryMain h = new HederligeHarryMain();

    }
}
