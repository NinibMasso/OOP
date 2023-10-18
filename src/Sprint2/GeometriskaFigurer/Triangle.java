package Sprint2.GeometriskaFigurer;

public class Triangle implements Figure{
    protected int length;
    protected int height;

    @Override
    public double getArea() {
        return (length * height) / 2;
    }

    @Override
    public double getCircumference() {
        return length * 3;
    }
}
