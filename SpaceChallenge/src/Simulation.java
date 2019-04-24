
import java.io.FileNotFoundException;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Simulation {
    //fields
    //int i = 0; //counter

    //methods
    public ArrayList<Item> loadItems(String dir) throws Exception {
        ArrayList<Item> Items = new ArrayList<Item>();
        try{
            File file = new File(dir);
            Scanner scanner = new Scanner(file);
            String info;

            //extract text information to Item list.
            while(scanner.hasNextLine()){
                Item item = new Item();
                info = scanner.nextLine();
                int equalSign = info.indexOf("=");
                item.name = info.substring(0, equalSign);
                item.weight = parseInt(info.substring(equalSign + 1));
                Items.add(item);
            }
            scanner.close();

        } catch(FileNotFoundException exception) {
            System.out.println("File not found!");
        }
        return Items;
    }
    public ArrayList<Rocket> loadU1(ArrayList<Item> Items){
        ArrayList<Rocket> rocketU1s = new ArrayList<Rocket>();
        int i = 0;
        Rocket rocket = new U1();
        System.out.println("Initiate loading U1!");
        while(i < Items.size()){
            if(rocket.canCarry(Items.get(i))){
                System.out.println("Loading item--> " +Items.get(i).name+ " Weight: " +Items.get(i).weight);
                rocket.carry(Items.get(i));
                i++;
            } else {
                rocketU1s.add(rocket);
                rocket = new U1();
            }
        }
        System.out.println("Finished loading!\nNumber of rockets used to fill up items: " + (rocketU1s.size() + 1));
        return rocketU1s;
    }

    public ArrayList<Rocket> loadU2(ArrayList<Item> Items){
        ArrayList<Rocket> rocketU2s = new ArrayList<Rocket>();
        int i = 0;
        U2 rocket = new U2();
        System.out.println("Initiate loading U2!");
        while(i < Items.size()){
            if(rocket.canCarry(Items.get(i))){
                System.out.println("Loading item--> " +Items.get(i).name+ " Weight: " +Items.get(i).weight);
                rocket.carry(Items.get(i));
                i++;
            } else {
                rocketU2s.add(rocket);
                rocket = new U2();
            }
        }
        System.out.println("Finished loading!\nNumber of rockets used to fill up items: " + (rocketU2s.size() + 1));
        return rocketU2s;
    }

    public int runSimulation(ArrayList<Rocket> rockets){
        int i = 0;
        int totalCost = (rockets.size() + 1) * rockets.get(i).rocketCost;
        while(i < rockets.size()) {
            if(!rockets.get(i).launch()) {
                System.out.println("Launch failed");
                totalCost += rockets.get(i).rocketCost;
            }
            else {
                System.out.println("Launch Success");
                if(!rockets.get(i).land()) {
                    System.out.println("Exploded");
                    totalCost += rockets.get(i).rocketCost;
                }
                else i++;
            }

        }
        return totalCost;
    }
}
