package Exercise_03_01;

/*
Dorota Matkowska
zadanie 1
*/


public class Employee {

    private int id;
    private String firstname;
    private String lastname;
    private int salary;

    public Employee(int id, String firstname, String lastname, int salary) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;

    }

    public int getid() {
        return id;
    }

    public String firstname() {
        return firstname;
    }

    public String getlastname() {
        return lastname;
    }

    public String getName() {
        return firstname + lastname;
    }

    public int getsalary() {
        return salary;
    }

    public void setsalary(int salary) {
        this.salary = salary;
    }

    public int getannualSlary() {
        return salary * 12;
    }

    public int raiseSalary(int percent) {
        return salary * percent;
    }

    public String toString() {
        return "Employee[id= " + id + " name " + firstname + lastname + " salary " + salary + "]";
    }
}