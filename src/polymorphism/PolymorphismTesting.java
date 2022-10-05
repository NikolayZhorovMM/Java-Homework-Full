package polymorphism;

public class PolymorphismTesting {
    public static void main(String[] args) {
        Car car = new Car(2, "Old car");
        System.out.println(car.startEngine());

        Mitsubishi mitsubishi = new Mitsubishi(4, "Mitsubishi Superb");
        System.out.println(mitsubishi.startEngine());

        Mercedes mercedes = new Mercedes(6,"Mercedes Benz");
        System.out.println(mercedes.startEngine());

        Ford ford = new Ford(8,"Ford Camaro");
        System.out.println(ford.startEngine());
    }
}
