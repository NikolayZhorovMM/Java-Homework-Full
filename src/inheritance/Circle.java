package inheritance;

import com.sun.tools.jconsole.JConsoleContext;

public class Circle {
    private double radius;
    private final double PI = Math.PI;

    public Circle(double radius) {
        this.radius =  radius < 0 ? 0 : radius;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }
}
