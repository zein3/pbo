package pset44;

public class GeometryTest {
    public static void main(String[] args) {
        GeometricObject circle = new Circle(4);
        System.out.println(circle);
        System.out.println(String.format("Keliling = %.2f", circle.getPerimeter()));
        System.out.println(String.format("Luas = %.2f", circle.getArea()));

        Resizable rCircle = new ResizableCircle(8);
        System.out.println(rCircle);
        rCircle.resize(50);
        System.out.println(rCircle);
    }
}
