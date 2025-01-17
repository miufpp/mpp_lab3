package lab3.prob3.a;

public class Circle extends Cylinder{
	private double radius;
	public Circle(double radius, double height) {
		super(radius, height);
		this.radius = radius;
	}

	public double computeArea() {
		return Math.PI* super.getRadius() * super.getRadius();
	}
	
}
