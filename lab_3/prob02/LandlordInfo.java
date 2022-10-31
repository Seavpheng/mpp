package lab_3.prob02;

import java.util.*;

public class LandlordInfo {
    private List<Building> buildings;

    public LandlordInfo(){
        buildings = new ArrayList<Building>();
    }

    public void addBuilding(Building b){
        buildings.add(b);
    }

    public double calcProfits(){
        double profit = 0;
        for(Building b:  buildings){
           profit += b.SumRent() - b.getMaintanenceCost() ;
        }

        return profit;
    }



}
