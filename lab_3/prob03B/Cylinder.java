package lab_3.prob03B;

public class Cylinder {
    private double height;
    private double radius;

    Cylinder(double radius, double height){
        this.radius = radius;
        this.height  =height;
    }

    public double getRadius(){
        return radius;
    }
    public double getHeight(){
        return height;
    }

    public double computeVolume(){
         return  getRadius() * getRadius() * Math.PI * getHeight();
    }

}
