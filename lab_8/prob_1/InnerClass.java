package lab_8.prob_1;

import java.util.function.Supplier;

public class InnerClass {

    public static void main(String[] args) {
        MyRandom m= new InnerClass().new MyRandom();
        System.out.println(m.get());
    }

    class MyRandom implements Supplier<Double>{
        @Override
        public Double get() {
            return Math.random();
        }
    }
}
