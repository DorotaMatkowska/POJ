package Exercise_04_04;

import org.w3c.dom.css.Rect;

public class Rectangle extends Shape {

    private double width;
    private double length;

    public Rectangle(){
        width = 1.0;
        length = 1.0;
    }

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;

    }

    public Rectangle(double width, double length, String colour, boolean filled){

    }

    public double getwidth(){
        return width;

    }

    public void setWidth(){
        this.width = width;
    }

    public double getlength(){
        return length;
    }

    public void setLength(){
        this.length = length;
    }


    public double getarea() {
        return width * length;
    }

    public double getperimeter() {
        return 2 * (width + length);
    }

}
