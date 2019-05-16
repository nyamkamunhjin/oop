import java.util.Collections;
import java.util.List;

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

    public static void sortShapes(List<TwoDimensionalShape> shapes) {
        for(int i = 0; i < shapes.size() - 1; i++) {
            for(int j = i + 1; j < shapes.size(); j++) {
                if(shapes.get(i).findArea() > shapes.get(j).findArea()) {
                    Collections.swap(shapes, i, j);
                }
            }
        }
    }
}
