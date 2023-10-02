package Sprint1.Övning1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BilTest {

    Bil b1 = new Bil("TKL76M", "Tiguan", "Volkswagen");
    Bil b2 = new Bil("PLS976", "XC90", "Volvo");
    Bil b3 = new Bil("XSO758", "MLS", "Mercedes");
    Bilägare a1 = new Bilägare("Ninib Masso", "Skogsgatan 3B", 29);
    Bilägare a2 = new Bilägare("Hannan Hadodo", "Skogsgatan 3B", 29);
    Bilägare a3 = new Bilägare("Rabi Masso", "Enbygatan 13B", 29);

    @Test
    void ägsAvTest() {
        b1.ägsAv(a2);
        assert(b1.ägare == a2);
        b1.ägsAv(a3);
        assert(b1.ägare == a3);
    }

    @Test
    void såldTest(){
        b1.ägsAv(a2);
        assert(b1.ägare == a2);
        b1.såld();
        assert(b1.ägare == null);
    }

    void getBilÄgareTest(){
        assert(b1.getÄgare() == null);
        b1.ägsAv(a3);
        assert(b1.getÄgare() == a3);
    }
}