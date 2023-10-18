package Sprint2.Härmapa;

import java.util.Scanner;

public class Härmapa {

    Härmapa(){
        Scanner sc = new Scanner(System.in);
        while   (true) {
            System.out.print("Skriv in en mening: ");
            String s = sc.nextLine();
            System.out.println("Du skrev: " + s);
        }
    }

    public static void main(String[] args) {
        Härmapa h = new Härmapa();
    }
}
