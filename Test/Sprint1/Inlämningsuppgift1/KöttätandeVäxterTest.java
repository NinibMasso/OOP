package Sprint1.Inlämningsuppgift1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KöttätandeVäxterTest {

    KöttätandeVäxter k = new KöttätandeVäxter("Test", 0.7);

    @Test
    void calculateLiquidPerDay() {
        double result = k.calculateLiquidPerDay(k.getLängd());
        assert(result == 0.24);
    }
}