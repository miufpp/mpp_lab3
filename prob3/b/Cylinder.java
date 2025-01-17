package lab3.prob3.b;

public class Cylinder {
	private double height;
	private Circle base;
	
	public Cylinder(double radius, double height) {
		this.base = new Circle(radius);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	public double getRadius() {
		return base.getRadius();
	}
	
	public double computeVolume() {
		return base.computeArea() * this.height;
	}
}
