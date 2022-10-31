package lab_7.prob_4;

public class RubberDuck extends Duck implements Squeak, CannotFly {
	public RubberDuck() {

	}
	@Override
	public void display() {
		System.out.println("  displaying");

	}
}
