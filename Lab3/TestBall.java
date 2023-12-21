package Lab3;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(15, 15);
        System.out.println(b1);
        b1.move(25, 10);
        System.out.println(b1);
        b1.move(10, 5);
        System.out.println(b1);
    }
}
