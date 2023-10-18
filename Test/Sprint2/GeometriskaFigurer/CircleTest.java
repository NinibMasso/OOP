package Sprint2.GeometriskaFigurer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CircleTest {
    Circle c = new Circle();

    @Test
    public void getAreaTest(){
        c.radie = 2;
        assert Math.abs(c.getArea() - 12.56) < 0.01;
        assert(c.getArea() != 10);
    }

    @Test
    public void getCircumferenceTest(){
        c.radie = 3;
        assertTrue(c.getCircumference() - 18.849 > -0.01);
        assertTrue(c.getCircumference() - 18.850 < 0.01);
        assert(c.getCircumference() != 15);
    }
}
