package Sprint3.PengarTillbaka.InlämningsUppgift2;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class CheckMember {

    public boolean checkDateOverOneYear(Person p) {
        LocalDate today = LocalDate.now();
        Period pe = Period.between(p.getDate(), today);
        return pe.getYears() > 1 || pe.getYears() == 1 && pe.getDays() > 0;
    }

    public Person checkIfPersonIsInList(List<Person> list, String input) {
        for (Person person : list) {
            if (input.equals(person.getPersonNr()) || input.equals(person.getName())) {
                return person;
            }
        }
        return null;
    }

    public String outputMessage(Person p) {
        String member = "Kunden är en nuvarande medlem.";
        String exMember = "Kunden är en föredetta medlem.";
        String notMember = "Kunden har aldrig varit medlem och är oberörig.";
        if (p != null) {
            if (checkDateOverOneYear(p)) {
                return exMember;
            } else {
                return member;
            }
        } else {
            return notMember;
        }
    }


}


