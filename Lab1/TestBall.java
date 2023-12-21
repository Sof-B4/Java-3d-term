package Lab1;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball("yellow", 5);
        Ball b2 = new Ball("green");
        Ball b3 = new Ball(3);
        Ball b4 = new Ball();

        b4.setColor("black");
        b2.setDiametr(10);

        b1.throwBall();
        b2.throwBall();
        b3.throwBall();
        b4.throwBall();
    }
}
