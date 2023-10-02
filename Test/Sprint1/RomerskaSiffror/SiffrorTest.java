package Sprint1.RomerskaSiffror;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SiffrorTest {

     Siffror i = Siffror.I;
     Siffror v = Siffror.V;
     Siffror X = Siffror.X;
    Siffror L = Siffror.X;
    Siffror C = Siffror.X;
    Siffror D = Siffror.X;
    Siffror M = Siffror.X;

    @Test
    void getVärde() {
        assert(Siffror.I.getVärde() == 1);
        assert(Siffror.V.getVärde() == 5);
        assert(Siffror.X.getVärde() == 10);
        assert(Siffror.L.getVärde() == 50);
        assert(Siffror.C.getVärde() == 100);
        assert(Siffror.D.getVärde() == 500);
        assert(Siffror.M.getVärde() == 1000);

    }

    @Test
    void getLetter() {
        assert(Siffror.I.getLetter().equals("I"));
        assert(Siffror.V.getLetter().equals("V"));
        assert(Siffror.X.getLetter().equals("X"));
        assert(Siffror.L.getLetter().equals("L"));
        assert(Siffror.C.getLetter().equals("C"));
        assert(Siffror.D.getLetter().equals("D"));
        assert(Siffror.M.getLetter().equals("M"));

    }
}