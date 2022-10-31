package lab_7.prob_4;

public interface Squeak extends Quackable {
	default public void quack() {
		System.out.println("  squeaking");
	}
}
