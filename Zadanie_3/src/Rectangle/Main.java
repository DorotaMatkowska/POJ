package Rectangle;

//*******************************************************************
// Autorzy: Dorota Matkowska
//   		Martyna Klebba
//			reprezentacja prostokąta
//*******************************************************************

import java.lang.Math;


public class Rectangle {
    private double lengthA;
    private double widthB;

    public Rectangle(double lengthA, double widthB) {
        this.sideA = lengthA;
        this.sideB = widthB;
    }

    public double getlengthA() {
        return lengthA;
    }

    public double getwidthB() {
        return witdhB;
    }

    public double getArea() {
        return lengthA * widthB;
    }

    public double getPerimeter() {
        return 2 * lengthA + 2 * widthB;
    }

    public double getDiagonal() {
        return Math.sqrt(lengthA * lengthA + widthB * widthB);
    }
}
    public static void main(String[] args){

        Rectangle zadanie = new Rectangle(5,5);
    }
}
