package polymorphism;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return this.name+ " is starting";
    }

    public String accelerate() {
        return this.name+ " is accelerating";
    }

    public String brake() {
        return this.name+" is braking";
    }
}
