package Sprint1.Övning1;

public class Main {
    public static void main(String[] args) {
        Bilägare Ninib = new Bilägare("Ninib", "Skogsgatan 3B", 29);
        Bilägare Hannan = new Bilägare("Hannan", "Skogsgatan 3B", 29);
        Bil bil1 = new Bil("TKL76M", "Tiguan", "Volkswagen");
        Bil bil2 = new Bil("PLS796", "Passat", "Volkswagen");

        bil1.ägsAv(Ninib);
        bil2.ägsAv(Hannan);
        printBil(bil1);
        printBil(bil2);

        bil1.såld();
        bil2.såld();
        printBil(bil1);
        printBil(bil2);

        bil1.ägsAv(Hannan);
        bil2.ägsAv(Ninib);
        printBil(bil1);
        printBil(bil2);
    }

    private static void printBil(Bil bil){
        if (bil.getÄgare() == null){
            System.out.println("Bilen med regnr: " + bil.getRegNr() + " har ingen ägare");
        } else{
            System.out.println("Bilen med regnr: " + bil.getRegNr() + "\tModell: " + bil.getModell()
            + "\tMärke: " + bil.getMärke() + "\n\t Ägs av: " + bil.getÄgare().getName());
        }

    }
}