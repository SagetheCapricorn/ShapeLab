public class ETriangle extends Shape{
    private int side;

    /**
     *  This method creates an equilateral triangle
     * @param side Represents how long the sides of the equilateral triangle is
     */
    public ETriangle (int side) {
        super("ETriangle");
        this.side = side;
    }

    /**
     * The formula for the area of an equilateral triangle, courtesy of Google
     * @return The area of the triangle
     */
    public double getArea() {
        return ((Math.sqrt(3)/4)*Math.pow(side,2));
    }

    /**
     * The formula for the perimeter of an equilateral triangle, courtesy of my brain
     * @return The perimeter of the triangle
     */
    public double getPerimeter() {
        return side*3;
    }
}
