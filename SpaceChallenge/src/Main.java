
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws Exception{
	// write your code here
        Simulation test1 = new Simulation();
        ArrayList<Rocket> rocketsU1 = test1.loadU1(test1.loadItems("C:\\Users\\munhj\\Desktop\\phase-1.txt"));
        ArrayList<Rocket> rocketsU2 = test1.loadU2(test1.loadItems("C:\\Users\\munhj\\Desktop\\phase-1.txt"));
        //int price1 = test1.runSimulation(rocketsU1);
        System.out.println("U1: Total budget wasted: " + test1.runSimulation(rocketsU1) +"\n");
        //int price2 = test1.runSimulation(rocketsU2);
        System.out.println("U2: Total budget wasted: " + test1.runSimulation(rocketsU2));
    }
}
