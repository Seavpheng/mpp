package lab_5.prob3;

public class Triangle implements IShape {

    private double base;
    private double height;
    public Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    public double getHeight(){
        return height;
    }

    public double getBase(){
        return base;
    }

    public double computeArea()
    {
        return 1/2 * base * height;
    }
}
