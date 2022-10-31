package lab_3.prob03A;

public class Circle extends Cylinder{

    public Circle(double radius){
        super(radius, radius);
    }

    public double computeArea(){
        return  getRadius() * getRadius() * Math.PI;
    }
}
