package lab_4.prob4C;

public class Hourly extends Employee{
    private double hourlyWage;
    private double hoursPerWeek;

    private String name;
    public Hourly(String name, double hourlyWage, double hoursPerWeek){
        this.name = name;
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }

    public double calcGrossPay(){
        return hourlyWage * hoursPerWeek;
    }

    public String toString()
    {
        return name;
    }

}
