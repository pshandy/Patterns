package generative.prototype;
public class Client {

    public static void main(String[] args) {

        //-------------------

        HairyTree hairyTree = new HairyTree(10, 10, "Messy");

        HairyTree anotherHairyTree = (HairyTree) hairyTree.copy(); // Можно запихнуть в фабрику

        //--------------------

        System.out.println(hairyTree.getHeight() + " " + hairyTree.getMass() + " " + hairyTree.getHairType());

        System.out.println(anotherHairyTree.getHeight() + " " + anotherHairyTree.getMass() + " " + anotherHairyTree.getHairType());

        anotherHairyTree.setHairType("AnotherHairType");

        System.out.println(hairyTree.getHeight() + " " + hairyTree.getMass() + " " + hairyTree.getHairType());

        System.out.println(anotherHairyTree.getHeight() + " " + anotherHairyTree.getMass() + " " + anotherHairyTree.getHairType());


    }

}

