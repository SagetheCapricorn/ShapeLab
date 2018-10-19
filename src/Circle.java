public class Circle extends Shape {

    private int radius;

    /**
     * This code creates the circle
     * @param radius this the length of the distance from the center of the circle to any point on the circle.
     */
    public Circle(int radius)
    {
        super("Circle");
        this.radius = radius;
    }
    @Override
    public double getArea()
    {
        return Math.PI*(radius*radius);
    }
    @Override
    public double getPerimeter()
    {
       return Math.PI*radius*2;
    }

}
