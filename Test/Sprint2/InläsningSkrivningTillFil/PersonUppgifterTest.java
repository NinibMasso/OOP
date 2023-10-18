package Sprint2.InläsningSkrivningTillFil;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonUppgifterTest {

    PersonUppgifter pu = new PersonUppgifter();

    @Test
    public void scanLengthTest() {
        List<String> list = pu.generateListFromFile("Test/Sprint2/InläsningSkrivningTillFil/Personuppgiftertest.txt");
        assertTrue(pu.getLengthList().get(0) == 175);
    }

    @Test
    public void genereateListFromFileTest() {
        List<String> list = pu.generateListFromFile(
                "Test/Sprint2/InläsningSkrivningTillFil/Personuppgiftertest.txt");
        assertTrue(list.size() == 8);
        assertFalse(list.size() == 9);
        assertTrue(list.get(0).startsWith("Kalle"));
        assertFalse(list.get(0).startsWith("Sune"));
        System.out.println(list.get(0));
    }
}
