package generative.prototype;

public abstract class Tree {

    public abstract Tree copy();

    private int height;
    private int mass;

    public Tree(int height, int mass) {
        this.height = height;
        this.mass = mass;
    }

    public int getHeight() {
        return height;
    }

    public int getMass() {
        return mass;
    }

}
