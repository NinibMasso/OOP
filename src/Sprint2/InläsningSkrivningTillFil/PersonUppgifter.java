package Sprint2.InläsningSkrivningTillFil;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PersonUppgifter {


    PersonUppgifter() {
        Person p = new Person();
        String filePath = "src/Sprint2/InläsningSkrivningTillFil/Personuppgifter.txt";
        getAndPrintPeopleOverTwoMeters();
        printToFile();
    }

    public void printToFile(){
        Person p = new Person();
        List <Person> personList = p.generateListFromFile("src/Sprint2/InläsningSkrivningTillFil/Personuppgifter.txt");
                try(PrintWriter writer = new PrintWriter(
                        new FileWriter("src/Sprint2/InläsningSkrivningTillFil/Personuppgifter3.txt"))){
                    for (Person person: personList){
                        if (person.getLength() > 200){
                            writer.println(person.getName() + ", " + person.getLength());
                }
            }
        }catch  (IOException e){
                    System.out.println("IOException");
                    e.printStackTrace();
                }
    }

    public List<String> generateListFromFile(String tempPath) {
        List<String> list = new ArrayList<>();
        String tempLine;
        try (BufferedReader bf = new BufferedReader(
                new FileReader(tempPath))) {
            while ((tempLine = bf.readLine()) != null) {
                tempLine = tempLine + " " + bf.readLine();
                list.add(tempLine);
            }
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFound Exception");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("IO Exception");
            e.printStackTrace();
        }
        return list;
    }

    public void getAndPrintPeopleOverTwoMeters() {
        List<String> list = generateListFromFile("src/Sprint2/InläsningSkrivningTillFil/Personuppgifter.txt");
        List<Integer> listHeight = getLengthList();
        String fileWrite = "src/Sprint2/InläsningSkrivningTillFil/Personuppgifter2.txt";
        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter(fileWrite))) {
            for (int i = 0; i < listHeight.size(); i++) {
                if (listHeight.get(i) >= 200) {
                    writer.write(list.get(i));
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            System.out.println("IOException");
            e.printStackTrace();
        }
    }

    public List<Integer> getLengthList() {
        List<String> list = generateListFromFile("src/Sprint2/InläsningSkrivningTillFil/Personuppgifter.txt");
        List<Integer> listHeight = new ArrayList<>();
        for (String s : list) {
            String height = s.substring(s.lastIndexOf(",") + 1).trim();
            listHeight.add(Integer.parseInt(height));
        }
        return listHeight;
    }

    public static void main(String[] args) {
        PersonUppgifter pu1 = new PersonUppgifter();
    }
}
