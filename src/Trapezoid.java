public class Trapezoid extends Shape {
    private int base1;
    private int base2;
    private int height;
    private int side;

    /**
     * This code creates the trapezoid
     * @param base1 this is the length of the smallest base of the trapezoid.
     * @param base2 this is the length of the largest base of the trapezoid.
     * @param height this is the length of one of the trapezoid legs.
     * @param side this is the length of one of the trapezoid legs.
     */
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
