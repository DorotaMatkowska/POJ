package Exercise_04_04;

/*Zadanie_04_04

    Autorzy: Dorota Matkowska
             Aleksander Ostasz
 */

public class Circle extends Shape {

    private double radius;
    final double pi = Math.PI;

    public Circle() {
        radius = 1.0d;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String colour, boolean filled) {
        super(colour, filled);
        this.radius = radius;
    }

    public double getradius() {
        return radius;
    }

    public void setradius(double radius) {
        this.radius = radius;
    }

    public double getarea() {

        return pi * Math.pow(radius, 2);
    }

    public double getperimeter() {
        return 2 * pi * radius;
    }

    public String toString()
    {
        return "Circle = [Color = "+getcolour()+", filled = "+isFilled()+", radius = "+radius+"]";
    }
}
