package Sprint2.VäxelTillbaka;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Växeltillbaka {

    public Växeltillbaka() {
        int[] lista = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        Scanner sc = new Scanner(System.in);
        int pris = 0;
        int belopp = 0;
        int[] antal = new int[10];
        try {
            System.out.println("Ange pris du ska betala: ");
            pris = sc.nextInt();
            System.out.println("Ange belopp du betalar med: ");
            belopp = sc.nextInt();
            antal = beräknaValörer(lista, beräknaVäxel(pris, belopp));
            printMetod(lista, antal, beräknaVäxel(pris, belopp));
        }catch(InputMismatchException e){
            e.printStackTrace();
            System.out.println("Skriv in hela siffror");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Växeltillbaka h = new Växeltillbaka();
    }
    public int beräknaVäxel(int pris, int belopp) {
        return belopp - pris;
    }
    public int[] beräknaValörer(int[] lista, int växel) {
        int[] antal = new int[10];
        for (int i = 0; växel > 0; i++) {
            for (int j = 0; växel > 0; j++) {
                if (växel >= lista[i]) {
                    antal[i]++;
                    växel = växel - lista[i];
                }
            }
        }
        return antal;
    }

    public boolean jämnaPengar(int växel) {
        if (växel == 0) {
            return true;
        }else {
            return false;
        }
    }

    public boolean förLitePengar(int växel) {
        if (växel < 0) {
            return true;
        }else {
            return false;
        }
    }

    public void printMetod(int[] lista, int[] antal, int växel) {
        StringBuilder sb = new StringBuilder();
        if (förLitePengar(växel)){
            System.out.println("Du lämnade för lite pengar");
            return;
        }
        if (jämnaPengar(växel)){
            System.out.println("Det blev ingen växel");
            return;
        }
        for (int i = 0; i < lista.length; i++) {
            if (antal[i] == 0) {

            } else if (lista[i] < 20) {
                sb.append("Antal ").append(lista[i]).append("-kronor: ").append(antal[i] + "\n");
            } else {
                sb.append("Antal ").append(lista[i]).append("-lappar: ").append(antal[i] + "\n");
            }
        }
        System.out.println(sb);
    }
}
