package Lab9;

public interface Nameable {
    String getName();
    void setName(String name);
}

class Human implements Nameable {
    protected String name;

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
}

class Planet implements Nameable {
    private String name;

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
}