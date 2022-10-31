package lab_11.prob_6;

import org.jetbrains.annotations.NotNull;

public class Person implements Comparable<Person> {
	String name;
	public Person(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}


	@Override
	public int compareTo(Person o) {
		return 0;
	}
}
