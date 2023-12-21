package Lab5;

public abstract class Shape {
    private String color;
    private boolean filled;

    Shape() {System.out.println("\nShape abstract object was created");}

    Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        System.out.println("\nShape abstract object was created");
    }

    String getColor() {return this.color;}

    void setColor(String color) {
        this.color = color;
        System.out.println("Shape color setted as: " + this.color);
    }

    boolean isFilled() {return this.filled;}

    void setFilled(boolean filled) {
        this.filled = filled;
        System.out.println("Shape filledness setted as: " + this.filled);
    }

    abstract double getArea();

    abstract double getPerimeter();
    public String toString() {
        return "Shape object: is filled: " + this.filled + ", color: " + this.color;
    }
}

class Circle extends Shape {
    protected double radius;

    Circle() {
        super.setColor("blue");
        super.setFilled(false);
        this.radius = 1;
        System.out.println("Circle object was created");
    }

    Circle(double radius) {
        super.setColor("blue");
        super.setFilled(false);
        this.radius = radius;
        System.out.println("Circle object was created");
    }

    Circle(double radius, String color, boolean filled) {
        super.setColor(color);
        super.setFilled(filled);
        this.radius = radius;
        System.out.println("Circle object was created");
    }

    double getRadius() {return this.radius;}

    void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
            System.out.println("Circle radius setted as: " + this.radius);
        } else {
            System.out.println("Circle radius must be > 0");
        }
    }

    @Override
    double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Shape: circle, radius: " + this.radius;
    }
}

class Rectangle extends Shape {
    protected double width;
    protected double length;

    Rectangle() {
        super.setColor("blue");
        super.setFilled(false);
        System.out.println("Rectangle object was created");
    }

    Rectangle(double width, double length) {
        super.setColor("blue");
        super.setFilled(false);
        this.width = width;
        this.length = length;
        System.out.println("Rectangle object was created");
    }

    Rectangle(double width, double length, String color, boolean filled) {
        super.setColor("blue");
        super.setFilled(false);
        this.width = width;
        this.length = length;
        System.out.println("Rectangle object was created");
    }

    double getWidth() {return this.width;}

    void setWidth(double width) {
        if (width > 0) {
            this.width = width;
            System.out.println("Rectangle width setted as: " + this.width);
        } else {
            System.out.println("Rectangle width must be > 0");
        }
    }

    double getLength() {return this.length;}

    void setLength(double length) {
        if (length > 0) {
            this.length = length;
            System.out.println("Rectangle length setted as: " + this.length);
        } else {
            System.out.println("Rectangle length must be > 0");
        }
    }

    @Override
    double getArea() {return this.length * this.width;}

    @Override
    double getPerimeter() {return 2 * (this.length + this.width);}

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Shape: rectangle, length: " + this.length + ", width: " + this.width;
    }
}

class Square extends Rectangle{

    Square() {
        super.setColor("blue");
        super.setFilled(false);
        System.out.println("Square object was created");
    }

    Square(double side) {
        super.setColor("blue");
        super.setFilled(false);
        this.width = side;
        this.length = side;
        System.out.println("Square object was created");
    }

    Square(double side, String color, boolean filled) {
        super.setColor("blue");
        super.setFilled(false);
        this.width = side;
        this.length = side;
        System.out.println("Square object was created");
    }

    double getSide() {return this.width;}

    void setSide(double side) {
        if (side > 0) {
            this.width = side;
            this.length = side;
            System.out.println("Square side setted as: " + this.width);
        } else {
            System.out.println("Square side must be > 0");
        }
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "Shape: square, side: " + this.width;
    }
}