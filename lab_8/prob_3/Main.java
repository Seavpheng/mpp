package lab_8.prob_3;

import java.util.function.BiFunction;
import java.util.*;

public class Main {
    public static void main(String[] args){
        BiFunction<Double, Double, List<Double>> b = (x, y)->{
            List<Double> lst = new ArrayList<>();
            lst.add(Math.pow(x,y));
            lst.add(x * y);
            return lst;
        };

        System.out.println(b.apply(12.0, 3.0));
    }
}
