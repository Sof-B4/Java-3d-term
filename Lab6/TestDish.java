package Lab6;

public class TestDish {
    public static void main(String[] args) {
        Plate plate = new Plate(4);
        System.out.println(plate);
        plate.set_contained("Lunch");
        System.out.println(plate);

        Teapot teapot = new Teapot("black", "plastic", "tea", 2);
        System.out.println(teapot);
        teapot.pour();
        System.out.println(teapot);
        teapot.pour_out();
        System.out.println(teapot);
    }
}
