package lab_7.prob_2;

public class Ellipse implements ClosedCurve {

    private final double a;
    private final double E;
    Ellipse(double  a, double E)
    {
        this.a= a;
        this.E = E;
    }

    public double getA(){
        return a;
    }

    public double getE(){
        return E;
    }

    @Override
    public double computePerimeter() {
        return 4 * a * E;
    }


}
