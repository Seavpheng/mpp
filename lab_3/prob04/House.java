package lab_3.prob04;

public class House extends Properties{
    private double lotSize;

    public House(String city, double lotSize){
        super("", city, "","");
        this.lotSize =lotSize;
    }

    public double getLotSize(){
        return  lotSize;
    }

    public void  setLotSize(double lotSize){
        this.lotSize= lotSize;
    }
    public double rent(){
        return lotSize * 0.1;
    }

    public String toString(){
        return "Lot size: "+lotSize +" in " + super.toString() +" \n";
    }

}
