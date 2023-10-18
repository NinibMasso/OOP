package Sprint1.Inlämningsuppgift1;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class InlämningsUppgift1Main {

    InlämningsUppgift1Main() {
        List<Växter> allaVäxter = new ArrayList<>();
        allaVäxter.add(new Kaktusar("Igge", 0.2)); //Polymorfism
        allaVäxter.add(new Palmer("Laura", 5.0));
        allaVäxter.add(new KöttätandeVäxter("Meatloaf", 0.7));
        allaVäxter.add(new Palmer("Olof", 1.0));
        try {
            String userInput = JOptionPane.showInputDialog(null, "Vilken växt ska få vätska?");
            userInput = userInput.toLowerCase();
            Växter v = hittaVäxten(allaVäxter, userInput);
            visaMeddelande(v);
        } catch (NullPointerException e){
            JOptionPane.showMessageDialog(null, "Avbrutet, stänger ner programmet");
        }
    }

    public static void main(String[] args) {
        InlämningsUppgift1Main i = new InlämningsUppgift1Main();
    }

    public Växter hittaVäxten(List<Växter> allaVäxter, String input) {
        for (Växter v : allaVäxter) {
            String växtNamnLowerCase = v.getNamn().toLowerCase();
            if (växtNamnLowerCase.compareTo(input) == 0) {
                return v;
            }
        }
        return null;
    }

    public void visaMeddelande(Växter v) {
        if (v == null) {
            JOptionPane.showMessageDialog(null, "Namnet du angav finns inte på hotellet");
            System.exit(0);
        } else {
            double result = v.calculateLiquidPerDay(v.getLängd()); //Polymorfism
            JOptionPane.showMessageDialog(null, v.getSortsVäxt() + "en " + v.getNamn()
                    + " behöver: " + result + " liter " + v.getSortsVätska());
        }
    }
}
