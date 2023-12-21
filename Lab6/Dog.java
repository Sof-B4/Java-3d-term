package Lab6;

abstract class Dog {
    private String name;
    private int age;

    Dog() {
        this.name = "unsetted";
        this.age = 1;
        System.out.println("\nDog object with name: " + this.name + " was created");
    }

    Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
        System.out.println("\nDog object with name: " + this.name + " was created");
    }

    public void set_age(int age) {
        if (age > 0 && age < 100) {
            this.age = age;
            System.out.println("Dog age setted as: " + this.age);
        }
    }

    public int get_age() {return this.age;}

    public void set_name(String name) {
        this.name = name;
        System.out.println("Dog name setted as: " + this.name);
    }

    public String get_name() {return this.name;}

    public int get_human_age() {return this.age * 7;}

    public String toString() {
        return "Dog " + this.name + " with age " + this.age;
    }
}


class Hound extends Dog {

    Hound() {
        super.set_name("unsetted");
        super.set_age(1);
        System.out.println("Hound dog object was created");
    }

    Hound(String name, Integer age) {
        super.set_name(name);
        super.set_age(age);
        System.out.println("Hound dog object was created");
    }

    void hunt() {System.out.println("Hound dog now hunting");}

    void persecute() {System.out.println("Hound dog now persecuting someone :)))");}

    public String toString() {
        System.out.println(super.toString());
        return "Dog: Hound";
    }
}
