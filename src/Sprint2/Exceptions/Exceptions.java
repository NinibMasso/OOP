package Sprint2.Exceptions;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Exceptions {
        public static void main (String[] arg) {
            String indata = showInputDialog
                    ("Ange antal dagar, pris per dag samt bilmodell");
            Scanner sc = new Scanner(indata);
            try {
                int antalDagar = sc.nextInt();
                double dagsPris = sc.nextDouble();
                String bil = sc.next();
                double totPris = dagsPris * antalDagar;
                String s = String.format("Totalt pris för %s: %.2f",
                        bil, totPris);
                showMessageDialog(null, s);
            }
            catch (InputMismatchException e){
                System.out.println("Du skrev inte in siffror.");
                e.printStackTrace();
            }
            catch (NoSuchElementException e){
                System.out.println("Du skrev inte in tillräckligt många parametrar");
                e.printStackTrace();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
}
