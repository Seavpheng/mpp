package lab_8.prob_1;

import java.util.function.Supplier;

public class Main {

    public static void main(String[] args){

        Supplier<Double> d = Math::random;

        var supplier = new Supplier<Double>() {
            @Override
            public Double get() {
                return Math.random();
            }
        };

        System.out.println(supplier.get());
    }
}
