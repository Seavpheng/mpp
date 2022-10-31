package lab_9.prob_10a;

import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Or {

	public static void main(String[] args) {
		List<Simple> list = Arrays.asList(new Simple(false), new Simple(false), new Simple(true));
		System.out.println(new Or().someSimpleIsTrue(list));

		//Question 10B
		Stream<String> stringStream = Stream.of("Bill", "Thomas", "Mary");
		System.out.println(stringStream.collect(Collectors.joining(", ")));

		Supplier<Stream<Integer>> myIntStream = ()->  Stream.of(1,2,3, 4,5,6);

		System.out.println(myIntStream.get().max(Comparator.naturalOrder()).get());
		System.out.println(myIntStream.get().min(Comparator.naturalOrder()).get());
	}
	
	public boolean someSimpleIsTrue(List<Simple> list) {
//		boolean accum = false;
//		for(Simple s: list) {
//			accum = accum || s.flag;
//		}
//		return accum;

		return list.stream().map(x->x.flag).reduce(false, (x, y) -> x || y);
	}

}
