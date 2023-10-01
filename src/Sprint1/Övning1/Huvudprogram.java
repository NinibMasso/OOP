package Sprint1.Övning1;

public class Huvudprogram {


    public Huvudprogram(){
        Bil bil1 = new Bil("TKL76M", "Tiguan", "Volkswagen");
        Bil bil2 = new Bil("XSO625", "XC90", "Volvo");
        Bilägare Namrod = new Bilägare("Namrod", "Ravinvägen", 32);
        Bilägare Rabi = new Bilägare("Rabi", "Enbygatan 13B", 40);
        bil1.ägsAv(Namrod);
        bil2.ägsAv(Rabi);
        printBil(bil1);
        printBil(bil2);
        bil1.såld();
        bil2.såld();
        printBil(bil1);
        printBil(bil2);
        bil1.ägsAv(Rabi);
        bil2.ägsAv(Namrod);
        printBil(bil1);
        printBil(bil2);

    }
    public static void main(String[] args) {
        Huvudprogram h = new Huvudprogram();

    }
    private void printBil(Bil bil){
        if (bil.getÄgare() == null){
            System.out.println("Bilen med regnr: " + bil.getRegNr() + " har ingen ägare");
        } else{
            System.out.println("Bilen med regnr: " + bil.getRegNr() + "\tModell: " + bil.getModell()
                    + "\tMärke: " + bil.getMärke() + "\n\t Ägs av: " + bil.getÄgare().getName() + "\tAdress: "
                    + bil.getÄgare().getAddress() + "\tÅlder: " + bil.getÄgare().getAge());
        }

    }
}

