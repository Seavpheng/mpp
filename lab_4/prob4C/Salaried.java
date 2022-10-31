package lab_4.prob4C;

public class Salaried extends Employee {
    private double salary;

    private String name;

    public Salaried(String name, double salary){
        this.name = name;
        this.salary = salary;

    }

    @Override
    public double calcGrossPay() {
        return salary;
    }


    public String toString()
    {
        return name;
    }
}
