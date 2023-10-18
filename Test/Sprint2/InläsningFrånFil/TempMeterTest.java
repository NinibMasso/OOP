package Sprint2.InläsningFrånFil;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TempMeterTest {

    TempMeter tm = new TempMeter();

    @Test
    public void högstaLägstaTemp(){
        double högsta = Double.MIN_VALUE;
        double lägsta = Double.MAX_VALUE;
        double temp1 = 14.0;
        double temp2 = 10;
        assertTrue(tm.högstaTemp(temp1, högsta) == 14.0);
        assertFalse(tm.högstaTemp(temp1, högsta) == 15.6);
        assertTrue(tm.lägstaTemp(temp2, lägsta) == 10.0);
        assertFalse(tm.lägstaTemp(temp2, lägsta)== 5.0);
    }
}
