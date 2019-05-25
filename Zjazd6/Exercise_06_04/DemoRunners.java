/*
Autorzy: Aleksander Tyński
        Dorota Matkowska
   Zadanie 4 - Runner
   Lab 6
*/


import java.util.Scanner;

public class DemoRunners {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Choose a Runner (Machine/Athlete/Political Candidate) >> ");
        String typ = input.next();
        switch (typ) {
            case "Machine": {
                Machine maszyna= new Machine();
                maszyna.run();
                break;
            }
            case "Athlete": {
                Athlete biegacz = new Athlete();
                biegacz.run();
                break;
            }
            case "Political Candidate": {
                 PoliticalCandidate klamca = new PoliticalCandidate();
                klamca.run();
                break;
            }
            default: {
                System.out.println("Wrong type of insurance. Try again later.");
                break;
            }
        }
        input.close();
    }
}
