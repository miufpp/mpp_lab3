package lab3.prob3.a;

public class Circle extends Cylinder{

	public Circle(double radius, double height) {
		super(radius, height);
	}

	public double computeArea() {
		return Math.PI* super.getRadius() * super.getRadius();
	}
	
}
