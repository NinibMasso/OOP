package Sprint2.InlämningsUppgift2;

import java.util.List;
import java.util.Scanner;

public class BästaGymetMain {

    BästaGymetMain() {
        FileManagement fm = new FileManagement();
        CheckMember lu = new CheckMember();
        List<Person> list = fm.generateListFromFile(fm.getReadFilePath());
        Scanner scan = new Scanner(System.in);

        System.out.print("Skriv in kunds personnummer eller namn: ");
        String input = scan.nextLine().trim();

        Person p = lu.checkIfPersonIsInList(list, input);
        System.out.println(lu.outputMessage(p));
        fm.printToFile(fm.getWriteFilePath(), p);
    }

    public static void main(String[] args) {
        BästaGymetMain bgm = new BästaGymetMain();
    }
}
