public class Main {
    public static void main(String[] args) {
        Shape s = new Shape("green", false);
        System.out.println(s);

        System.out.println();

        Circle c = new Circle(3.0);
        System.out.println("Area: " + c.getArea());
        System.out.println("Perimeter: " + c.getPerimeter());
        System.out.println(c);

        System.out.println();

        Rectangle rec = new Rectangle();
        rec.setWidth(2);
        rec.setLength(3);
        System.out.println("Area: " + rec.getArea());
        System.out.println(rec);

        System.out.println();

        Square sq = new Square(3);
        sq.setSide(2);
        sq.setWidth(4);
        System.out.println(sq);
    }
}
