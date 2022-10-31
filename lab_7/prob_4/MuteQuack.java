package lab_7.prob_4;

public interface MuteQuack extends Quackable {
	default public void quack() {
		System.out.println("  cannot quack");
	}
}
