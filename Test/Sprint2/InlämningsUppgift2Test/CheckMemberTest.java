package Sprint2.InlämningsUppgift2Test;

import Sprint3.PengarTillbaka.InlämningsUppgift2.FileManagement;
import Sprint3.PengarTillbaka.InlämningsUppgift2.CheckMember;
import Sprint3.PengarTillbaka.InlämningsUppgift2.Person;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CheckMemberTest {
    CheckMember lu = new CheckMember();

    @Test
    public final void checkDateOverOneYearTest() {
        LocalDate date1 = LocalDate.parse("2022-10-15");
        LocalDate date2 = LocalDate.parse("2023-09-01");
        Person p = new Person("9402081013", "Ninib", date1);
        Person pfalse = new Person("9402081013", "Harry", date2);
        assertTrue(lu.checkDateOverOneYear(p));
        assertFalse(lu.checkDateOverOneYear(pfalse));
    }

    @Test
    public final void checkIfPersonIsInListTest() {
        FileManagement f = new FileManagement();
        List<Person> list = f.generateListFromFile(f.getReadFilePath());
        String input1 = "Alhambra Aromes";
        String input2 = "8204021234";
        Person p1 = lu.checkIfPersonIsInList(list, input1);
        Person p2 = lu.checkIfPersonIsInList(list, input2);
        assertEquals(input1, p1.getName());
        assertEquals(input2, p2.getPersonNr());
    }

    @Test
    public final void outputMessageTest() {
        FileManagement f = new FileManagement();
        List<Person> list = f.generateListFromFile(f.getReadFilePath());
        Person nullPerson = null;
        assertEquals(lu.outputMessage(list.get(0)), "Kunden är en nuvarande medlem.");
        assertEquals(lu.outputMessage(list.get(1)), "Kunden är en föredetta medlem.");
        assertEquals(lu.outputMessage(nullPerson), "Kunden har aldrig varit medlem och är oberörig.");
    }
}