package Sprint1.Inlämningsuppgift1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KaktusarTest {

    Kaktusar k = new Kaktusar("Test", 0.7);

    @Test
    void calculateLiquidPerDay() {
        double result = k.calculateLiquidPerDay(k.getLängd());
        assert(result == 0.02);
    }
}