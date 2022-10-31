package lab_9.prob_4;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.math.BigInteger;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrimeStream {

    final Supplier<Stream<Integer>> streamPrime = ()-> {
        return
                Stream.iterate(2, n -> BigInteger.valueOf(n).nextProbablePrime().intValue());
    };

   void printFirstNPrimes(long n){
       var i = streamPrime.get().limit(n)
               .collect(Collectors.toList());

       System.out.println(i);
    }

    public static void main(String[] args){
        PrimeStream m = new PrimeStream ();

        m.printFirstNPrimes(15);

        m.printFirstNPrimes(5);
    }

}
