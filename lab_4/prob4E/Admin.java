package lab_4.prob4E;

import java.util.*;

public class Admin {
    public static double computeUpdatedBalanceSum(List<Employee> lst){
        double sum=0;
        for(Employee e: lst){
            sum += e.computeUpdatedBalanceSum();
        }
        return  sum;
    }
}
