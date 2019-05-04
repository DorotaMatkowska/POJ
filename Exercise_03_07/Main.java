package Exercise_03_07;

/*
Dorota Matkowska
zadanie 7
*/

public class Main {

    public static void main(String[] args) {
        Palindrom n1= new Palindrom("Atak kata");
        Palindrom n2= new Palindrom("Muzo, raz daj jad za rozum");
        Palindrom n3= new Palindrom("Wódy żal dla żydów");
        System.out.println(n1.getPalindrom()+" "+n1.sprawdz());
        System.out.println(n2.getPalindrom()+" "+n2.sprawdz());
        System.out.println(n3.getPalindrom()+" "+n3.sprawdz());
    }
}
