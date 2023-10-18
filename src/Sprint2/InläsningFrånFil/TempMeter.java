package Sprint2.InläsningFrånFil;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TempMeter {

    TempMeter(){
        double högsta = Double.MIN_VALUE;
        double lägsta = Double.MAX_VALUE;
        double medelvärde = 0;
        int counter = 0;
        String tempLine;
        double temp;
        try (BufferedReader bf = new BufferedReader(
                new FileReader("src/Sprint2/InläsningFrånFil/temp.txt"))){
            while ((tempLine = bf.readLine()) != null){
                tempLine = replaceKommaTecken(tempLine);
                temp = Double.parseDouble(tempLine);
                högsta = högstaTemp(temp, högsta);
                lägsta = lägstaTemp(temp, lägsta);
                counter++;
                medelvärde = medelvärde + temp;
            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e ){
            System.out.println("IOException");
            e.printStackTrace();
        }
        System.out.println("Högsta temp: " + högsta);
        System.out.println("Lägsta temp: " + lägsta);
        System.out.println("Medelvärde temp: " + (medelvärde/counter));

    }
    public String replaceKommaTecken(String tempLine){
        tempLine = tempLine.replace(",", ".");
        return tempLine;
    }
    public double högstaTemp(double temp, double högsta){
        if (temp > högsta) högsta = temp;
        return högsta;
    }
    public double lägstaTemp(double temp, double lägsta){
        if (temp < lägsta) lägsta = temp;
        return lägsta;

    }

    public static void main(String[] args) {
        TempMeter tv = new TempMeter();
    }
}
