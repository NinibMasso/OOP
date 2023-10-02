package Sprint1.Inlämningsuppgift1;

import javax.swing.*;
import java.util.ArrayList;

public class InlämningsUppgift1Main {

    InlämningsUppgift1Main(){
        ArrayList<Växter> allaVäxter = new ArrayList<>();
        allaVäxter.add(new Kaktusar("Igge", 0.2));
        allaVäxter.add(new Palmer("Laura", 5.0));
        allaVäxter.add(new KöttätandeVäxter("Meatloaf", 0.7));
        allaVäxter.add(new Palmer("Olof", 1.0));

        String userInput = JOptionPane.showInputDialog(null,"Vilken växt ska få vätska?");
        Växter v = hittaVäxten(allaVäxter, userInput);
        visaMeddelande(v);
    }
    public static void main(String[] args) {
        InlämningsUppgift1Main i = new InlämningsUppgift1Main();
    }
    public Växter hittaVäxten(ArrayList<Växter> allaVäxter, String input){
        for (Växter v : allaVäxter) {
            if (v.getNamn().compareTo(input) == 0) {
                return v;
            }
        }
        return null;
    }
    public void visaMeddelande(Växter v){
        if (v == null){
            JOptionPane.showMessageDialog(null,"Namnet du angav finns inte på hotellet");
            System.exit(0);
        } else{
            double result = v.calculateLiquidPerDay(v.getLängd()); //Polymorfism
            JOptionPane.showMessageDialog(null, "Växten " + v.getNamn() + ", behöver:  "
                    + result + " liter " + v.getSortsVätska()); //Polymorfism
        }
    }
}
