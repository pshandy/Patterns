package generative.builder;

public class AutomotiveEngineer {

    private CarBuilder builder;

    public AutomotiveEngineer(CarBuilder builder) {
        super();
        this.builder = builder;
        if (this.builder == null) {
            throw new IllegalArgumentException("Automotive Engineer can't work without Car Builder!");
        }
    }

    public Car manufactureCar() {
        return builder.fixChassis().fixBody().paint().fixInterior().build();
    }

}

class Main {

    public static void main(String[] args) {
        CarBuilder builder = new SportsCarBuilder();
        AutomotiveEngineer engineer = new AutomotiveEngineer(builder);
        Car car = engineer.manufactureCar();
        if (car != null) {
            System.out.println("Below car delievered: ");
            System.out.println("======================================================================");
            System.out.println(car);
            System.out.println("======================================================================");
        }
    }

}