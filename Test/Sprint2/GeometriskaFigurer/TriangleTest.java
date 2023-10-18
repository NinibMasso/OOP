package Sprint2.GeometriskaFigurer;

import org.junit.jupiter.api.Test;

public class TriangleTest {

    Triangle t = new Triangle();

    @Test
    public void getAreaTest(){
        t.length = 3;
        t.height = 4;
        assert(t.getArea() == 6);
        assert(t.getArea() != 5);
    }

    @Test
    public void getCircumferenceTest(){
        t.length = 2;
        assert(t.getCircumference() == 6);
        assert(t.getCircumference() != 7);
    }
}
