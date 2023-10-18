package Sprint2.InlämningsUppgift2;

import java.time.LocalDate;

public class Person {

    private String personNr;
    private String name;
    private LocalDate date;

    public Person(String personNr, String name, LocalDate date) {
        this.personNr = personNr;
        this.name = name;
        this.date = date;
    }

    public Person(){}

    public String getPersonNr() {
        return personNr;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }
}
