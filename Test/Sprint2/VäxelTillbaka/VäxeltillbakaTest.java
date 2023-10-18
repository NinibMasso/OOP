package Sprint2.VäxelTillbaka;

import org.junit.jupiter.api.Test;

public class VäxeltillbakaTest {

    Växeltillbaka v = new Växeltillbaka();
    @Test
    public void beräknaVäxelTest(){
        int betalBelopp = 2000;
        int pris = 1000;

        double res = v.beräknaVäxel(pris, betalBelopp);
        assert(res == 1000);

    }

    @Test
    public void beräknaValörerTest(){
        int[] lista ={1000,500,200,100, 50, 20, 10, 5, 2, 1};
        int växel = 654;
        int[] tempLista = v.beräknaValörer(lista, växel);
        assert(tempLista[0] == 0);
        assert(tempLista[1] == 1);
        assert(tempLista[2] == 0);
        assert(tempLista[3] == 1);
        assert(tempLista[4] == 1);
        assert(tempLista[5] == 0);
        assert(tempLista[6] == 0);
        assert(tempLista[7] == 0);
        assert(tempLista[8] == 2);
        assert(tempLista[9] == 0);
        }

        @Test
        public void jämnaPengarTest(){
        int pris = 1000;
        int belopp = 1000;
        assert(v.jämnaPengar(v.beräknaVäxel(pris, belopp)));
        }
        @Test
        public void förLitePengarTest(){
            int pris = 1000;
            int belopp = 900;
            assert(v.förLitePengar(v.beräknaVäxel(pris, belopp)));
    }

}
