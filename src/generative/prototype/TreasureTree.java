package generative.prototype;

public class TreasureTree extends Tree {

    private String treasureType;

    public TreasureTree(int height, int mass, String treasureType) {
        super(height, mass);
    }

    @Override
    public Tree copy() {
        return (new TreasureTree(this.getHeight(), this.getMass(), treasureType));
    }

    public String getTreasureType() {
        return (treasureType);
    }

    public void setTreasure(String treasure) {
        this.treasureType = treasure;
    }

}
