/**
 * Kelas untuk merepresentasikan persegi panjang.
 *
 * @author  Ahmad Zein Haddad
 */
public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
        super();
    }

    public Rectangle(double width, double length) {
        super();
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, Boolean filled) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    /**
     * Mengembalikan luas dari persegi panjang.
     * @return luas
     */
    public double getArea() {
        return width * length;
    }

    /**
     * Mengembalikan keliling dari persegi panjang.
     * @return keliling
     */
    public double getPerimeter() {
        return 2 * (width + length);
    }

    public String toString() {
        return String.format("Rectangle[%s,width=%.2f,length=%.2f]",
            super.toString(),
            width,
            length
        );
    }
}
