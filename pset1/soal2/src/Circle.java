public class Circle extends Shape {
    private double radius = 1.0;

    public Circle() {
        super();
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(double radius, String color, Boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * (this.radius * this.radius);
    }

    public double getPerimeter() {
        return Math.PI * this.radius * 2;
    }

    public String toString() {
        return String.format("Circle[%s,radius=%.2f]",
            super.toString(),
            this.radius
        );
    }
}
