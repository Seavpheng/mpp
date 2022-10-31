package lab_4.prob4C;

public abstract class Employee {

    public abstract double calcGrossPay();


    public  Paycheck calcCompensation(int month, int year){
        double grossPay = calcGrossPay();
        Paycheck paycheck = Paycheck.calcPaycheck(grossPay);

        return paycheck;
    }

}
