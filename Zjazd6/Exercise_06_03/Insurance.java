/*
    Dorota Matkowska
    Aleksander Tyński
    Zadanie 3 lab6
    Klasa Insurance
     */

public abstract class Insurance {

    public String insuranceType; //typ ubezpieczenia
    public double monthlyPrice;  //miesięczny koszt


    public Insurance (String insuranceType ){

        this.insuranceType = insuranceType;
    }

    public abstract void setCost();

    public abstract void display();


    public String getInsuranceType(){
        return insuranceType;
    }

    public double getMonthlyPrice(){
        return  monthlyPrice;
    }
}
