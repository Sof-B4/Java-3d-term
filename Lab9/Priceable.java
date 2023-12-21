package Lab9;

public interface Priceable {
    String getPrice();
    void setPrice(String name);
}

class Sweets implements Priceable {
    protected String name;
    protected String price;

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getPrice() {return price;}
    public void setPrice(String price) {this.price = price;}
}

class Perfume implements Priceable {
    protected String name;
    protected String price;

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public String getPrice() {return price;}
    public void setPrice(String price) {this.price = price;}
}