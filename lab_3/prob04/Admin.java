package lab_3.prob04;

public class Admin {
    public static double computeTotalRent(Properties[] prop){
        double total = 0;
        for(Properties p : prop){
            total += p.rent();
        }
        return total;
    }

    public static String listProperties(Properties[] prop, String city)
    {
        StringBuilder result = new StringBuilder();
        for(Properties p : prop){
            if(city.equals(p.getCity())){
                result.append(p.toString());
            }
        }

        return result.toString();
    }

}
