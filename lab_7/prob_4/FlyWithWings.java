package lab_7.prob_4;

public interface FlyWithWings extends Flyable {
	default public void fly() {
		System.out.println("  fly with wings");
	}
}
