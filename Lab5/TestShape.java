package Lab5;

//При написании определенных строчек кода возникают ошибки: есть методы,
//не принадлежащие определенному классу (то есть они принадлежат другому
//классу); есть строка, в которой попытка создания объекта абстрактного класса.

public class TestShape {
    public static void main(String[] args) {
        /*Shape s1 = new Circle(5.5, "RED", false);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        System.out.println(s1.getRadius()); //getRadius() - ошибка

        Circle c1 = (Circle)s1; // downcast back to Circle System.out.println(c1); System.out.println(c1.getArea()); System.out.println(c1.getPerimeter()); System.out.println(c1.getColor()); System.out.println(c1.isFilled()); System.out.println(c1.getRadius());
        Shape s2 = new Shape(); //конструктор ошибка
        Shape s3 = new Rectangle(1.0, 2.0, "RED", false); // upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        System.out.println(s3.getLength()); //getLength() - ошибка
        Rectangle r1 = (Rectangle)s3;
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());
        Shape s4 = new Square(6.6);

        Square sq1 = (Square)r2; //r2 - ошибка
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());*/

        // Circle class test
        Circle circle = new Circle(5.4, "black", true);
        System.out.println(circle);

        // Rectangle class test
        Rectangle rectangle = new Rectangle(5.4 , 4.5);
        System.out.println("Rectanle area: " + rectangle.getArea());
        System.out.println(rectangle);

        // Square class test
        Square square = new Square(10, "white", false);
        square.setSide(11);
        System.out.println(square);
    }
}
