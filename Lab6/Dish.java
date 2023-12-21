package Lab6;

abstract class Dish {
    protected String material;
    protected String color;
    protected String contains;

    Dish() {
        this.material = "unsetted";
        this.color = "unsetted";
        this.contains = "nothing";
        System.out.println("\nDish abstract object was created");
    }

    Dish(String material, String color, String contains) {
        this.material = material;
        this.color = color;
        this.contains = contains;
        System.out.println("\nDish abstract object was created");
    }

    public String get_material() {return this.material;}

    public void set_material(String material) {this.material = material;}

    public String get_сolor() {return this.color;}

    public void set_сolor(String color) {this.color = color;}

    public String get_contained() {return this.contains;}

    public void set_contained(String contains) {
        this.contains = contains;
        System.out.println("Dish contains now: " + this.contains);
    }

    public String toString() {
        return "Dish object: material: " + this.material + ", color: " + this.color + ", contains: " + this.contains;
    }
}


class Plate extends Dish {
    protected double radius;

    Plate() {
        super.set_сolor("white");
        super.set_material("porcelain");
        this.radius = 1;
        System.out.println("Plate object was created");
    }

    Plate(double radius) {
        super.set_сolor("white");
        super.set_material("porcelain");
        this.radius = radius;
        System.out.println("Plate object was created");
    }

    Plate(double radius, String color, String material, String contains) {
        super.set_сolor(color);
        super.set_material(material);
        super.set_contained(contains);
        this.radius = radius;
        System.out.println("Plate object was created");
    }

    double get_radius() {return this.radius;}

    void set_radius(double radius) {
        if (radius > 0) {
            this.radius = radius;
            System.out.println("Plate radius setted as: " + this.radius);
        } else {
            System.out.println("Plate radius must be > 0");
        }
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Dish: Plate, radius: " + this.radius;
    }
}


class Teapot extends Dish {
    protected double volume;

    Teapot() {
        super.set_сolor("white");
        super.set_material("porcelain");
        super.set_contained("tea");
        this.volume = 0.0;
        System.out.println("Teapot object was created");
    }

    Teapot(String color, String material, String contains, double volume) {
        super.set_сolor(color);
        super.set_material(material);
        super.set_contained(contains);
        this.volume = volume;
        System.out.println("Teapot object was created");
    }

    void pour() {
        this.volume -= 0.2;
        System.out.println("Teapot poured one cup of " + super.get_contained());
    }

    void pour_out() {
        this.volume = 0.0;
        System.out.println("Teapot poured out all " + super.get_contained());
        super.set_contained("nothing");
    }

    double get_volume() {return this.volume;}

    void set_volume(double volume) {
        if (volume > 0 && volume < 10) {
            this.volume = volume;
            System.out.println("Teapot volume setted as: " + this.volume);
        } else {
            System.out.println("Teapot volume must be > 0");
        }
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Dish: Teapot, volume: " + this.volume;
    }
}


