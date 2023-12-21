package Lab9;

public class TestNameable {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.setName("Polina");
        System.out.println("Human name is " + h1.getName());
        Planet p1 = new Planet();
        p1.setName("Earth");
        System.out.println("Planet is " + p1.getName());
    }
}
