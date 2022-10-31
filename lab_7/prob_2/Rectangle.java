package lab_7.prob_2;

public final class Rectangle implements ClosedCurve {
	final private double width;
	final private double length;
	
	@Override
	public double computePerimeter() {
		double lenght =  width +width + length + length;
		return lenght;
	}
	public Rectangle(double width, double length) {	
		this.width = width;
		this.length = length;
	}
	
	public double getWidth() {
		return width;
	}
	public double getLength() {
		return length;
	}
}
