import java.sql.SQLOutput;

public class Runner {
    public static void main(String[] args) {
        Shape shape1 = new Rectangle(10,5);
        Shape shape2= new ETriangle(5);
        Shape shape3= new Circle(10);
        Shape shape4= new Hexagon(10);
        Shape shape5= new Trapezoid(2,3,14,12);
        Shape shape8= new Ellipse(23,24);
        Shape shape7= new isoscelesTriangle(12,13,14);


        System.out.println(shape3);
        System.out.println("My perimeter is : " + shape3.getPerimeter());
        System.out.println("My Area is : " +shape3.getArea());

        Shape [] shapes = {shape1,shape2, shape3, shape4, shape5, shape7, shape8};

        for (Shape cur : shapes)
        {
            System.out.println(cur);
            System.out.println("My area is : " + cur.getArea());
            System.out.println("My Perimeter is : " + cur.getPerimeter());
        }
    }
}
