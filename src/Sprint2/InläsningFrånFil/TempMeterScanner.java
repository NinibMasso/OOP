package Sprint2.InläsningFrånFil;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TempMeterScanner {
    TempMeterScanner(){
        double högsta = -Double.MIN_VALUE;
        double lägsta = Double.MAX_VALUE;
        double sum = 0;
        int counter = 0;
        double temp;
        String tempLine1;
        try (Scanner sc = new Scanner(new File("src/Sprint2/InläsningFrånFil/temp.txt"))){
            while (sc.hasNextDouble()) {
                tempLine1 = sc.nextLine();
                tempLine1 = replaceKommaTecken(tempLine1);
                temp = Double.parseDouble(tempLine1);
                högsta = högstaTempMätaren(temp, högsta);
                lägsta = lägstaTempMätaren(temp, lägsta);
                counter++;
                sum = sum + temp;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        double medelvärde = (sum /counter);
        System.out.println("Högsta temp: " + högsta);
        System.out.println("Lägsta temp: " + lägsta);
        System.out.println("Medelvärde temp: " + medelvärde);
    }
    public String replaceKommaTecken(String tempLine){
        tempLine = tempLine.replace(",", ".");
        return tempLine;
    }

    public double högstaTempMätaren(double temp, double högsta) {
        if (temp > högsta) högsta = temp;
        return högsta;
    }

    public double lägstaTempMätaren(double temp, double lägsta) {
        if (temp < lägsta) lägsta = temp;
        return lägsta;

    }

    public static void main(String[] args) {
        TempMeterScanner tv = new TempMeterScanner();
    }


}

