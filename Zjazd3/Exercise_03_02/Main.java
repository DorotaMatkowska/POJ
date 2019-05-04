package Exercise_03_02;

/*
Dorota Matkowska
zadanie 2
 */

public class Main {

    public static void main(String[] args) {


        Item Spodnie = new Item("spodnie", "Niebieskie spodnie", 10, 2000);
        System.out.println("Test wyswietli " + spodnie.toString());

        Item kapelusz = new Item("kapelusz", "Słomkowy kapelusz", 5, 150);
        System.out.println("Test wyswietli " + kapelusz.getTotal());
    }
}