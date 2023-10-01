package Sprint1.ArvochArrayer;

import java.util.ArrayList;

public class Kurs{
    protected String kursNamn;
    protected Lärare lärare;
    protected ArrayList<Student> programLista = new ArrayList<>();

    public Kurs(String kurs) {
        this.kursNamn = kurs;
        ArrayList<Student> programLista =  new ArrayList<>();
    }

    public Kurs() {}


    public Lärare getLärare() {
        return lärare;
    }

    public void setLärare(Lärare lärare) {
        this.lärare = lärare;
    }

    public String getKursNamn() {
        return kursNamn;
    }

    public void setKursNamn(String kursNamn) {
        this.kursNamn = kursNamn;
    }
}
