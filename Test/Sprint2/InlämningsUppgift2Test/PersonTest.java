package Sprint2.InlämningsUppgift2Test;

import Sprint3.PengarTillbaka.InlämningsUppgift2.Person;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    LocalDate date = LocalDate.of(2023, 10, 14);
    Person p = new Person("9402081013", "Ninib", date);

    @Test
    public final void getPersonNrTest() {
        assertEquals("9402081013", p.getPersonNr());
        assertNotEquals("123456789", p.getPersonNr());
    }

    @Test
    public final void getNameTest() {
        assertEquals("Ninib", p.getName());
        assertNotEquals("Harry", p.getName());
    }

    @Test
    public final void getDateTest() {
        LocalDate expectedDate = LocalDate.of(2023, 10, 14);
        LocalDate fakeDate = LocalDate.of(1004, 2, 23);
        assertEquals(p.getDate(), expectedDate);
        assertNotEquals(p.getDate(), fakeDate);
    }
}