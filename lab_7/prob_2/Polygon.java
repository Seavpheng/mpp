package lab_7.prob_2;

public interface Polygon extends ClosedCurve {
    double[] getSides();

    default double computePerimeter(){
        double perimeter = 0;
        for (double side : getSides())
            perimeter += side;

        return perimeter;
    }
}
