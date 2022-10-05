package inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(0);
        System.out.println("Circle1 area is -> "+ circle1.getArea());

        Circle circle2 = new Circle(5);
        System.out.println("Circle2 area is -> "+ circle2.getArea());

        Cylinder cylinder1 = new Cylinder(0, 5);
        System.out.println("Cylinder1 area is -> "+ cylinder1.getArea());
        System.out.println("Cylinder1 volume is -> "+ cylinder1.getVolume());

        Cylinder cylinder2 = new Cylinder(3, 5);
        System.out.println("Cylinder2 area is -> "+ cylinder2.getArea());
        System.out.println("Cylinder2 volume is -> "+ cylinder2.getVolume());
    }
}
