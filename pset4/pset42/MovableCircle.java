package pset42;

/**
 * Kelas circle yang mengimplementasi interface Movable. Memiliki Movable Point.
 * @author Ahmad Zein Haddad
 */
public class MovableCircle implements Movable {
    private int radius;

    // composition, MovablePoint digunakan untuk menyimpan lokasi lingkaran
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public String toString() {
        return String.format("%s,radius=%d", center.toString(), radius);
    }

    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }
}
