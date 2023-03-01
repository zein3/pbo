package pset43;

import pset42.Movable;

public class MovableTest2 {
    public static void main(String[] args) {
        Movable rec = new MovableRectangle(1, 4, 4, 1, 1, 1);
        System.out.println(rec);

        rec.moveRight();
        System.out.println(rec);

        rec.moveLeft();
        System.out.println(rec);

        rec.moveUp();
        System.out.println(rec);

        rec.moveDown();
        System.out.println(rec);
    }
}
