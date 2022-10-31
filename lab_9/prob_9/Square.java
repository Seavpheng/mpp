package lab_9.prob_9;

import java.nio.DoubleBuffer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Square {

    static int count=1;
    public static void printSquares(int num){

        System.out.println( Stream.iterate(1, n-> calcSquare(++count) )
                .limit(num)
                .collect(Collectors.toList()));

    }


//    private static int nextSquare(int n ) {
//        return (int) Math.pow((int) Math.sqrt((n) + 1, 2));
//    }



    public static int calcSquare(int num) {
        return (int)Math.pow(num, 2);
    }

    public static void main(String[] args){
        printSquares(4);

    }
}
