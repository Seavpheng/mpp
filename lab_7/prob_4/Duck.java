package lab_7.prob_4;

public abstract class Duck implements Flyable, Quackable   {
	public abstract void display();

	public void swim() {
		System.out.println("  swimming");
	}
	
}
