package Staff;

public abstract class Employee {

    private String name;
    private String nationalInsurance;
    private int salary;

    public Employee(String name, String nationalInsurance, int salary){
        this.name = name;
        this.nationalInsurance = nationalInsurance;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNationalInsurance() {
        return nationalInsurance;
    }

    public int getSalary() {
        return salary;
    }

//    Add a method named raiseSalary
//    with takes in a parameter of type double
//    to increment the salary.

    public void raiseSalary(double increment){
        salary += increment;
    }

//    Add a method called payBonus which returns 1% of the employees salary.

    public double payBonus(){
        return this.getSalary() / 100;
    }
}

