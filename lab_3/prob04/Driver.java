package lab_3.prob04;

import java.util.Arrays;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        Properties[] objects = {new House("Chicago", 9000), new Condo("Chicago", 2), new Trailer("Fairfield")};
        double totalRent = Admin.computeTotalRent(objects);
        System.out.println(totalRent);

        // list properties in City
        String  listProp = Admin.listProperties(objects, "Chicago");
        System.out.println(listProp);
    }
}
