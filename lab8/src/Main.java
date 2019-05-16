import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        List<TwoDimensionalShape> shapes = new ArrayList<>();

        shapes.add(new Triangle("triangle", 0, 0, 10));
        shapes.add(new Square("square", 0, 0, 5));
        shapes.add(new Circle("circle", 0, 0, 3));
//        TwoDimensionalShape triangle = new Triangle("triangle", 0, 0, 10);

//        TwoDimensionalShape square = new Square("square", 0, 0, 5);

//        TwoDimensionalShape circle = new Circle("circle", 0, 0, 3);

        System.out.println(shapes.get(0).findArea() + " " + shapes.get(1).findArea() + " " + shapes.get(2).findArea());
        TwoDimensionalShape.sortShapes(shapes);
        System.out.println(shapes.get(0).findArea() + " " + shapes.get(1).findArea() + " " + shapes.get(2).findArea());
    }
}
