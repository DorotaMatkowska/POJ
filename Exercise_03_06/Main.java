package Exercise_03_06;

/*
Dorota Matkowska
zadanie 6
 */

import java.util.ArrayList;
import java.util.List;

public class Main{

    public static void main(String[] args) {
        List<String> name = new ArrayList<String>();
        name.add("Dorota");
        name.add("Ania");
        name.add("Iwona");
        name.add("Klaudia");
        name.add("Martyna");
        name.add("Daniel");
        name.add("Karolina");
        name.add("Elena");

        List<String> salary = new ArrayList<String>();
        salary.add("3800");
        salary.add("1500");
        salary.add("2400");
        salary.add("5000");
        salary.add("6000");
        salary.add("8000");
        salary.add("2300");
        salary.add("4500");

        List<String> date = new ArrayList<String>();
        date.add("23/03/1994");
        date.add("13/02/1999");
        date.add("14/03/1989");
        date.add("22/10/1980");
        date.add("26/09/1999");
        date.add("15/08/2000");
        date.add("10/04/1992");
        date.add("03/07/1998");

        for(int i=0;i<name.size();i++){
            System.out.print(name.get(i)+ " " +salary.get(i)+" ");
            System.out.println(date.get(i));
        }

    }
}