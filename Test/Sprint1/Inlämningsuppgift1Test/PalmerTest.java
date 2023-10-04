package Sprint1.Inlämningsuppgift1Test;

import Sprint1.Inlämningsuppgift1.Palmer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalmerTest {
    Palmer p = new Palmer("Test", 5);
    Palmer p1 = new Palmer("Test2", 1);

    @Test
    void calculateLiquidPerDay() {

        double actualResult = 2.5;
        double expectedResult = p.calculateLiquidPerDay(p.getLängd());
        Assertions.assertEquals(expectedResult, actualResult);

        double actualResult1 = 0.5;
        double expectedResult1 = p1.calculateLiquidPerDay(p1.getLängd());
        Assertions.assertEquals(expectedResult1, actualResult1);
    }
}