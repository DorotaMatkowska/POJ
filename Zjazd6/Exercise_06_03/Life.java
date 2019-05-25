/*
    Dorota Matkowska
    Aleksander Tyński
    Zadanie 3 lab6
    Klasa Life
     */

public class Life extends Insurance{


    public Life (String insuranceType){
        super(insuranceType);
        setCost();
    }

    public void setCost(){
        this.monthlyPrice = 36;
    }

    public void display(){
        System.out.printf("InsuranceType : %s\nMonthly Price : %.2f\n", insuranceType, monthlyPrice);
    }
}
