package polymorphism;

public class Mercedes extends Car {

    public Mercedes(int cylinders, String name) {
        super(cylinders, name);
    }

    public String startEngine() {
        return this.getName()+" engine is starting";
    }

    public String accelerate() {
        return this.getName()+ " is accelerating";
    }

    public String brake() {
        return this.getName()+ " is braking";
    }
}
