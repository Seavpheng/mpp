package lab_7.prob_4;

public class DecoyDuck extends Duck implements MuteQuack, CannotFly {
	public DecoyDuck() {
	}

	@Override
	public void display() {
		System.out.println("  displaying");

	}
}
