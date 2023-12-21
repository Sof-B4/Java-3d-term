package Lab4;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(7.5);
        System.out.println(circle.toString() + "; площадь окружности: " + String.format("%.3f", circle.get_area()));
        circle.set_radius(123.2);
        System.out.println(circle.toString() + "; площадь окружности: " + String.format("%.3f", circle.get_area()));
    }
}
