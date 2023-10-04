package Sprint1.Inlämningsuppgift1Test;

import Sprint1.Inlämningsuppgift1.KöttätandeVäxter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KöttätandeVäxterTest {

    KöttätandeVäxter k = new KöttätandeVäxter("Test", 0.7);

    @Test
    void calculateLiquidPerDay() {
        double actualResult = 0.24;
        double expectedResult = k.calculateLiquidPerDay(k.getLängd());
        Assertions.assertEquals (expectedResult, actualResult);
    }
}