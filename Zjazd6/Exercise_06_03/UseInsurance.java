/*
    Dorota Matkowska
    Aleksander Tyński
    Zadanie 3 lab6
    Klasa UseInsurance
     */

import java.util.Scanner;

public class UseInsurance {

    public static void main (String[] args){

        Insurance insurance;
        Scanner input = new Scanner(System.in);
        String str = input.next();
        if(str.equals("1")){
            insurance = new Health("Health Insurance");
            insurance.display();
        } else if(str.equals("2")){
            insurance = new Life("Life Insurance");
            insurance.display();
        } else {
            System.out.println("Invalid insurance type input should be either 1 or 2");
        }
    }
}
