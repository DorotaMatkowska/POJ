package Exercise_03_05;

/*
Dorota Matkowska
zadanie 5
*/
public class Main
{
    public static void main(String[] args) {
        Time s1 = new Time(10,65,24);
        System.out.println("Czas ustawiony: "+s1.toString());
        System.out.println("Sekunda dalej: "+s1.nextSecond());
    }
}