package Lab6;

public class TestFurniture {
    public static void main(String[] args) {
        Wardrobe wardrobe = new Wardrobe("plastic", "white");
        System.out.println(wardrobe);
        wardrobe.set_contained("skeleton");
        System.out.println(wardrobe);

        Table table = new Table("wood", "black", "dinner");

        FurnitureShop furniture_shop = new FurnitureShop();
        furniture_shop.add_furniture(wardrobe);
        furniture_shop.add_furniture(table);
        System.out.println(furniture_shop);
    }
}
