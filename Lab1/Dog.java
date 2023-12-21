package Lab1;

public class Dog {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Dog(String name) {
        this.name = name;
        age = 0;
    }

    public Dog(int age) {
        name = "Bim";
        this.age = age;
    }

    public Dog() {
        name = "Sharik";
        age = 0;
    }

    public void setName(String newName) {name = newName;}
    public void setAge(int newAge) {age = newAge;}

    public String getName() {return name;}
    public int getAge() {return age;}

    public void allInfo() {System.out.println(name + ", age: " + age);}

    public void intoHumanAge() {
        System.out.println(name + "'s age in human years is " + age*7 + " years");
    }
}
