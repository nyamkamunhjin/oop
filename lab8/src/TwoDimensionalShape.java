public abstract class TwoDimensionalShape extends Shape {

    // fields
    protected int numOfVertices;


    public TwoDimensionalShape(String shapeName, double x, double y) {
        super(shapeName, x, y);
    }

    // methods
    public int getNumOfVertices() {
        return numOfVertices;
    }

    public void setNumOfVertices(int numOfVertices) {
        this.numOfVertices = numOfVertices;
    }

    @Override
    public void printShape() {
        System.out.println("Shape type: " + shapeName);
        System.out.println("pos: " + this.getX() +", " +
                this.getY());
    }
}
