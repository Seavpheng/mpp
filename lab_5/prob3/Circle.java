package lab_5.prob3;

public class Circle implements IShape{
    private double radius ;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    public double computeArea()
    {
        return Math.PI * radius * radius;
    }

}
