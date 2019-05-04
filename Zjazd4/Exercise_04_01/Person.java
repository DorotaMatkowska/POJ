package Exercise_04_01;

/*Zadanie_04_01

    Autorzy: Dorota Matkowska
             Aleksander Ostasz
 */



public class Person {

    private String name;
    private String adress;

    public Person (String name, String adress){

        this.name = name;
        this.adress = adress;
    }
    public String getname(){
        return name;
    }

    public String getadress(){
        return adress;
    }

    public void setadress(String adress){
        this.adress = adress;
    }

    public String toString(){
        return "Person[name =  "+name+"    adress = "+adress;
    }


}