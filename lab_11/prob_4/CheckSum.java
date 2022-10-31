package lab_11.prob_4;


import java.util.*;
import java.util.Collection;

public class CheckSum {
    public static double sum(Collection<? extends Number> nums){
        double s = 0.0;
        for (Number num: nums)
            s += num.doubleValue();

        return s;
    }


    public static void main(String[] arg){

        List<? extends Integer> intList = new ArrayList<>();

        List<? extends Number> x = intList;//new ArrayList<>();


        //x.add(12);



        /*
        List<Integer> ints = new ArrayList<>(); ints.add(1);
        ints.add(2);
        List<? extends Number> nums = ints; double dbl = sum(nums);
        nums.add(3.14);   //COMPILER ERROR! upper bounce cannot be added
        */


/*
        List<Object> objs = new ArrayList<>();
        objs.add(1);
        objs.add("two");
        List<? super Integer> ints = objs;
        ints.add(3);
        double dbl = sum(ints);  // COMPILER ERROR!

*/
       Collection<Number> numbers = new HashSet<>();
       numbers.add(10);
       numbers.add(20);
        numbers.add(5);
        numbers.add(5);
        numbers.add(20);

        sumCount(numbers, 5);

        System.out.println(sumCount(numbers, 10));
    }

    public static double sumCount(Collection<Number> nums, int n) {
        count(nums, n);
        return sum(nums);
    }

    private static int count(Collection<Number> nums, int n) {

        int count =0;
        for(Number nu : nums){
            if(nu.equals(n)){
                count++;
            }
        }

        return count;
    }
}

