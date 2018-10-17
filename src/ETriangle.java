public class ETriangle {
    private int side;

    public ETriangle (int side) {
        this.side = side;
    }
    public double getArea() {
        return ((Math.sqrt(3)/4)*Math.pow(side,2));
    }
    public double getPerimeter() {
        return side*3;
    }
}
