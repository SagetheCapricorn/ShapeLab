 public class isoscelesTriangle extends Shape {
        private int side;
        private int base;
        private int height;

     /**
      * Creates the isosceles triangle with the height
      * @param side The two sides of the triangle
      * @param base The bottom of the triangle
      * @param height The height of the triangle which is located perpendicular to the base, and intersects the angle evenly made by the two sides
      */
        public isoscelesTriangle (int side, int base, int height) {
            super("isoscelesTriangle");
            this.side = side;
            this.base = base;
            this.height = height;
        }

     /**
      * The formula for the perimeter of the isosceles triangle
      * @return The perimeter of the triangle
      */
     public double getPerimeter(){
            return((2*side)+base);
        }

     /**
      * The formula for the area of the isosceles triangle
      * @return The area of the triangle
      */
     public double getArea() {
            return ((base*height)/2);
        }
    }
