package CircleEx;

/**
 * Created by KJCurtis on 11/30/16.
 */
public class Circle {
    private final double pi = Math.PI;
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getCircumference() {
        return 2 * pi * radius;
    }

    public double getArea() {
        return pi * radius * radius;
    }

}
