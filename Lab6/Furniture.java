package Lab6;
import java.util.*;

abstract class Furniture {
    protected String material;
    protected String color;

    Furniture() {
        this.material = "unsetted";
        this.color = "unsetted";
        System.out.println("\nFurniture abstract object was created");
    }

    Furniture(String material, String color) {
        this.material = material;
        this.color = color;
        System.out.println("\nFurniture abstract object was created");
    }

    public String get_material() {return this.material;}

    public void set_material(String material) {this.material = material;}

    public String get_сolor() {return this.color;}

    public void set_сolor(String color) {this.color = color;}

    public String toString() {
        return "Furniture object: material: " + this.material + ", color: " + this.color;
    }
}


class Wardrobe extends Furniture {
    protected String contains;

    Wardrobe() {
        super.set_material("wood");
        super.set_сolor("brown");
        this.contains = "nothing";
        System.out.println("\nWardrobe object was created");
    }

    Wardrobe(String material, String color) {
        super.set_material(material);
        super.set_сolor(color);
        this.contains = "nothing";
        System.out.println("\nWardrobe object was created");
    }

    Wardrobe(String material, String color, String contains) {
        super.set_material(material);
        super.set_сolor(color);
        this.contains = contains;
        System.out.println("\nWardrobe object was created");
    }

    public String get_contained() {return this.contains;}

    public void set_contained(String contains) {
        this.contains = contains;
        System.out.println("Wardrobe contains now: " + this.contains);
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Wardrobe object: contains: " + this.contains;
    }
}


class Table extends Furniture {
    protected String contains;

    Table() {
        super.set_material("wood");
        super.set_сolor("brown");
        this.contains = "nothing";
        System.out.println("\nTable object was created");
    }

    Table(String material, String color) {
        super.set_material(material);
        super.set_сolor(color);
        this.contains = "nothing";
        System.out.println("\nTable object was created");
    }

    Table(String material, String color, String contains) {
        super.set_material(material);
        super.set_сolor(color);
        this.contains = contains;
        System.out.println("\nTable object was created");
    }

    public String get_contained() {return this.contains;}

    public void set_contained(String contains) {
        this.contains = contains;
        System.out.println(this.contains + " on table now");
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Table object: on table: " + this.contains;
    }
}



class FurnitureShop {
    private List<Furniture> furniture_shop_array = new ArrayList<Furniture>();

    {
        System.out.println("\nFurniture shop object was created");
    }

    public void add_furniture(Furniture furniture) {
        this.furniture_shop_array.add(furniture);
        System.out.println(furniture + ". This furniture added into the furniture shop successfully");
    }

    public void add_furnitures(Furniture furniture_array[]) {
        this.furniture_shop_array.addAll(new ArrayList<Furniture>(Arrays.asList(furniture_array)));
        System.out.println("Furnitures: " + Arrays.toString(furniture_array) + " added into the furniture shop successfully");
    }

    public String toString() {
        if (!this.furniture_shop_array.isEmpty())
            return "Furniture shop: " + this.furniture_shop_array;
        else
            return "Furniture shop empty!";
    }
}
