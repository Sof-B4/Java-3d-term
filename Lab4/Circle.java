package Lab4;

public class Circle {
    double radius;
    double diametr;

    Circle(double radius) {
        this.radius = radius;
        this.diametr = this.radius * 2;
        System.out.println("Окружность создана");
    }

    double get_radius() {return this.radius;}

    void set_radius(double radius) {
        this.radius = radius;
        this.diametr = this.radius * 2;
        System.out.println("Радиус окружности установлен и равен " + this.radius);
    }

    double get_area() {
        return Math.PI * this.radius * this.radius;
    }

    public String toString() {
        return "Радиус окружности: " + this.radius + "; диаметр: " + this.diametr;
    }
}
