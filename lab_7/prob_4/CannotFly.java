package lab_7.prob_4;

public interface CannotFly extends Flyable {
	default public void fly() {
		System.out.println("  cannot fly");
	}
}
