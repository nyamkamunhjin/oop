import static java.lang.Math.PI;

public class Circle extends TwoDimensionalShape{
    // fields
    protected double radius;
    protected double [] centerCoordinate;

    public Circle(String shapeName, double x, double y, double radius) {
        super(shapeName, x, y);
        this.numOfVertices = 0;
        this.radius = radius;
        this.centerCoordinate = new double[2];

        // calculate coordinate of center of circle
        centerCoordinate[0] = x + this.radius;
        centerCoordinate[1] = y + this.radius;
    }

    // methods

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double[] getCenterCoordinate() {
        return centerCoordinate;
    }

    public void setCenterCoordinate(double[] centerCoordinate) {
        this.centerCoordinate = centerCoordinate;
    }

    @Override
    public double findArea() {
        return PI * radius * radius;
    }

    @Override
    public double findPerimeter() {
        return PI * radius * 2;
    }

    @Override
    public void printShape() {
        super.printShape();

        System.out.println("vertex: " + centerCoordinate[0] + ", " + centerCoordinate[1]);
        System.out.println("Area: " + this.findArea());
        System.out.println("Perimeter: " + this.findPerimeter());
    }
}
