package Triangle;

//*******************************************************************
// Autorzy: Dorota Matkowska
//   		Martyna Klebba
//			reprezentacja trojkata
//*******************************************************************

import java.lang.Math;

public class trojkat{
    private int a;
    private int b;
    private int c;
    public trojkat (int a, int b, int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public int geta()
    {
        return a;
    }
    public int getb ()
    {
        return b;
    }
    public int getc()
    {
        return c;
    }
    public double getpole(){
        double p,g;
        p=(a+b+c)/2;
        g=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return g;
    }
    public int getobwod ()
    {
        int h;
        h=a+b+c;
        return h;
    }
    public boolean isEquilateral(){
        if(a==b&&b==c) return true;
        else return false;
    }
    public boolean islsosceles(){
        if(a==b||b==c||a==c) return true;
        else return false;
    }
    public boolean isScalene(){
        if(a!=b&&b!=c&&a!=c) return true;
        else return false;
    }
    public boolean istrindle(){
        if(a+b<=c||b+c<=a||a+c<=b) return false;
        else return true;
    }
}


