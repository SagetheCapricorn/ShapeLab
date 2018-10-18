public class Trapezoid extends Shape {
    private int base1;
    private int base2;
    private int height;
    private int side;

    public Trapezoid(int base1, int base2, int height, int side) {
        super("Trapezoid");
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
        this.side= side;
    }

    @Override
    public double getArea()
    {
        return (((base1+base2)/2)*height);
    }

    @Override
    public double getPerimeter()
    {
        return (base1+base2+height+side);
    }
}
