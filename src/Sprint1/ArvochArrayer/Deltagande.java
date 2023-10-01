package Sprint1.ArvochArrayer;

public class Deltagande {
    protected Student student;
    protected Kurs kurs;


    public Deltagande(Student student, Kurs kurs) {
        this.student = student;
        this.kurs = kurs;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Kurs getKurs() {
        return kurs;
    }

    public void setKurs(Kurs kurs) {
        this.kurs = kurs;
    }
}
