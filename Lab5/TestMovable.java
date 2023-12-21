package Lab5;

public class TestMovable {
    public static void main(String[] args) {
        MovableCircle movable_circle = new MovableCircle(10, 0, 0, 1, 1);
        System.out.println(movable_circle);
        movable_circle.moveUp();
        movable_circle.moveUp();
        movable_circle.moveRight();
        System.out.println(movable_circle);
        movable_circle.moveDown();
        movable_circle.moveDown();
        movable_circle.moveDown();
        movable_circle.moveDown();
        System.out.println(movable_circle);
    }
}
