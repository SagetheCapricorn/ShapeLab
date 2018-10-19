public class Square extends Rectangle {
    private int side;

    /**
     * This creates a square
      * @param side is the length of the side of the square
     */
    public Square(int side)
    {
        super(side);
        this.side=side;
    }

    @Override
    public double getArea()
    {
        return side*side;
    }

    @Override
    public double getPerimeter()
    {
        return side*4;
    }
}
