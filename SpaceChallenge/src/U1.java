public class U1 extends Rocket {
    //default constructor
    U1(){
        rocketCost = 100000; // in $
        rocketWeight = 10000; // in Kg
        maxWeightWithCargo = 18000; // in Kg
        leftOverSpace = maxWeightWithCargo - rocketWeight;
    }
    public boolean launch(){
        chanceOfLaunchExplosion = 50 * ((double) (this.rocketWeight + this.leftOverSpace) / this.maxWeightWithCargo);
        this.explosion = (int)(Math.random() * 100) + 1;
        return !(chanceOfLaunchExplosion >= this.explosion);
    }
    public boolean land(){
        chanceOfLandCrash = 10 * (double)(this.rocketWeight + this.leftOverSpace) / this.maxWeightWithCargo;
        this.crash = (int)(Math.random() * 100 + 1);
        return !(chanceOfLandCrash >= this.crash);
    }
}
