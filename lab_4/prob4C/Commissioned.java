package lab_4.prob4C;

import java.time.LocalDate;
import java.util.*;

public class Commissioned extends Employee{
    private double commission;
    private double baseSalary;

    private int month, year;

    private String name;

    public Commissioned(String name, double baseSalary, double commission, int month, int year)
    {
        this.name = name;
        this.baseSalary = baseSalary;
        this.commission = commission;
        this.month = month;
        this.year = year;
    }


    public double calcGrossPay(){
        LocalDate curDate = LocalDate.of(year, month, 1);
        LocalDate previousDate = curDate.minusMonths(1);
        double amtSold = new Order().getOrderAmount(previousDate);

        return  (commission * amtSold) + baseSalary;
    }

    public String toString()
    {
        return name;
    }




}
