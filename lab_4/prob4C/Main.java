package lab_4.prob4C;

import java.lang.invoke.SerializedLambda;

public class Main {
    public static void main(String[] args) {

        Employee[] obj = {new Hourly( "Sena", 25, 40),
                //new Hourly("Sunda", 20, 30),

                new Commissioned( "SALAM", 1800, .05,12,2022),
//                new Commissioned( "SAL", 2000, .05,12,2022),
//                new Commissioned( "SAAM", 2800, .05,12,2022),
//                new Commissioned( "SAM", 1200, .05,12,2022),
                new Salaried( "Sea", 2500),
//                new Salaried( "Sna", 2500),
//                new Salaried( "Snaa", 2500),
//                new Salaried( "Se", 2500),



        };


        double sum = 0;
        for(Employee e : obj){
            Paycheck p =  e.calcCompensation(1, 2002);

            System.out.println(e.toString() +" Gross wage: " + p.getGrossPay());
            System.out.println("   FICA: " + p.getFICA());
            System.out.println("   STATE: " + p.getState());
            System.out.println("   LOCAL: " + p.getLocal());
            System.out.println("   MEDICAL: " + p.getMedical());
            System.out.println("   SOCIAL SECURITY: " + p.getSocialSecurity());
        }

       // Commissioned commissioned = new Commissioned(2,10, 1000,List.of(new Order(123, LocalDate.of(2021, 1, 1), 1000, ?)));

    }
}
