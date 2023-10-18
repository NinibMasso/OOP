package Sprint2.InlämningsUppgift2;

import java.io.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class FileManagement {

    private final String readFilePath = "src/Sprint2/InlämningsUppgift2/GymRegister";
    private final String writeFilePath = "src/Sprint2/InlämningsUppgift2/TrackHurOfta";

    public List<Person> generateListFromFile(String filePath) {
        String tempLine1;
        String tempLine2;
        List<Person> list = new ArrayList<>();
        try (BufferedReader bf = new BufferedReader(
                new FileReader(readFilePath))) {
            while ((tempLine1 = bf.readLine()) != null) {

                String[] parts = tempLine1.split(",");
                String personNr = parts[0].trim();
                String name = parts[1].trim();

                tempLine2 = bf.readLine();
                LocalDate date = LocalDate.parse(tempLine2);
                list.add(new Person(personNr, name, date));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found exception");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("IO Exception");
            e.printStackTrace();
        }
        return list;
    }

    public void printToFile(String filePath, Person person) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd, HH:mm:ss");
        LocalDateTime today = LocalDateTime.now();
        CheckMember lu = new CheckMember();
        try (PrintWriter writer = new PrintWriter(
                new FileWriter(filePath, true))) {
            if (lu.outputMessage(person).equals("Kunden är en nuvarande medlem.")) {
                writer.println(person.getName() + ", " + person.getPersonNr() + ", " + df.format(today));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Det gick inte att hitta filen.");
            e.printStackTrace();
        } catch (SecurityException e) {
            System.out.println("Tillräckliga behörigheter finns inte för att utföra filåtgärden");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Det gick inte att skriva till filen");
            e.printStackTrace();
        }
    }

    public String getWriteFilePath() {
        return writeFilePath;
    }

    public String getReadFilePath() {
        return readFilePath;
    }
}
