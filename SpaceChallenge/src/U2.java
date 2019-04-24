public class U2 extends Rocket {
    //default constructor
    U2(){
        rocketCost = 120000; // in $
        rocketWeight = 18000; // in Kg
        maxWeightWithCargo = 29000; // in Kg
        leftOverSpace = maxWeightWithCargo - rocketWeight;
    }
    public boolean launch(){
        chanceOfLaunchExplosion = 40 * ((double) (this.rocketWeight + this.leftOverSpace) / this.maxWeightWithCargo);
        this.explosion = (int)(Math.random() * 100 + 1);
        return !(chanceOfLaunchExplosion >= this.explosion);
    }
    public boolean land(){
        chanceOfLandCrash = 80 * (double)(this.rocketWeight + this.leftOverSpace) / this.maxWeightWithCargo;
        this.crash = (int)(Math.random() * 100 + 1);
        return !(chanceOfLandCrash >= this.crash);
    }
}
