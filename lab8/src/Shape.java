public abstract class Shape {
    // fields

    protected String shapeName;

    protected double x;
    protected double y;

    public Shape(String shapeName, double x, double y) {
        this.shapeName = shapeName;
        this.x = x;
        this.y = y;
    }

    // methods
    public abstract void printShape();

    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public abstract double findArea();

    public abstract double findPerimeter();


}
