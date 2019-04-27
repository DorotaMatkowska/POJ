package Szyfr_Cezara;

/*
Autorzy:
        Dorota Matkowska
        Martyna Klebba
     zadanie szyfr Cezara
 */
package cezar;





public class Cezar {

    static String cezar (String wartosc, int zmiana) {
        char [] buffer = wartosc.toCharArray ();


        for (int i = 0; i <buffer.length; i ++) {

            char letter = buffer [i];
            letter = (char) (letter + zmiana);
            if (letter> 'z') {
                letter = (char) (letter - 26);
            } else if (letter <'a') {
                letter = (char) (letter + 26);
            }
            buffer [i] = letter;
        }
        return new String (buffer);
    }

    public static void main (String [] args) {

        System.out.println ("Martyna");
        System.out.println ("Klebba");
        String a = cezar ("Martyna", 4);
        String b = cezar ("Klebba", 4);
        System.out.println (a);
        System.out.println (b);
        System.out.println ("Dorota");
        System.out.println ("Matkowska");
        String d = cezar ("Dorota", 4);
        String e = cezar ("Matkowska", 4);
        System.out.println (d);
        System.out.println (e);
    }
}