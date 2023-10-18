package Sprint2.Serialisering;

public class Båt extends Fordon implements Printable {

    private double dödvikt;

    public Båt(double hastighet, double vikt, double dödvikt) {
        super(hastighet, vikt);
        this.dödvikt = dödvikt;
    }


    public Båt(){}

    public void sväng(double position){
    }

    public void printMe(){
        System.out.println("Båt med Hastighet: " + getHastighet() + "\tVikt: " + getVikt() + "\tDödvikt: " + dödvikt);
    }
}
