 public class isoscelesTriangle extends Shape {
        private int side;
        private int base;
        private int height;

        public isoscelesTriangle (int side, int base, int height) {
            super("isoscelesTriangle");
            this.side = side;
            this.base = base;
            this.height = height;
        }
        public double getPerimeter(){
            return(2*side*base);
        }
        public double getArea() {
            return ((base*height)/2);
        }
    }
