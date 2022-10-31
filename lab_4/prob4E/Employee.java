package lab_4.prob4E;

import java.util.*;

public class Employee {
    private String name;
    private List<Account> accounts;

    public Employee(String name){
        this.name = name;
        accounts = new ArrayList<Account>();
    }

    public void addAccount(Account a)
    {
        accounts.add(a);
    }

    public String getName(){
        return name;
    }

    public double computeUpdatedBalanceSum(){
        double sum =0;
        for(Account a: accounts){
            sum += a.computeUpdatedBalance();
        }
        return sum;
    }


}
