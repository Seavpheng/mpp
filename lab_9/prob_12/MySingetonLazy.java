package lab_9.prob_12;

import java.util.Optional;
import java.util.function.Supplier;

public class MySingetonLazy  {
    private static MySingetonLazy instance = null;
    private static int count;
    private MySingetonLazy(){
        count++;
    }

    public static MySingetonLazy getInstance() {
        return Optional
                .ofNullable(instance)
                .orElseGet(()->setAndGet());
    }

    private static MySingetonLazy setAndGet(){
        instance = new MySingetonLazy();
        return instance;
    }

    public static void main(String[] arg){
        for(int i = 0; i<10; i++){
            getInstance();
        }
        System.out.println(count);
    }



}
