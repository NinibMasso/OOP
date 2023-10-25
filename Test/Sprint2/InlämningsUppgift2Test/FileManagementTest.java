package Sprint2.InlämningsUppgift2Test;

import Sprint3.PengarTillbaka.InlämningsUppgift2.FileManagement;
import Sprint3.PengarTillbaka.InlämningsUppgift2.Person;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FileManagementTest {
    private final String readFilePathTest = "Test/Sprint2/InlämningsUppgift2Test/GymRegisterTest.txt";
    private final String writeFilePathTest = "Test/Sprint2/InlämningsUppgift2Test/TrackHurOfta";
    FileManagement fm = new FileManagement();
    List<Person> list = fm.generateListFromFile(readFilePathTest);

    @Test
    public final void generateListFromFileTest() {
        LocalDate expectedDate = LocalDate.parse("2023-07-01");
        assertEquals(14, list.size());
        assertNotEquals(12, list.size());
        assertEquals("7703021234", list.get(0).getPersonNr());
        assertNotEquals("12345632", list.get(0).getPersonNr());
        assertEquals("Alhambra Aromes", list.get(0).getName());
        assertNotEquals("Hejsvejs", list.get(0).getName());
        assertEquals("Bear Belle", list.get(1).getName());
        assertNotEquals("Ninib", list.get(2).getName());
        assertEquals(list.get(0).getDate(), expectedDate);
    }

    @Test
    public final void printToFileTest() {
        fm.printToFile(writeFilePathTest, list.get(0));
        try (BufferedReader bf = new BufferedReader(new FileReader(writeFilePathTest))) {
            DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd, HH:mm:ss");
            LocalDateTime today = LocalDateTime.now();
            String expectedLine = "Alhambra Aromes, 7703021234, " + df.format(today);
            String currentLine = "";
            String actualLine = "";
            while ((currentLine = bf.readLine()) != null) {
                actualLine = currentLine;
            }
            assertEquals(expectedLine, actualLine);
        } catch (IOException e) {
            System.out.println("IO Exception");
            e.printStackTrace();
        }
    }
}
