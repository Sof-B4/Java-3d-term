package Lab9;

public class TestPriceable {
    public static void main(String[] args) {
        Sweets sweet1 = new Sweets();
        sweet1.setName("chocolate");
        sweet1.setPrice("200");
        System.out.println("Sweets is " + sweet1.getName() + ", price: " + sweet1.getPrice() + " rub.");

        Perfume perfume1 = new Perfume();
        perfume1.setName("Molekula 05");
        perfume1.setPrice("10000");
        System.out.println("Sweets is " + perfume1.getName() + ", price: " + perfume1.getPrice() + " rub.");
    }
}