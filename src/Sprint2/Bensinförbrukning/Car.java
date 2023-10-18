package Sprint2.Bensinförbrukning;

public class Car {
    protected double antalMilIdag;
    protected double antalMilEttÅrSedan;
    protected double antalLiterBensin;

    public double beräknaMil(){
        return (antalMilIdag - antalMilEttÅrSedan);
    }

    public double beräknaFörbrukning(){
        return antalLiterBensin / beräknaMil();
    }

    public double getAntalMilIdag() {
        return antalMilIdag;
    }

    public void setAntalMilIdag(double antalMilIdag) {
        this.antalMilIdag = antalMilIdag;
    }

    public double getAntalMilEttÅrSedan() {
        return antalMilEttÅrSedan;
    }

    public void setAntalMilEttÅrSedan(double antalMilEttÅrSedan) {
        this.antalMilEttÅrSedan = antalMilEttÅrSedan;
    }

    public double getAntalLiterBensin() {
        return antalLiterBensin;
    }

    public void setAntalLiterBensin(double antalLiterBensin) {
        this.antalLiterBensin = antalLiterBensin;
    }
}
