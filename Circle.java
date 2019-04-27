package Exercise_04_04;

public class Circle extends Shape {

    private double radius;
    final double pi = Math.PI;

    public Circle() {
        radius = 1.0;
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String colour, boolean filled){

    }


    public double getradius(){
        return radius;
    }

    public void setradius(double radius){
        this.radius = radius;
    }
        public double getarea() {

            return pi * Math.pow(radius, 2);
         }

         public double getperimeter() {
        return 2 * pi * radius;
    }


}