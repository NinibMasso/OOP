package Sprint1.Inlämningsuppgift1Test;

import Sprint1.Inlämningsuppgift1.Kaktusar;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class KaktusarTest {

    Kaktusar k = new Kaktusar("Test", 0.7);

    @Test
    void calculateLiquidPerDay() {
        double actualResult = 0.02;
        double expectedResult = k.calculateLiquidPerDay(k.getLängd());
        Assertions.assertEquals (expectedResult, actualResult);
    }
}