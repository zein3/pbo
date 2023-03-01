package pset42;

public class MovableTest {
    public static void main(String[] args) {
        MovableCircle circle = new MovableCircle(3, 4, 1, 2, 4);
        System.out.println(circle);

        circle.moveUp();
        System.out.println(circle);

        circle.moveRight();
        System.out.println(circle);

        circle.moveDown();
        System.out.println(circle);

        circle.moveLeft();
        System.out.println(circle);
    }
}
