package Sprint1.ArvochArrayer;

import java.util.ArrayList;

public class Lärare extends Person {

    protected ArrayList<Kurs> kurser;
    public Lärare(String namn, int age) {
        super(namn, age);
    }

    public ArrayList<Kurs> getKurs() {
        return kurser;
    }

    public void setKurser(ArrayList<Kurs> kurs) {
        this.kurser = new ArrayList<>();
    }
}
