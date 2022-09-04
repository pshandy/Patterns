package generative.prototype;

public class HairyTree extends Tree {

    private String hairType;

    public HairyTree(int height, int mass, String hairType) {
        super(height, mass);
        this.hairType = hairType;
    }

    @Override
    public Tree copy() {
        return (new HairyTree(this.getHeight(), this.getMass(), hairType));
    }

    public String getHairType() {
        return hairType;
    }

    public void setHairType(String hairType) {
        this.hairType = hairType;
    }
}
