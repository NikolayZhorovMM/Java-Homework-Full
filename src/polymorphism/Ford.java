package polymorphism;

public class Ford extends  Car{
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }
    @Override
    public String startEngine() {
        return this.getName()+" engine is startin)";
    }
    @Override
    public String accelerate() {
        return this.getName()+ " is accelerating";
    }
    @Override
    public String brake() {
        return this.getName()+ " is braking";
    }
}
