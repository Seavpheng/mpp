package lab_9.prob_11b;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LambdaLibrary {
    public static final Function<List<Employee>, String> getEmployeeWithHigherSalary = (list)->{
         return list.stream()
                .filter(x->x.salary > 100000)
                .filter(x->x.lastName.charAt(0) >= 'M' && x.lastName.charAt(0) <= 'Z')
                .map(x->x.firstName +" " + x.lastName)
                .sorted()
                .collect(Collectors.joining(", "));
    };
}
