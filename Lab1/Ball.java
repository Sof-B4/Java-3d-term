package Lab1;

public class Ball {
    private String color;
    private int diametr;

    public Ball(String color, int diametr) {
        this.color = color;
        this.diametr = diametr;
    }

    public Ball(String color) {
        this.color = color;
        diametr = 1;
    }

    public Ball(int diametr) {
        color = "blue";
        this.diametr = diametr;
    }

    public Ball() {
        color = "red";
        diametr = 100;
    }

    public void setColor(String newColor) {color = newColor;}
    public void setDiametr(int newDiametr) {diametr = newDiametr;}

    public String getColor() {return color;}
    public int getDiametr() {return diametr;}

    public String allInfo() {return diametr + ", color " + color;}

    public void throwBall() {
        System.out.println("Ball is thrown. It's diametr is " + diametr + " and color is " + color);
    }
}
