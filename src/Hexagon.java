public class Hexagon extends Shape{
    private int side;

    /**
     * This code creates the Hexagon shape.
     * @param side this is the integer length of the side of the Hexagon.
     */
    public  Hexagon(int side)
    {
        super("Hexagon");
        this.side = side;
    }
    @Override
    public double getArea()
    {
        return (((3*Math.sqrt(3))/2)*(side*side));
    }
    @Override
    public double getPerimeter()
    {
        return side*6;
    }
}
