package Lab4;

public class Human {
    private String name;
    private int age;

    Human(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Человек родился");
    }

    void display_info() {
        System.out.println("Имя: " + this.name + "; возраст: " + this.age);
    }

    String get_name() {return this.name;}

    void set_name(String name) {this.name = name;}

    int get_age() {return this.age;}

    void set_age(int age) {
        if (0 < age && age < 100) this.age = age;
    }

    public String toString() {return this.name;}

    //Класс голова
    class Head {
        private boolean is_sleeping = false;

        void think() {System.out.println(name + " думает");}

        void sleep(boolean is_sleeping) {
            this.is_sleeping = is_sleeping;
            if (this.is_sleeping) System.out.println(name + " спит");
            else System.out.println(name + " бодрствует");
        }
    }

    //Класс нога
    class Leg {
        void move() {System.out.println(name + " двигает ногой");}
    }

    //Класс рука
    class Hand {
        private String item_in_hand;

        void move() {System.out.println(name + " двигает рукой");}

        void hold_item(String item) {
            this.item_in_hand = item;
            System.out.println(name + " держит " + this.item_in_hand);
        }

        void drop_item() {
            if (item_in_hand != null) {
                System.out.println(name + " положил " + this.item_in_hand);
                this.item_in_hand = null;
            }
            else{System.out.println(name + " все еще держит");}
        }
    }
}


