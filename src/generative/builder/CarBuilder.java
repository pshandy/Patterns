package generative.builder;

public interface CarBuilder {

    public CarBuilder fixChassis();

    public CarBuilder fixBody();

    public CarBuilder paint();

    public CarBuilder fixInterior();

    public Car build();

}
