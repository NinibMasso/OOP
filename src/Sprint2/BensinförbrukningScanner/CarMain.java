package Sprint2.BensinförbrukningScanner;

import java.util.Scanner;

public class CarMain {

    CarMain(){
        Car car = new Car();
        Scanner sc = new Scanner(System.in);

        System.out.print("Skriv in dagens mätarställning: ");
        car.setAntalMilIdag(sc.nextInt());
        System.out.print("Skriv in mätarställning för ett år sedan: ");
        car.setAntalMilEttÅrSedan(sc.nextInt());
        System.out.print("Skriv in hur mycket bensin som förbrukats under året: ");
        car.setAntalLiterBensin(sc.nextInt());
        System.out.println("Antal körda mil: " + car.beräknaMil());
        System.out.println("Antal liter bensin: " + car.getAntalLiterBensin());
        System.out.println("Förbrukning per mil: " + car.beräknaFörbrukning());

    }
    public static void main(String[] args) {
        CarMain c = new CarMain();
    }
}
