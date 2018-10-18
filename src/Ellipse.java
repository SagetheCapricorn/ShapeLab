public class Ellipse extends Shape {
    private int axis1;
    private int axis2;
    public Ellipse (int axis1,int axis2)
    {
        super("Ellipse");
        this.axis1= axis1;
        this.axis2= axis2;
    }

    @Override
    public double getArea() {
        return (Math.PI*axis2*axis1);
    }

    @Override
    public double getPerimeter() {
        return (2*Math.PI*(Math.sqrt(((axis1*axis1)+(axis2*axis2))/2)));
    }
}
