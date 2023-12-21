package Lab1;

public class TestDog {
    public static void main(String[] args) {
        Dog d1 = new Dog("Jack", 5);
        Dog d2 = new Dog(1);
        Dog d3 = new Dog("Bob");
        d3.setAge(2);
        d1.allInfo();
        d1.intoHumanAge();
        d2.allInfo();
        d2.intoHumanAge();
        d3.allInfo();
        d3.intoHumanAge();
    }
}
