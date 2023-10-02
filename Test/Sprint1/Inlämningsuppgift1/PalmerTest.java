package Sprint1.Inlämningsuppgift1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalmerTest {
    Palmer p = new Palmer("Test", 5);
    Palmer p1 = new Palmer("Test2", 1);

    @Test
    void calculateLiquidPerDay() {
        double result = p.calculateLiquidPerDay(p.getLängd());
        assert (result == 2.5);
        double result2 = p1.calculateLiquidPerDay(p1.getLängd());
        assert (result2 == 0.5);
    }
}