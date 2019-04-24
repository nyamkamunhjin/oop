public class Rocket implements SpaceShip {
    // fields
    int rocketCost; // in $
    int rocketWeight; // in Kg
    int maxWeightWithCargo; // in Kg
    int leftOverSpace;
    double chanceOfLaunchExplosion;
    double chanceOfLandCrash;
    int explosion;
    int crash;
    //methods
    public boolean launch() {
        return true;
    }

    public boolean land() {
        return true;
    }

    public boolean canCarry(Item item) {

       return this.leftOverSpace >= item.weight;
    }

    public void carry(Item item) {
            this.leftOverSpace -= item.weight;
    }
}
