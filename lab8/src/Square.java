public class Square extends TwoDimensionalShape {
    // fields
    protected double edgeLength;
    private double [] coordinate1;
    private double [] coordinate2;
    private double [] coordinate3;
    private double [] coordinate4;

    public Square(String shapeName, double x, double y, double length) {
        super(shapeName, x, y);
        this.edgeLength = length;
        this.numOfVertices = 4;

        this.coordinate1 = new double[2];
        this.coordinate2 = new double[2];
        this.coordinate3 = new double[2];
        this.coordinate4 = new double[2];

        // calculate 4 vertex location
        this.coordinate1[0] = x;
        this.coordinate1[1] = y;

        this.coordinate2[0] = x + edgeLength;
        this.coordinate2[1] = y;

        this.coordinate3[0] = x;
        this.coordinate3[1] = y + edgeLength;

        this.coordinate4[0] = x + edgeLength;
        this.coordinate4[1] = y + edgeLength;
    }

    // methods
    public double getEdgeLength() {
        return edgeLength;
    }

    public void setEdgeLength(int edgeLength) {
        this.edgeLength = edgeLength;
    }

    @Override
    public double findArea() {
        return edgeLength * edgeLength;
    }

    @Override
    public double findPerimeter() {
        return edgeLength * this.numOfVertices;
    }

    public double[] getCoordinate1() {
        return coordinate1;
    }

    public void setCoordinate1(double[] coordinate1) {
        this.coordinate1 = coordinate1;
    }

    public double[] getCoordinate2() {
        return coordinate2;
    }

    public void setCoordinate2(double[] coordinate2) {
        this.coordinate2 = coordinate2;
    }

    public double[] getCoordinate3() {
        return coordinate3;
    }

    public void setCoordinate3(double[] coordinate3) {
        this.coordinate3 = coordinate3;
    }

    public double[] getCoordinate4() {
        return coordinate4;
    }

    public void setCoordinate4(double[] coordinate4) {
        this.coordinate4 = coordinate4;
    }

    @Override
    public void printShape() {
        super.printShape();

        System.out.println("vertex pos: " + this.coordinate1[0] + ", " + this.coordinate1[1] +
                " | " + this.coordinate2[0] + ", " + this.coordinate2[1] +
                " | " + this.coordinate3[0] + ", " + this.coordinate3[1] +
                " | " + this.coordinate4[0] + ", " + this.coordinate4[1]);

        System.out.println("Area: " + this.findArea());
        System.out.println("Perimeter: " + this.findPerimeter());
    }
}
