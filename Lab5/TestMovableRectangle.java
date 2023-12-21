package Lab5;

public class TestMovableRectangle {
    public static void main(String[] args) {
        MovableRectangle movable_rectangle = new MovableRectangle(10, 0, 0, 1, 1, 5);
        System.out.println(movable_rectangle);
        movable_rectangle.moveUp();
        movable_rectangle.moveUp();
        movable_rectangle.moveRight();
        System.out.println(movable_rectangle);
        movable_rectangle.moveDown();
        movable_rectangle.moveDown();
        movable_rectangle.moveDown();
        movable_rectangle.moveDown();
        System.out.println(movable_rectangle);
    }
}
