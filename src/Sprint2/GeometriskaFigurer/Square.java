package Sprint2.GeometriskaFigurer;

public class Square implements Figure{
    protected int length;
    protected int width;

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public double getCircumference() {
        return (2 * length) + (2 * width);
    }
}
