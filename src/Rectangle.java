public class Rectangle extends Shape {
    private int length;
    private int width;

    /**
     * This creates a rectangle
     * @param length is the length of the rectangle
     * @param width is the width of the rectangle
     */
    public Rectangle(int length, int width)
    {
        super("Rectangle");
        this.length=length;
        this.width=width;
    }

    /**
     * This creates a square
     * @param side is the length of the side of the square
     */
    public Rectangle(int side)
    {
        super("Square");
        this.length=side;
        this.width=side;
    }

    @Override
    public double getArea()
    {
        return length*width;
    }

    @Override
    public double getPerimeter()
    {
        return 2*length + 2*width;
    }
}
