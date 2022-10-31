package lab_5.prob3;

public class Main {

    public static void main(String[] agrs){
        IShape[] shape = {
                            new Circle(5),
                            new Triangle(10, 20),
                            new Rectangle(20,10)
                         };
        double sum = 0;
        for(IShape o :shape){

            sum += o.computeArea();
        }

        System.out.println(sum);
    }
}
