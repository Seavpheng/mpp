package lab_7.prob_4;

public interface Quack extends Quackable {
	default public void quack() {
		System.out.println("  quacking");
	}
}
