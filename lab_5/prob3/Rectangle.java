package lab_5.prob3;

public class Rectangle implements IShape {
    private double width;
    private double length;
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public double computeArea()
    {
        return width * length;
    }
}
