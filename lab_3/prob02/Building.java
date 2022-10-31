package lab_3.prob02;

import java.util.*;

public class Building {
    private double maintanenceCost;
    private List<Apartment> apartments;

    public Building(double maintanenceCost, double size)
    {
        this.maintanenceCost = maintanenceCost;
        apartments = new ArrayList<Apartment>();
    }

    public double getMaintanenceCost(){
        return maintanenceCost;
    }

    public void addApartment(Apartment apart){
        apartments.add(apart);
    }

    public List<Apartment> getApartment(){
        return apartments;
    }

    public double SumRent(){
        double sum = 0;
        for(Apartment a :apartments){
            sum += a.getRent();
        }

        return sum;
    }


}
