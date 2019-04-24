public interface SpaceShip {
    public boolean launch();
    public boolean land();
    public boolean canCarry(Item item);
    void carry(Item item);
}
