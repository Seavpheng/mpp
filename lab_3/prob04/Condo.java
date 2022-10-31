package lab_3.prob04;

public class Condo extends Properties{
    private int numFloors;

    private double rent = 400;
    public Condo(String city, int numFloors){
        super("", city, "","");
        this.numFloors = numFloors;
    }

    public int getNumFloors(){
        return numFloors;
    }

    public void setNumFloors(int numFloors){
        this.numFloors =numFloors;
    }

    public double rent(){
        return rent * numFloors;
    }

    public String toString(){
        return "Number of floor: " + numFloors +" in " + super.toString() +" \n";
    }
}
