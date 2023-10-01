package Sprint1.ArvochArrayer;

import java.util.ArrayList;

public class ArvOchArrayerMain {
    ArvOchArrayerMain(){

        Student ninib = new Student("Ninib Masso", 29);
        Student hannan = new Student("Hannan Masso", 29);
        Student namrod = new Student("Namrod Masso", 32);
        Student erik = new Student("Erik Lagemark", 29);
        Student nikola = new Student("Nikola Pejic", 29);
        Student philipe = new Student("Philipe Melki", 18);
        Lärare malfono = new Lärare("Malfono Miakro", 55);
        Lärare malfono1 = new Lärare("Gabriel Afram", 44);
        Kurs javaKurs = new Kurs("Java Programmering");
        Kurs oOP = new Kurs("Objekt Orienterad Programmering");
        Kurs examensArbete = new Kurs("Examens Arbete");
        javaKurs.setLärare(malfono);
        oOP.setLärare(malfono1);

        Deltagande d1 = new Deltagande(ninib, javaKurs);
        Deltagande d2 = new Deltagande(hannan, javaKurs);
        Deltagande d3 = new Deltagande(namrod, javaKurs);
        Deltagande d4 = new Deltagande(namrod, oOP);
        Deltagande d5 = new Deltagande(hannan, oOP);
        Deltagande d6 = new Deltagande(ninib, oOP);

        ArrayList<Student> allaStudenter = new ArrayList<>();
        allaStudenter.add(ninib);
        allaStudenter.add(nikola);
        allaStudenter.add(erik);
        allaStudenter.add(hannan);
        allaStudenter.add(namrod);
        allaStudenter.add(philipe);
        ArrayList<Deltagande> deltagare = new ArrayList<>();
        deltagare.add(d1);
        deltagare.add(d2);
        deltagare.add(d3);
        deltagare.add(d4);
        deltagare.add(d5);
        deltagare.add(d6);

        //printStudent(ninib, deltagare);

        //printKurs(javaKurs, deltagare);
        System.out.println();
        //printKurs(oOP, deltagare);

        //printAllaStudenter(allaStudenter);
        printAllDeltagare(allaStudenter, deltagare);

    }
    public static void main(String[] args) {
        ArvOchArrayerMain a = new ArvOchArrayerMain();
    }

    public void printStudent(Student s, ArrayList<Deltagande> deltagande){
        System.out.println("Namn: " + s.getNamn() + "\tÅlder: " + s.getAge());
        System.out.print("Kurser: ");
        for (Deltagande d : deltagande) {
            if (d.getStudent() == s){
                System.out.print(d.getKurs().getKursNamn() + ", ");
            }
        }
    }

    public void printKurs(Kurs k, ArrayList<Deltagande> allaDeltagare){
        System.out.println("Kurs: " + k.getKursNamn());
        System.out.print("Deltagare: \n");
        for (Deltagande d : allaDeltagare){
            if (d.getKurs() == k){
                System.out.println(d.getStudent().getNamn());
            }
        }
    }

    public void printAllDeltagare(ArrayList<Student> allaStudenter, ArrayList<Deltagande> allaDeltagare){
        for (Student s : allaStudenter){
            System.out.println("\nNamn: " + s.getNamn() + "\tÅlder" + s.getAge());
            System.out.print("Läser dessa kurser: ");
            for (Deltagande d : allaDeltagare){
                if (d.getStudent() == s)
                System.out.print(d.getKurs().getKursNamn() + ", ");
            }
        }
    }

    /*public void printKlassLista(Kurs kurs) {
        System.out.println("Klasslista för program: " + kurs.getKursNamn()
        + "\nLärare: " + kurs.getLärare().getNamn());
        for (Student s : kurs.getProgramLista()) {
            System.out.println("Namn: " + s.getNamn() +
                    "\t Ålder: " + s.getAge());
        }
    }
     */
    /*public void printAllaStudenter(ArrayList<Student> students){
        System.out.println("Alla Studenter:");

        for (Student s : students) {
            System.out.println();
            System.out.print("Namn: " + s.getNamn() + "\t Ålder: " + s.getAge()
            + "\nKurser: ");
            for (Kurs k : s.getKurser()) {
                System.out.print(k.getKursNamn() + ", ");

            }
        }
    }

     */
}

