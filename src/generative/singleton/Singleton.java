package generative.singleton;

public class Singleton {

    private static Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return (instance);
    }

}

class Program {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
    }

}