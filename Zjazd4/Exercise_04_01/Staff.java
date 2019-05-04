package Exercise_04_01;

/*Zadanie_04_01

    Autorzy: Dorota Matkowska
             Aleksander Ostasz
 */

public class Staff extends Person {

    private String school;
    private double pay;

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public String toString() {
        return "Person[name=" + getname() + ", address=" + getadress() + ", school=" + pay + ", pay=" + pay;
    }
}