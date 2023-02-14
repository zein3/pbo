/**
 * Kelas untuk merepresentasikan persegi.
 *
 * @author  Ahmad Zein Haddad
 */
public class Square extends Rectangle {
    public Square() {
        super();
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, Boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return this.getWidth();
    }

    public void setSide(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setWidth(double side) {
        this.setSide(side);
    }

    @Override
    public void setLength(double side) {
        this.setSide(side);
    }

    @Override
    public String toString() {
        return String.format("Square[%s]", super.toString());
    }
}
