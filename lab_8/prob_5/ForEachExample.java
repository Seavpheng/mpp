package lab_8.prob_5;



import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachExample {

    public static void main(String[] args){
        List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon",
                "Away", "On Vacation", "Everywhere you want to be");

        //Use a lambda express instead of directly definind a consumer
        list.forEach(x->{
            System.out.println(x.toUpperCase());
        });

        //Use a method reference in place of your lambda expression in (a)
        list.forEach(ForEachExample::accept);

    }

    private static void accept(String x) {
        System.out.println(x.toUpperCase());
    }
}
