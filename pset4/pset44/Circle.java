package pset44;

/**
 * Kelas circle yang mengimplementasi GeometricObject.
 * @author Ahmad Zein Haddad
 */
public class Circle implements GeometricObject {
    protected double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return String.format("Circle[radius=%.2f]", this.radius);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
