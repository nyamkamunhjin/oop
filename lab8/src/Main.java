public class Main {

    public static void main(String[] args) {
	    // write your code here
        Triangle triangle = new Triangle("triangle", 0, 0, 2);
        triangle.printShape();

        Square square = new Square("square", 0, 0, 5);
        square.printShape();

        Circle circle = new Circle("circle", 0, 0, 3);
        circle.printShape();

    }
}
