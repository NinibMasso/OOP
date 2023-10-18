package Sprint2.BensinförbrukningScanner;

import Sprint2.Bensinförbrukning.Car;
import org.junit.jupiter.api.Test;

public class SkrivUtMilTest {

    Sprint2.Bensinförbrukning.Car car = new Car();

    @Test
    public void beräknaMilTest(){
        car.setAntalMilIdag(3000);
        car.setAntalMilEttÅrSedan(2000);
        System.out.println(car.beräknaMil());
        assert(car.beräknaMil()== 1000);
    }

    @Test
    public void beräknaFörbrukningTest(){
        car.setAntalMilIdag(3000);
        car.setAntalMilEttÅrSedan(2000);
        car.setAntalLiterBensin(1200);
        assert(car.beräknaFörbrukning() == 1.2);
    }


}
