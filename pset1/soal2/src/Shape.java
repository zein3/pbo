/**
 * Kelas untuk menggambarkan sebuah wujud.
 *
 * @author  Ahmad Zein Haddad
 */
public class Shape {
    private String color = "red";
    private Boolean filled = true;

    public Shape() {}

    public Shape(String color, Boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean isFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return String.format("Shape[color=%s,filled=%s]",
            this.color,
            (this.filled) ? "true" : "false"
        );
    }
}
