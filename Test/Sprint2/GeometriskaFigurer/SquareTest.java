package Sprint2.GeometriskaFigurer;

import org.junit.jupiter.api.Test;

public class SquareTest {

    Square s = new Square();

    @Test
    public void getAreaTest(){
        s.length = 3;
        s.width = 4;
        assert(s.getArea() == 12);
        assert(s.getArea() != 10);
    }

    @Test
    public void getCircumferenceTest(){
        s.length = 3;
        s.width = 4;
        assert(s.getCircumference() == 14);
        assert(s.getCircumference() != 10);
    }

}
