package Sprint2.GeometriskaFigurer;

public class Circle implements Figure{

    protected int radie;

    @Override
    public double getArea() {
        return radie * radie * Math.PI;
    }

    @Override
    public double getCircumference() {
        return 2 * radie * Math.PI;
    }
}
