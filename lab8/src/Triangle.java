public class Triangle extends TwoDimensionalShape {
    // fields
    protected double edgeLength;
    private double [] topCoordinate;
    private double [] botLeftCoordinate;
    private double [] botRightCoordinate;


    public Triangle(String shapeName, double x, double y, double edgeLength) {
        super(shapeName, x, y);
        this.edgeLength = edgeLength;
        this.numOfVertices = 3;

        this.topCoordinate = new double[2];
        this.botLeftCoordinate = new double[2];
        this.botRightCoordinate = new double[2];

        // calculate 3 vertex location
        this.topCoordinate[0] = x + edgeLength / 2;
        this.topCoordinate[1] = y + (edgeLength * edgeLength * Math.sqrt(3) / 2);

        this.botLeftCoordinate[0] = x;
        this.botLeftCoordinate[1] = y;

        this.botRightCoordinate[0] = x + edgeLength;
        this.botRightCoordinate[1] = y;

    }

    // methods
    public double getEdgeLength() {
        return edgeLength;
    }

    public void setEdgeLength(double edgeLength) {
        this.edgeLength = edgeLength;

        this.topCoordinate[0] = x + edgeLength / 2;
        this.topCoordinate[1] = y + (edgeLength * edgeLength * Math.sqrt(3) / 2);

        this.botRightCoordinate[0] = x + edgeLength;
        this.botRightCoordinate[1] = y;
    }

    public double[] getTopCoordinate() {
        return topCoordinate;
    }

    public double[] getBotLeftCoordinate() {
        return botLeftCoordinate;
    }

    public double[] getBotRightCoordinate() {
        return botRightCoordinate;
    }

    public void setBotLeftCoordinate(double[] botLeftCoordinate) {
        this.botLeftCoordinate = botLeftCoordinate;

        this.topCoordinate[0] = x + edgeLength / 2;
        this.topCoordinate[1] = y + (edgeLength * edgeLength * Math.sqrt(3) / 2);

        this.botRightCoordinate[0] = x + edgeLength;
        this.botRightCoordinate[1] = y;
    }

    @Override
    public double findArea() {
        return edgeLength * edgeLength * Math.sqrt(3) / 4;
    }

    @Override
    public double findPerimeter() {
        return edgeLength * this.numOfVertices;
    }

    @Override
    public void printShape() {
        super.printShape();
        System.out.println("vertex pos: " + this.botLeftCoordinate[0] + ", " + this.botLeftCoordinate[1] +
                " | " + this.topCoordinate[0] + ", " + this.topCoordinate[1] +
                " | " + this.botRightCoordinate[0] + ", " + this.botRightCoordinate[1]);

        System.out.println("Area: " + this.findArea());
        System.out.println("Perimeter: " + this.findPerimeter());

    }
}
