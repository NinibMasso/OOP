package Sprint2.Bensinförbrukning;

import javax.swing.*;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car();

        car.antalMilIdag = Double.parseDouble(JOptionPane.showInputDialog(null, "Dagens mätarställning: ").trim());
        car.antalMilEttÅrSedan = Double.parseDouble(JOptionPane.showInputDialog(null, "Mätarställning för ett år sedan: ").trim());
        car.antalLiterBensin = Double.parseDouble(JOptionPane.showInputDialog(null, "Bensin som förbrukats under året: ").trim());

        System.out.println("Antal körda mil: " + car.beräknaMil() + " mil");
        System.out.println("Antal liter bensin: " + car.getAntalLiterBensin() + " mil");
        System.out.println("Förbrukning per mil: " + car.beräknaFörbrukning() + " liter");
    }
}
