package Sprint1.ArvochArrayer;

public class Person {

    protected String namn;
    protected int age;
    public Person(){};

    public Person(String namn, int age) {
        this.namn = namn;
        this.age = age;

    }
    public String getNamn() {
        return namn;
    }
    public int getAge() {
        return age;
    }

}
