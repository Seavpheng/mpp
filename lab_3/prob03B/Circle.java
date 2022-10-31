package lab_3.prob03B;

public class Circle  {

    private Cylinder cylinder;
    public Circle(double radius){
        cylinder = new Cylinder(radius, 0);
    }

    public double computeArea(){
        return  cylinder.getRadius() * cylinder.getRadius() * Math.PI;
    }
}
